package UFC;

public class PesoPena extends Lutador {
	public PesoPena(String nome, int idade, double peso) {
		super(nome, idade, peso);
	}
	
	public String categoriaLutador() {
		return "Peso Pena";
	}
}
