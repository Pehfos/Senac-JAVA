import java.util.Scanner;

import controller.Controller;
import view.Tela;

public class AppTarefa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Tela tela = new Tela();
		Controller controla = new Controller();
		
		int opcao = 0; 
		
		do {
			tela.exibirMenu();
			
			opcao = scanner.nextInt();
			
			controla.verificarOpcao(opcao);
			
			} while (opcao != 0);
		scanner.close();
	}

}
