package questaoProva;
import java.util.*;

public class Utils {
	public static boolean existe(Collection<CorpoCeleste> x, CorpoCeleste y) {
		return x.contains(y);
	}
	
	public static void ordena(List<CorpoCeleste> x) {
		for (int c = 0; c < x.size() - 1; c++) {
			if (x.get(c).getDistancia() > x.get(c + 1).getDistancia()) {
				CorpoCeleste aux = x.get(c);
				x.set(c, x.get(c + 1));
				x.set(c + 1, aux);
			}
		}
	}
	
	public static Map retornaDados(Set conjuntoCorpos) {
		Iterator<String> it = (Iterator<String>) conjuntoCorpos.iterator();
		Map mapa = new HashMap();
		CorpoCeleste corpo;
		while(it.hasNext()) {
			String [] c = it.next().split("#");
			if (c[3].equals("E")) {	
				corpo = new Estrela(c[0]);
			} else {
				corpo = new Planeta(c[0]);					
			}
			corpo.setNome(c[1]);
			corpo.setDistancia(Double.parseDouble(c[2]));
			mapa.put(c[0], corpo);
		}
		return mapa;
	}
}