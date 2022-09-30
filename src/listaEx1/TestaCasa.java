package listaEx1;
import java.util.Scanner;

public class TestaCasa {
	public static void main(String[] args) {
		Casa [] c = new Casa[2];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < c.length; i++) {
			c[i] = new Casa();
			c[i].cor = sc.nextLine();
			c[i].numero = sc.nextInt();
		}
		sc.close();
		
		for (int x = 0; x < c.length; x++) {
			System.out.println("A casa de número " + c[x].numero + " tem cor " + c[x].cor);
		}
	}
}
