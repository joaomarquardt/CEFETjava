package UFC;
import java.util.ArrayList;
import java.util.Random;

public abstract class Lutador {
	private String nome;
	private int idade;
	private double peso;
	
	public Lutador(String nome, int idade, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String toString() {
		return this.nome + "/" + this.idade + "/" + this.peso + "kg";
	}
	
	public boolean possiveisLutas(Lutador [] lutadores) {
		int possLutas = 0;
		for (int c = 0; c < lutadores.length; c++) {
			if (this.getClass().equals(lutadores[c].getClass()) && this != lutadores[c]) {
				System.out.println(lutadores[c]);
				possLutas += 1;
			}
		}
		if (possLutas == 0) {
			System.out.println("Não há nenhum lutador que preencha os requisitos necessários para tal confronto.");
			return false;
		} else {
			return true;
		}
	}
	
	public abstract String categoriaLutador();
	
	public Lutador sorteioLuta(Lutador [] lutadores) {
		ArrayList x = new ArrayList();
		for (int c = 0; c < lutadores.length; c++) {
			if (this.getClass().equals(lutadores[c].getClass()) && this != lutadores[c]) {
				x.add(lutadores[c]);
			}
		}
		int valor = new Random().nextInt(x.size() - 1) + 0;
		return (Lutador) x.get(valor);
	}
}