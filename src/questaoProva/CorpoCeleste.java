package questaoProva;

public class CorpoCeleste {
	private String id;
	private String nome;
	private double distancia;
	
	public CorpoCeleste(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	public boolean equals(Object o) {
		if (o instanceof CorpoCeleste) {
			CorpoCeleste c = (CorpoCeleste) o;
			if (this.getId().equals(c.getId())) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return "\n(id): " + id + "\n(nome): " + nome + "\n(distancia): " + distancia;
	}
}