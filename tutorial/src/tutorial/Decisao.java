package tutorial;

import java.util.Date;

public class Decisao {

	public static void main(String[] args) {
		int idade = 20;
		String nome = "pedro";
		
		Date x = new Date();
		
		idade = idade + 5;
		idade += 2; // Same use as above but quicker.
		idade++; // Increments 1.
		idade--; // Reduces 1.
		
		
		if (nome != "Pedro") {
			System.out.println("Nome incorreto!");
		}
		
		if (nome == "Pedro" || nome == "pedro") {
			System.out.println("Usuário autenticado!");
		} else {
			System.out.println("Usuario inválido.");
		}
		
		if (idade < 25) {
			System.out.println("Você não pode entrar aqui...");
		}
		
		if (idade < 25) {
			System.out.println("Você não pode entrar aqui...");
		} else {
			System.out.println("Seja bem vindo!");
		}
		
		if (idade < 15) {
			System.out.println("Vai pra casa!");
		} else if (idade < 25){
			System.out.println("Você não pode entrar aqui...");
		} else {
			System.out.println("Seja bem vindo!");
		}
	}

}
