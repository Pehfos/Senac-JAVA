import java.util.Scanner;

public class AppTarefa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("----- MENU PRINCIPAL -----");
		System.out.println("1 - Inclusão de tarefa");
		System.out.println("2 - Consulta de tarefa");
		System.out.println("3 - Alteração de tarefa");
		System.out.println("4 - Exclusão de tarefa");
		System.out.println("0 - F I M");
		System.out.println("Digite a opçao desejada:");
		int opcao = scanner.nextInt(); 
			
		while (opcao > 0) {
		if (opcao == 1) {
			System.out.println("Escolhido opção 1");
			System.out.println("----- MENU PRINCIPAL -----");
			System.out.println("1 - Inclusão de tarefa");
			System.out.println("2 - Consulta de tarefa");
			System.out.println("3 - Alteração de tarefa");
			System.out.println("4 - Exclusão de tarefa");
			System.out.println("0 - F I M");
			System.out.println("Digite a opçao desejada:");
			opcao = scanner.nextInt();
		} else if (opcao == 2){
			System.out.println("Escolhido opção 2");
			System.out.println("----- MENU PRINCIPAL -----");
			System.out.println("1 - Inclusão de tarefa");
			System.out.println("2 - Consulta de tarefa");
			System.out.println("3 - Alteração de tarefa");
			System.out.println("4 - Exclusão de tarefa");
			System.out.println("0 - F I M");
			System.out.println("Digite a opçao desejada:");
			opcao = scanner.nextInt();
		} else if (opcao == 3) {
			System.out.println("Escolhido opção 3");
			System.out.println("----- MENU PRINCIPAL -----");
			System.out.println("1 - Inclusão de tarefa");
			System.out.println("2 - Consulta de tarefa");
			System.out.println("3 - Alteração de tarefa");
			System.out.println("4 - Exclusão de tarefa");
			System.out.println("0 - F I M");
			System.out.println("Digite a opçao desejada:");
			opcao = scanner.nextInt();
		} else if (opcao == 4) {
			System.out.println("Escolhido opção 4");
			System.out.println("----- MENU PRINCIPAL -----");
			System.out.println("1 - Inclusão de tarefa");
			System.out.println("2 - Consulta de tarefa");
			System.out.println("3 - Alteração de tarefa");
			System.out.println("4 - Exclusão de tarefa");
			System.out.println("0 - F I M");
			System.out.println("Digite a opçao desejada:");
			opcao = scanner.nextInt();
		} else if (opcao  == 0) {
			System.out.println("Escolhido opção 0, operação finalizada");
		} else {
			System.out.println("Opção invalida");
			System.out.println("Escolhido opção 4");
			System.out.println("----- MENU PRINCIPAL -----");
			System.out.println("1 - Inclusão de tarefa");
			System.out.println("2 - Consulta de tarefa");
			System.out.println("3 - Alteração de tarefa");
			System.out.println("4 - Exclusão de tarefa");
			System.out.println("0 - F I M");
			System.out.println("Digite a opçao desejada:");
			opcao = scanner.nextInt();
		}
			
		}
	}

}
