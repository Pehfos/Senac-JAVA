import java.util.ArrayList;
import java.util.List;

public class AppArray {

	public static void main(String[] args) {
		String nome1 = "Gustavo";
		String nome2 = "Vanessa";
		String nome3 = "Antonio";
		
		List<String> nomes = new ArrayList<String>();
		
		nomes.add("Tatiane");
		nomes.add("Pedro");
		nomes.add("Mauro");
		
		for(String n: nomes) {
			System.out.println(n);
		}
	}

}
