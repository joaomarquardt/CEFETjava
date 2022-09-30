package listaEx2;

public class SomaImpares {
	public static void main(String[] args) {
		int soma = 0;
		for (int c = 1; c < 10001; c++) {
			if (c % 2 == 1) {
				soma += c;
			}
		}
		System.out.println("A soma entre todos os números ímpares entre 1 a 10000 é " + soma);
	}
}
