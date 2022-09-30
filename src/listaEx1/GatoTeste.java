package listaEx1;
import java.util.Scanner;

public class GatoTeste {
	public static void main(String[] args) {
		Gato [] g  = new Gato[3];
		Scanner sc = new Scanner(System.in);
		for (int c = 0; c < 3; c++) {
			g[c] = new Gato();
			System.out.println("---- " + (c + 1) + "° GATO ----");
			System.out.println("Nome: ");
			g[c].nome = sc.nextLine();
			System.out.println("Idade: ");
			g[c].idade = sc.nextInt();
			System.out.println("Cor: ");
			
			g[c].cor = sc.nextLine();
			System.out.println("Vivo: ");
			g[c].vivo = sc.nextBoolean();		
		}
		sc.close();
		
		System.out.println("Agora, vamos aos dados...");
		
		for (int x = 0; x < g.length; x++) {
			System.out.println("---- " + (x + 1) + "GATO ----");
			System.out.println("Nome: " + g[x].nome + " | Idade: " + g[x].idade + " | Cor: " + g[x].cor + " | Vivo: " + g[x].vivo);
		}
	}
}
