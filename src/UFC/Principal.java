package UFC;
import java.util.Scanner;
import java.lang.Thread;

public class Principal {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		Lutador [] luts = new Lutador[3];
		for (int c = 0; c < luts.length; c++) {
			System.out.println("===== " + (c + 1) + "° LUTADOR =====");
			Thread.sleep(500);
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Idade: ");
			int idade = sc.nextInt();
			System.out.println("Peso: ");
			double peso = sc.nextDouble();
			String desbug = sc.nextLine();
			if (peso <= 65) {
				luts[c] = new PesoPena(nome, idade, peso);
			}
			else if (peso <= 83.9) {
				luts[c] = new PesoMedio(nome, idade, peso);
			}
			else if (peso <= 93.0) {
				luts[c] = new MeioPesado(nome, idade, peso);
			}
			else if (peso <= 120.2) {
				luts[c] = new PesoPesado(nome, idade, peso);
			}
		}
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		int num;
		while (true) {
			System.out.println("Escolha um lutador a partir da posição (0 a " + (luts.length - 1) + "): ");
			num = sc.nextInt();
			if (num >= 0 && num <= (luts.length - 1)) {			
				System.out.println("Informações do lutador escolhido:");
				System.out.println(luts[num]);
				break;
			} else {
				System.out.println("[ERRO] Número inválido. Tente novamente.");
			}
		}
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("ANALISANDO POSSIVEIS LUTAS...");
		Thread.sleep(1000);
		boolean temLuta = luts[num].possiveisLutas(luts);
		if (temLuta) {
			Thread.sleep(1000);
			System.out.println("==========================");
			System.out.println("O lutador sorteado para o confronto foi: " + luts[num].sorteioLuta(luts));
		}
	}
}