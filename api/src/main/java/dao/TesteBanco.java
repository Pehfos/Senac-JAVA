package dao;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;
import model.Tarefa;
import service.TarefaService;

public class TesteBanco {

	public static void main(String[] args) {
		TarefaService service = new TarefaService();
		TarefaDAO tarefaDAO = new TarefaDAO();
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		Tarefa tarefa = new Tarefa();
		/*
		System.out.println(Dao.getStatusConexao());
		Connection conexao = Dao.getConexao();
		System.out.println(Dao.getStatusConexao());
		Dao.fecharConexao();
		
		List<Tarefa> lista =  service.listarTarefa();
		*/
		
		/*
		System.out.println("-----------------------------------------------");
		System.out.println("Digite o Id da Tarefa que deseja consultar: ");
		int X = scanner.nextInt();
		System.out.println(service.consultarId(X));
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("-----------------------------------------------");
		System.out.println("Digite a primeira letra da Descrição da Tarefa que deseja consultar: ");
		String Z = scanner2.nextLine();
		List<Tarefa> lista2 = service.consultarDescricao(Z);
		for(Tarefa a: lista2) {
			System.out.println(a);
		}
		*/
		/*Tarefa tarefaIncluir = new Tarefa();
		tarefaIncluir.setDescricao("Comer biscoito");
		tarefaIncluir.setPrazo(5);
		tarefaIncluir.setFinalizada(false);
		
		if(service.incluirTarefa(tarefaIncluir)) {
			System.out.println("Registro incluido com sucesso");
		} else {
			System.out.println("Ocorreu algum erro");
		}*/
		
		List<Tarefa> lista = service.listarTarefa();
		System.out.println("Digite o Id da tarefa que deseja excluir: ");
		int inputId = scanner.nextInt();
		tarefa = service.consultarId(inputId);
		
		/*
		System.out.println("Digite o que deseja alterar: ");
		System.out.println("1 - Descrição, 2 - Prazo, 3 - Prazo");
		int escolha = scanner2.nextInt();
		
		if(escolha == 1) {
			Scanner descricao = new Scanner(System.in);
			System.out.println("Digite a Descrição: ");
			String valorDescricao = descricao.nextLine();
			tarefa.setDescricao(valorDescricao);
		} else if (escolha == 2) {
			Scanner prazo = new Scanner(System.in);
			System.out.println("Digite o Prazo: ");
			int valorPrazo = prazo.nextInt();
			tarefa.setPrazo(valorPrazo);
		} else {
			Scanner finalizada = new Scanner(System.in);
			System.out.println("Digite o Status: ");
			Boolean valorFinalizada = finalizada.nextBoolean();
			tarefa.setFinalizada(valorFinalizada);
		}
		
		if(service.alterarTarefa(tarefa)) {
			System.out.println("Alterado com sucesso!");
		} else {
			System.out.println("Ocorreu um erro.");
		}
	*/}
	
}
