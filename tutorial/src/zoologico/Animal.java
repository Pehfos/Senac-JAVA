package zoologico;

public class Animal {
	private String cor;
	private String raca;
	private double peso;
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		if(peso < 0) {
			this.peso = 1;
			System.out.println("O valor foi alterado para 1 pois você passou um valor inválido.");
		} else {
		this.peso = peso;
		}
	}
	
	public void brincar() {
		System.out.println("brincando...");
	}
	
}
