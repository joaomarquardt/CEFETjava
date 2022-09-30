package listaEx4;
import java.util.Scanner;

public class InverteArray {
	public static void main(String[] args) {
		int [] lista = new int[3];
		Scanner sc = new Scanner(System.in);
		for (int c = 0; c < 3; c++) {
			System.out.println("Digite o número " + (c + 1) + ":");
			lista[c] = sc.nextInt();
		}
		sc.close();
		System.out.println("Lista normal: ");
		System.out.println(lista);
		inverte(lista);
	}
	
	public static void inverte(int[] lista) {
		int [] invertido = new int[3];
		int aux = 0;
		for (int c = 3; c > 0; c--) {
			invertido[c] = lista[aux];
			aux += 1;
		}
		System.out.println("Lista invertida: ");
		System.out.println(invertido);
	}
}
