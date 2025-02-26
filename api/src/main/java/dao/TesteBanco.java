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
		/*
		System.out.println(Dao.getStatusConexao());
		Connection conexao = Dao.getConexao();
		System.out.println(Dao.getStatusConexao());
		Dao.fecharConexao();
		*/
		List<Tarefa> lista =  service.listarTarefa();
		
		
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
		
		
	}

}
