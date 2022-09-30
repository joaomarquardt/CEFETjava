package listaEx1;
import java.util.Scanner;

public class TestaCasaJanela {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Janela j = new Janela();
		System.out.println("== JANELA ==");
		System.out.println("Cor: ");
		j.cor = sc.nextLine();
		System.out.println("Material: ");
		j.material = sc.nextLine();
		Casa c = new Casa();
		System.out.println("== CASA ==");
		System.out.println("Cor: ");
		c.cor = sc.nextLine();
		System.out.println("Número: ");
		c.numero = sc.nextInt();
		c.janela = j;
		sc.close();
		System.out.println("A casa tem número " + c.numero + " com cor " + c.cor + ".\nAlém disso, a janela conta com cor " + j.cor + " e material de " + j.material);
	}
}
