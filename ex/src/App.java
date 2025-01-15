import model.Tarefa;

public class App {

	public static void main(String[] args) {
		Tarefa tarefa = new Tarefa();
		
		tarefa.setId(1);
		tarefa.setDescricao("Entregar guitarra para João");
		tarefa.setPrazo(10);
		tarefa.setFinalizada(true);
		
		System.out.println(tarefa.getId());
		System.out.println(tarefa.getDescricao());
		System.out.println(tarefa.getPrazo());
		System.out.println(tarefa.isFinalizada());
	}

}