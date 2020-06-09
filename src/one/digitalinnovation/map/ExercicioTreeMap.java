package one.digitalinnovation.map;

import java.util.TreeMap;

public class ExercicioTreeMap {

	public static void main(String[] args) {

		TreeMap<String, String> estados = carregaEstados();
		
		printEstados(estados);
		printString(estados.firstKey());
		printString(estados.lastKey());
		estados.pollFirstEntry();
		printEstados(estados);
		estados.pollLastEntry();
		printEstados(estados);
		estados.put("AL", "Alagoas");
		printEstados(estados);
	}

	private static void printString(String info) {
		System.out.println(info);
	}

	private static void printEstados(TreeMap<String, String> estados) {
		System.out.println(estados.size() + " - " + estados);
	}

	private static TreeMap<String, String> carregaEstados() {
		TreeMap<String, String> estados = new TreeMap<String, String>();
		
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
