package listaEx2;

// Imprima a soma de todos os números de 1 a 50000 menos os números entre 100 e 137

public class SomaNum {
	public static void main(String[] args) {
		int soma = 0;
		for (int c = 1; c < 500001; c++) {
			if (c < 100 || c > 137) {
				soma += c;
			}
		}
		System.out.println("A soma de todos os números entre 1 a 50.000 (com exceção dos 100 aos 137) é igual a " + soma);
	}
}
