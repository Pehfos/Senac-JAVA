package view;

import java.util.ArrayList;
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
		System.out.println("0 - F I M");
		System.out.println("Digite a opçao desejada:");
	}
	

	
	public Tarefa exibirInclusao() {
		Scanner teclado = new Scanner(System.in);
		Tarefa tarefa = new Tarefa();
		List<Tarefa> tarefas = new ArrayList<>();
		
		System.out.println("I N C L U S Ã O");
		System.out.println("Descrição: ");
		tarefa.setDescricao(teclado.nextLine()); 
        System.out.println("Prazo: ");
        tarefa.setPrazo(teclado.nextInt());
        System.out.println("Finalizada (S/N)? ");
        String status = teclado.next();
        
        if(status.equals("S") || status.equals("s")) {
            tarefa.setFinalizada(true);
        } else if(status.equals("N") || status.equals("n")) {
            tarefa.setFinalizada(false);
        } else {
            System.out.println("Digite S ou N");
        }
	
		tarefas.add(tarefa);
		return tarefa;
		
	}
	
	public void exibirConsulta(Tarefa tarefa) { 
		System.out.println("C O N S U L T A");
		System.out.println(tarefa);
		
	}
	
	public Tarefa exibirAlteracao(Tarefa tarefa) {
		Scanner teclado = new Scanner(System.in);
		Scanner menu = new Scanner(System.in);
				
		System.out.println("O que deseja alterar?" + "\n" + "1 - Descrição" + "\n" + "2 - Prazo" + "\n" + "3 - Status");
		
		int opcao = menu.nextInt();
		if(opcao == 1) {
			System.out.println("Digite a nova Descrição (" + tarefa.getDescricao() + "): ");
			tarefa.setDescricao(teclado.nextLine());
			System.out.println("Descrição alterada.");
		} else if(opcao == 2) {
			System.out.println("Digite o novo Prazo (" + tarefa.getPrazo() + "): ");
			tarefa.setPrazo(teclado.nextInt());
			System.out.println("Prazo alterado.");
		} else if(opcao == 3) {
			System.out.println("Digite o novo Status (S/N) ((" + tarefa.isFinalizada() + ")): ");
			String status = teclado.next();
			
			if(status.equals("S") || status.equals("s")) {
				tarefa.setFinalizada(true);
				System.out.println("Status alterado.");
			} else if(status.equals("N") || status.equals("n")) {
				tarefa.setFinalizada(false);
				System.out.println("Status alterado.");
			} else {
				System.out.println("Digite S ou N");
			} 
		} else {
			System.out.println("Opção inválida.");
		}
		
		return tarefa;
	}
	
	public Tarefa exibirExclusao(Tarefa tarefa) {
		tarefa.setDescricao("");
		tarefa.setPrazo(0);
		tarefa.setFinalizada(false);
		System.out.println("Tarefa excluída.");
		
		return tarefa;
		
	}
}
