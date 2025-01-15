package registros;

public class App {

	public static void main(String[] args) {
		Tarefas tarefas = new Tarefas();
		
		tarefas.setDescricao("Entregar guitarra para João");
		tarefas.setPrazo(10);
		tarefas.setFinalizado(true);
		
		System.out.println(tarefas.getDescricao());
		System.out.println(tarefas.getPrazo());
		System.out.println(tarefas.isFinalizado());
	}

}
