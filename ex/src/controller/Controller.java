package controller;

import view.Tela;

public class Controller {
	Tela tela = new Tela();
	public void verificarOpcao(int opcao) {
		
		if (opcao == 1) {
			tela.exibirInclusao();
		} else if (opcao == 2) {
			tela.exibirConsulta();
		} else if (opcao == 3) {
			tela.exibirAlteracao();
		} else if (opcao == 4) {
			tela.exibirExclusao();
		} else if (opcao == 0) {
			System.out.println("Aplicação encerrada.");
		} else {
			System.out.println("Opção digitada inválida.");
		}
	}
}
