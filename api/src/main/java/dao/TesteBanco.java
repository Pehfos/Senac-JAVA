package dao;

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
		
		List<Tarefa> lista =  service.listar();
		
		for(Tarefa t: lista) {
			System.out.println(t);
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Digite o Id da Tarefa que deseja consultar: ");
		int X = scanner.nextInt();
		System.out.println(service.consultarId(X));
		*/
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("-----------------------------------------------");
		System.out.println("Digite a primeira letra da Descrição da Tarefa que deseja consultar: ");
		String Z = scanner2.nextLine();
		List<Tarefa> lista2 = service.consultarDescricao(Z);
		for(Tarefa a: lista2) {
			System.out.println(a);
		}
	}

}
