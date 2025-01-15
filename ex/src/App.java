import model.Tarefa;
import model.Tarefa2;
import model.Tarefa3;
import model.Tarefa4;
import model.Tarefa5;
import model.Tarefa6;
import model.Tarefa7;
import model.Tarefa8;
import model.Tarefa9;
import model.Tarefa10;

public class App {

	public static void main(String[] args) {
		Tarefa tarefa = new Tarefa();
		Tarefa2 tarefa2 = new Tarefa2();
		Tarefa3 tarefa3 = new Tarefa3();
		Tarefa4 tarefa4 = new Tarefa4();
		Tarefa5 tarefa5 = new Tarefa5();
		Tarefa6 tarefa6 = new Tarefa6();
		Tarefa7 tarefa7 = new Tarefa7();
		Tarefa8 tarefa8 = new Tarefa8();
		Tarefa9 tarefa9 = new Tarefa9();
		Tarefa10 tarefa10 = new Tarefa10();
				
		tarefa.setId(1);
		tarefa.setDescricao("Entregar guitarra para João");
		tarefa.setPrazo(10);
		tarefa.setFinalizada(false);
		
		tarefa2.setId(2);
		tarefa2.setDescricao("Devolver cadeira de Emerson");
		tarefa2.setPrazo(7);
		tarefa2.setFinalizada(false);

		tarefa3.setId(3);
		tarefa3.setDescricao("Depositar dinheiro");
		tarefa3.setPrazo(6);
		tarefa3.setFinalizada(false);

		tarefa4.setId(4);
		tarefa4.setDescricao("Comprar cabo de rede");
		tarefa4.setPrazo(7);
		tarefa4.setFinalizada(false);

		tarefa5.setId(5);
		tarefa5.setDescricao("Mover PCs do RH");
		tarefa5.setPrazo(3);
		tarefa5.setFinalizada(false);

		tarefa6.setId(6);
		tarefa6.setDescricao("Trocar SSD do PC da SEMET");
		tarefa6.setPrazo(3);
		tarefa6.setFinalizada(false);

		tarefa7.setId(7);
		tarefa7.setDescricao("Procurar Nemo");
		tarefa7.setPrazo(14);
		tarefa7.setFinalizada(false);

		tarefa8.setId(8);
		tarefa8.setDescricao("Lavar a louça");
		tarefa8.setPrazo(1);
		tarefa8.setFinalizada(false);

		tarefa9.setId(9);
		tarefa9.setDescricao("Inscrever no concurso");
		tarefa9.setPrazo(17);
		tarefa9.setFinalizada(false);

		tarefa10.setId(10);
		tarefa10.setDescricao("Jogar materiais fora");
		tarefa10.setPrazo(30);
		tarefa10.setFinalizada(false);
		
		System.out.println(tarefa.getId() + ", " + tarefa.getDescricao() + ", " + tarefa.getPrazo() + ", " + tarefa.isFinalizada());
		System.out.println(tarefa2.getId() + ", " + tarefa2.getDescricao() + ", " + tarefa2.getPrazo() + ", " + tarefa2.isFinalizada());
		System.out.println(tarefa3.getId() + ", " + tarefa3.getDescricao() + ", " + tarefa3.getPrazo() + ", " + tarefa3.isFinalizada());
		System.out.println(tarefa4.getId() + ", " + tarefa4.getDescricao() + ", " + tarefa4.getPrazo() + ", " + tarefa4.isFinalizada());
		System.out.println(tarefa5.getId() + ", " + tarefa5.getDescricao() + ", " + tarefa5.getPrazo() + ", " + tarefa5.isFinalizada());
		System.out.println(tarefa6.getId() + ", " + tarefa6.getDescricao() + ", " + tarefa6.getPrazo() + ", " + tarefa6.isFinalizada());
		System.out.println(tarefa7.getId() + ", " + tarefa7.getDescricao() + ", " + tarefa7.getPrazo() + ", " + tarefa7.isFinalizada());
		System.out.println(tarefa8.getId() + ", " + tarefa8.getDescricao() + ", " + tarefa8.getPrazo() + ", " + tarefa8.isFinalizada());
		System.out.println(tarefa9.getId() + ", " + tarefa9.getDescricao() + ", " + tarefa9.getPrazo() + ", " + tarefa9.isFinalizada());
		System.out.println(tarefa10.getId() + ", " + tarefa10.getDescricao() + ", " + tarefa10.getPrazo() + ", " + tarefa10.isFinalizada());
	}
}