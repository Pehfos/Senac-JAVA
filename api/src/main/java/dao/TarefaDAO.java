package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Tarefa;

public class TarefaDAO {
	public boolean incluir(Tarefa tarefa) {
		boolean status = false;
		Connection cnx = Dao.getConexao();
		 
		StringBuilder QUERY = new StringBuilder();
		QUERY.append("INSERT INTO tarefas(descricao, prazo, finalizada) ");
		QUERY.append("VALUES (?, ?, ?)");
		
		PreparedStatement ps;
		
		try {
			ps = cnx.prepareStatement(QUERY.toString());
			
			ps.setString(1, tarefa.getDescricao());
			ps.setInt(2, tarefa.getPrazo());
			ps.setBoolean(3, tarefa.getFinalizada());
			
			int x = ps.executeUpdate();
			
			status = x > 0 ? true : false; //Other method of building an if function.
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return status;
	}
	
	public List<Tarefa> listar(){
		List<Tarefa> lista = new ArrayList<Tarefa>();
		Tarefa tarefa = null;
		Connection cnx = Dao.getConexao();
		
		String SQL = "SELECT * FROM tarefas";
		
		PreparedStatement ps;
		
		try {
			ps = cnx.prepareStatement(SQL);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				tarefa = new Tarefa();
				
				tarefa.setId(rs.getInt("id"));
				tarefa.setDescricao(rs.getString("descricao"));
				tarefa.setPrazo(rs.getInt("prazo"));
				tarefa.setFinalizada(rs.getBoolean("finalizada"));
				
				lista.add(tarefa);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for(Tarefa t: lista) {
			System.out.println(t);
		}
		
		return lista;
	}
	
	public Tarefa consultarId(Integer id){
		Connection cnx = Dao.getConexao();
		Tarefa tarefa = null;
		
		String SQL = "SELECT * FROM tarefas WHERE id = ?";
		
		
		PreparedStatement ps;
		
		try {
			ps = cnx.prepareStatement(SQL);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				tarefa = new Tarefa();
				
				tarefa.setId(rs.getInt("id"));
				tarefa.setDescricao(rs.getString("descricao"));
				tarefa.setPrazo(rs.getInt("prazo"));
				tarefa.setFinalizada(rs.getBoolean("finalizada"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tarefa;
		
	}
	
	public List<Tarefa> consultarDescricao(String descricao){
		Connection cnx = Dao.getConexao();
		List<Tarefa> lista = new ArrayList<Tarefa>();
		Tarefa tarefa = null;
		
		String SQL = "SELECT * FROM tarefas WHERE descricao LIKE ?";
		
		
		PreparedStatement ps;
		
		try {
			ps = cnx.prepareStatement(SQL);
			ps.setString(1, descricao + "%");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				tarefa = new Tarefa();
				
				tarefa.setId(rs.getInt("id"));
				tarefa.setDescricao(rs.getString("descricao"));
				tarefa.setPrazo(rs.getInt("prazo"));
				tarefa.setFinalizada(rs.getBoolean("finalizada"));
				
				lista.add(tarefa);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public boolean alterar(Tarefa tarefa) {
		boolean status = false;
		Connection cnx = Dao.getConexao();
		StringBuilder QUERY = new StringBuilder();
		
		QUERY.append("UPDATE tarefas SET descricao = ?, prazo = ?, finalizada = ? WHERE id = ?");
		
		PreparedStatement ps;
		
		try {
			System.out.println("Digite o Id da tarefa que deseja alterar: ");
			ps = cnx.prepareStatement(QUERY.toString());

			ps.setString(1, tarefa.getDescricao());
			ps.setInt(2, tarefa.getPrazo());
			ps.setBoolean(3, tarefa.getFinalizada());
			ps.setInt(4, tarefa.getId());
			
			int x = ps.executeUpdate();
			
			status = x > 0 ? true : false;
			
			System.out.println("Sua tarefa foi alterada!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public boolean excluir(Tarefa tarefa) {
		boolean status = false;
		Connection cnx = Dao.getConexao();
		 
		String SQL = "DELETE FROM tarefas WHERE id = ?";
		
		PreparedStatement ps;
		
		try {
			
			ps = cnx.prepareStatement(SQL);
			
			ps.setInt(1, tarefa.getId());
			
			int x = ps.executeUpdate();
			
			status = x > 0 ? true : false; 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Tarefa excluída!");
		return status;
	}
}
