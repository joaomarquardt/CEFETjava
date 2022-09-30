package banco;

public class ContaCorrente extends Conta implements Tributavel {
	public ContaCorrente(int numero, double saldo, double limite) {
		super(numero, saldo, limite);
	}
	
	public double calculaTributos() {
		//return super.setSaldo(10);
		return 10.5;
	}
}
