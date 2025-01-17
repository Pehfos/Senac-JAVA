
public class AppLoop {

	public static void main(String[] args) {
		// loop for
		for(int i = 0; i < 20; i++) {
			System.out.println(i + " Meus alunos são desanimados!");
		}
		
		// while
		boolean acao = false;
		
		while(acao == true) {
			System.out.println("Outro loop");
			acao = false;
		}
		
		//do..while
		do {
			System.out.println("Este é loop do");
		} while(acao == true);
		
		/*
		 * números pares até 100
		 */
		int limite = 100;
		for(int p = 0; p <= limite; p+=2) {	
			
			String valor = p < limite ? p + ", " : p + ".";
			
			System.out.print(valor);
			
		}
	}
	
}
