package one.digitalinnovation.map;

import java.util.Hashtable;

public class ExercicioHastable {

	public static void main(String[] args) {
		Hashtable<String, String> estados = carregaEstados();
		
		printEstados(estados);
	}

	private static void printEstados(Hashtable<String, String> estados) {
		System.out.println(estados.size() + " -- " + estados);
	}

	private static Hashtable<String, String> carregaEstados() {
		Hashtable<String, String> estados = new Hashtable<String, String>();
		
		estados.put("AC", "Acre");
		estados.put("AL", "Alagoas");
		estados.put("AP", "Amap�");
		estados.put("AM", "Amazonas");
		estados.put("BA", "Bahia");
		estados.put("CE", "Cear�");
		estados.put("DF", "Distrito Federal");
		estados.put("ES", "Esp�rito Santo");
		estados.put("GO", "Goi�s");
		estados.put("MA", "Maranh�o");
		estados.put("MT", "Mato Grosso");
		estados.put("MS", "Mato Grosso do Sul");
		estados.put("MG", "Minas Gerais");
		estados.put("PA", "Par�");
		estados.put("PB", "Para�ba");
		estados.put("PR", "Paran�");
		estados.put("PE", "Pernambuco");
		estados.put("PI", "Piau�");
		estados.put("RJ", "Rio de Janeiro");
		estados.put("RN", "Rio Grande do Norte");
		estados.put("RS", "Rio Grande do Sul");
		estados.put("RO", "Rond�nia");
		estados.put("RR", "Roraima");
		estados.put("SC", "Santa Catarina");
		estados.put("SP", "S�o Paulo");
		estados.put("SE", "Sergipe");
		estados.put("TO", "Tocantins");
		
		return estados;
	}

}
