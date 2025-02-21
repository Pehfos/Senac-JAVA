package service;

import java.util.List;
import dao.TarefaDAO;
import model.Tarefa;

public class TarefaService {
	public List<Tarefa> listar(){
		TarefaDAO dao = new TarefaDAO();
		return dao.listar();
	}
	
	public Tarefa consultarId(Integer id) {
		TarefaDAO dao = new TarefaDAO();
		return dao.consultarId(id);
	}
	
	public List<Tarefa> consultarDescricao(String descricao) {
		TarefaDAO dao = new TarefaDAO();
		return dao.consultarDescricao(descricao);
	}
}