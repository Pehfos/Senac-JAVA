package service;

import java.util.List;
import dao.TarefaDAO;
import model.Tarefa;

public class TarefaService {
	public boolean incluirTarefa(Tarefa tarefa) {
		TarefaDAO dao = new TarefaDAO();
		return dao.incluir(tarefa);
	}
	
	public List<Tarefa> listarTarefa(){
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
	
	public boolean alterarTarefa(Tarefa tarefa) {
		TarefaDAO dao = new TarefaDAO();
		return dao.alterar(tarefa);
	}
	
	public boolean excluirTarefa(Tarefa tarefa) {
		TarefaDAO dao = new TarefaDAO();
		return dao.excluir(tarefa);
	}
}