package listaEx3;

public class ContaBancaria {
	
	Data d = new Data();
	private double saldo = 0.0;
	private Data dataAbertura;
	
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setDataAbertura(int dia, int mes, int ano) {
		d.setDia(dia);
		d.setMes(mes);
		d.setAno(ano);
	}
	
	public Data getDataAbertura() {
		return dataAbertura;
	}
	
	public String getDataAberturaFormatada() {
		return d.getDia() + "/" + d.getMes() + "/" + d.getAno();
	}
	
	public String getSaldoFormatado() {
		return "R$" + getSaldo();
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		if (valor > getSaldo()) {
			System.out.println("[ERRO] O valor a ser sacado é maior que o saldo disponível na conta.");
		} else {
			double saldoAgr = getSaldo() - valor;
			setSaldo(saldoAgr);
			System.out.println("Operação aceita.");
			System.out.println("Seu saldo agora é de: " + getSaldoFormatado());
		}
	}
}
