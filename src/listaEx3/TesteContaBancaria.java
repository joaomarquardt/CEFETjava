package listaEx3;
import java.util.Scanner;

public class TesteContaBancaria {
	public static void main(String[] args) {
		ContaBancaria banco = new ContaBancaria();
		Scanner sc = new Scanner(System.in);
		int dia;
		int mes;
		int ano;
		System.out.println(" == DATA DE ABERTURA DA CONTA == ");
		System.out.println("Dia: ");
		dia = sc.nextInt();
		System.out.println("Mês: ");
		mes = sc.nextInt();
		System.out.println("Ano: ");
		ano = sc.nextInt();
		banco.setDataAbertura(dia, mes, ano);
		
		int opcao;		
		boolean sair = false;
		while (sair != true) {
			menu();
			while (true) {
				opcao = sc.nextInt();
				if (opcao > 5 || opcao < 1) {
					System.out.println("[ERRO] Opção inválida. Tente novamente.");			
				} else {
					break;
				}
			}
			if (opcao == 1) {
				System.out.println('\n' + banco.getDataAberturaFormatada());
			}
			
			else if (opcao == 2) {
				System.out.println('\n' + banco.getSaldoFormatado());
			}
			
			else if (opcao == 3) {
				System.out.println("\nDigite quando você deseja sacar: ");
				double valor = sc.nextDouble();
				banco.sacar(valor);
			}
			
			else if (opcao == 4) {
				System.out.println("\nDigite o valor do depósito: ");
				double valor = sc.nextDouble();
				banco.depositar(valor);
			}
			
			else if (opcao == 5) {
				sair = true;
				System.out.println("Adeus! :)");
				break;
			}
		}
		sc.close();
	}
	
	public static void menu() {
		System.out.println("\n==== MENU DA CONTA ====");
		System.out.println("[1] VER DATA DE ABERTURA");
		System.out.println("[2] VER SALDO");
		System.out.println("[3] SACAR");
		System.out.println("[4] DEPOSITAR");
		System.out.println("[5] SAIR");
	}
}
