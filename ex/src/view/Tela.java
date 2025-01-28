package view;

import java.util.Scanner;

import model.Tarefa;

public class Tela {	
	Tarefa tarefa = new Tarefa();
	Scanner teclado = new Scanner(System.in);
	
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
		
		return tarefa;
	}
	
	public void exibirConsulta() { 
		System.out.println("C O N S U L T A");
		System.out.println("Descrição: " +tarefa.getDescricao());
		System.out.println("Prazo: "+tarefa.getPrazo());
		System.out.println("Finalizada: "+tarefa.isFinalizada());
		
	}
	
	public Tarefa exibirAlteracao() {
		System.out.println("A L T E R A Ç Ã O");
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
		
		return tarefa;
	}
	
	public void exibirExclusao() {
		System.out.println("E X C L U S Ã O");
		System.out.println("Qual opção deseja excluir?");
		System.out.println("Digite 1 para excluir Descrição." + "\n" + "Digite 2 para excluir Prazo" + "\n" + "Digite 3 para excluir Status.");
		int numero = teclado.nextInt();
		
		if(numero == 1) {
			tarefa.setDescricao(null);
			System.out.println("Descrição excluida.");
		} else if(numero == 2) {
			tarefa.setPrazo(0);
			System.out.println("Prazo excluido.");
		} else if(numero == 3) {
			tarefa.setFinalizada(false);
			System.out.println("Status excluido.");
		}
		
	}
}
