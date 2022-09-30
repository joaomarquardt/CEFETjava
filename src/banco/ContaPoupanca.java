package banco;

public class ContaPoupanca extends Conta {
	private int oi;
	
	public ContaPoupanca(int numero, double saldo, double limite) {
		super(numero, saldo, limite);
	}
}
