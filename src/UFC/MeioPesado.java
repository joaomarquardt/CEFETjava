package UFC;

public class MeioPesado extends Lutador {
	public MeioPesado(String nome, int idade, double peso) {
		super(nome, idade, peso);
	}
	
	public String categoriaLutador() {
		return "Meio Pesado";
	}
}
