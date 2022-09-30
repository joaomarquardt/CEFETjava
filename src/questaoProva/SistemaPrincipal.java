package questaoProva;
import java.util.Scanner;

public class SistemaPrincipal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Verifique se a estrela está no sistema: ");
		String id = sc.nextLine();
		CorpoCeleste c = new CorpoCeleste(id);
		boolean bool = Utils.existe(Utils.retornaDados(LerArquivo.retornaStrings()).values(), c);
		if (bool) {
			System.out.println(Utils.retornaDados(LerArquivo.retornaStrings()).get(id));
		} else {
			System.out.println("O Corpo Celeste com ID " + id + " não existe.");
		}
	}
}
