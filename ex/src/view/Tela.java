package view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import model.Tarefa;

public class Tela {
	public void exibirMenu() {
		System.out.println("----- MENU PRINCIPAL -----");
		System.out.println("1 - Inclusão de tarefa");
		System.out.println("2 - Consulta de tarefa");
		System.out.println("3 - Alteração de tarefa");
		System.out.println("4 - Exclusão de tarefa");
		System.out.println("9 - Carga de dados de teste");
		System.out.println("0 - F  I  M");
		System.out.println("Digite a opção desejada:");
	}
	
	public Tarefa exibirInclusao(int indice) {
		Scanner teclado = new Scanner(System.in);
		Tarefa tarefa = new Tarefa();
		
		tarefa.setId(indice);
		System.out.println("I N C L U S Ã O");
		System.out.println("Descrição : ");
		tarefa.setDescricao(teclado.nextLine());
		System.out.println("Prazo : ");
		tarefa.setPrazo(teclado.nextInt());
		System.out.println("Finalizada (S/N)? ");
		String status = teclado.next();
		
		if(status.equals("S") || status.equals("s")) {
			tarefa.setFinalizada(true);	
		} else {
			tarefa.setFinalizada(false);
		}
		
		return tarefa;
	}
	
	public void exibirTarefa(List<Tarefa> tarefas, String titulo) {
		System.out.println(titulo);
		
		for(Tarefa item: tarefas) {
			System.out.println(item);
			System.out.println("--------------------------------------------");
		}
	}
	
	public List<Tarefa> exibirAlteracao(List<Tarefa> tarefas) {
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);

		exibirTarefa(tarefas, "A L T E R A Ç Ã O");
		System.out.println("Digite o id da tarefa que deseja alterar: ");
		int x = teclado.nextInt();
		Tarefa y = null;
		
		try {
			y = buscarTarefa(tarefas, x);
			
			if(y == null) {
				System.out.println("Id inexistente, digite um Id válido.");
				
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Entrada invalida.");
		}
		
		
		int z;
		do {
			System.out.println(y);
			System.out.println("O que deseja alterar?");
			System.out.println("1 - Descrição");
			System.out.println("2 - Prazo");
			System.out.println("3 - Status");
			System.out.println("0 - Cancelar");
			
			z = teclado.nextInt();
			if(z == 1) {
				System.out.println("Nova Descrição: ");
				String input = teclado2.nextLine();
				y.setDescricao(input);
			} else if (z == 2) {
				System.out.println("Novo Prazo: ");
				y.setPrazo(teclado.nextInt());
			} else if(z == 3) {
				System.out.println("Nova Finalizada (S/N): ");
				String status = teclado.next();
				
				if(status.equals("S") || status.equals("s")) {
					y.setFinalizada(true);	
				} else {
					y.setFinalizada(false);
				}
			} else if(z == 0) {
				System.out.println("Alteração cancelada.");
			} else {
				System.out.println("Opção inválida.");
			}
		} while(z != 0);
		return tarefas;
	}
	
	public List<Tarefa> exibirExclusao(List<Tarefa> tarefas) {
		Scanner teclado = new Scanner(System.in);

		exibirTarefa(tarefas, "E X C L U S Ã O");
		
		System.out.println("Digite o Id da tarefa que deseja excluir: ");
		int x = teclado.nextInt();
		Tarefa y = null;
		
		try {
			y = buscarTarefa(tarefas, x);
			
			if(y == null) {
				System.out.println("Id inexistente, digite um Id válido.");
			} else {
				System.out.println("Tarefa excluida!");
			}
		} catch (InputMismatchException e) {
			System.out.println("Entrada invalida.");
		}
		
		tarefas.remove(y);

		return tarefas;
	}
	
	public Tarefa buscarTarefa(List<Tarefa> tarefas, int id) {
		Tarefa y = null;
		for(Tarefa tarefa: tarefas) {
			if(tarefa.getId() == id) {
				y = tarefa;
				break;
			}
		}
		
		return y;
	}
}