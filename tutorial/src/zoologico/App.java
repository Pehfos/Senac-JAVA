package zoologico;

public class App {

	public static void main(String[] args) {
		Gato gato = new Gato();
		Cachorro cao = new Cachorro();
		Jacare jaca = new Jacare();
		
		jaca.setNome("Jacaré");
		jaca.setPeso(50);
		jaca.setRaca("Papo Amarelo");
		System.out.println(jaca.getNome());
		jaca.brincar();
		System.out.println(jaca.getPeso() + "\n");
		
		cao.setNome("Cachorro");
		System.out.println(cao.getNome());
		cao.brincar();
		cao.setPeso(5);
		
		gato.setNome("Gato");
		gato.setCor("Branco");
		gato.setRaca("Vira lata");
		gato.setPeso(6);
		

	}

}
