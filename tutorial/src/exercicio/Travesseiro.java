package exercicio;

public class Travesseiro {
	private String cor;
	private String tamanho;
	private String formato;
	private String material;
	private double peso;

	public Travesseiro(String cor, String tamanho, String formato, String material, double peso){
		this.cor = cor;
		this.tamanho = tamanho;
		this.formato = formato;
		this.material = material;
		this.peso = peso;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return this.tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getFormato() {
		return this.formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getMaterial() {
		return this.material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String toString(){
		return "Travesseiro[cor="+cor+", tamanho="+tamanho+", formato="+formato+", material="+material+", peso="+peso+"]";
	}

	//Não consegui fazer o método condicional abaixo funcionar, dei uma olhada nas funções boleanas e nas condicionais mas não consegui fazer o que queria aqui.

	//String sim = "Sim";

	public void afofar(){
		//if (sim == "Sim") {
			System.out.println("O travesseiro foi afofado.");
		//} else {
			//System.out.println("O travesseiro não foi afoado.");
		//}
	}

	public void cair(){
		System.out.println("O travesseiro caiu.");
	}
	
	public void jogar(){
		System.out.println("O travesseiro foi jogado.");
	}
	
	public void amassar(){
		System.out.println("O travesseiro foi amassado.");
	}
}
