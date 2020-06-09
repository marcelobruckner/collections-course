package one.digitalinnovation.map;

import java.util.HashMap;
import java.util.Map;

public class ExercicioHashMap {

	public static void main(String[] args) {
		Map<String, String> estados = carregaMapDeEstados();
		printEstados(estados);

		estados.remove("MG");
		printEstados(estados);

		estados.put("DF", "Distrito Federal");
		printEstados(estados);

		estados = removeEstadoPorNome(estados, "Mato Grosso do Sul");
		printEstados(estados);

		for (Map.Entry<String, String> entry : estados.entrySet()) {
			System.out.println(entry.getValue() + "(" + entry.getKey() + ")");
		}
		
		for(String key : estados.keySet()) {
			System.out.println(">>> " + estados.get(key) + "("+ key +")");
		}

		System.out.println("O estado de Santa Catarina est� na lista? " + estados.containsKey("SC"));
		System.out.println("O estado do Maranh�o est� na lista? " + estados.containsValue("Maranh�o"));

	}

	private static Map<String, String> removeEstadoPorNome(Map<String, String> estados, String estadoRemover) {

		Map<String, String> novaLista = new HashMap<>();
		for (Map.Entry<String, String> entry : estados.entrySet()) {
			if (!entry.getValue().equals(estadoRemover)) {
				novaLista.put(entry.getKey(), entry.getValue());
			}
		}

		return novaLista;
	}

	private static void printEstados(Map<String, String> estados) {
		System.out.println(estados.size());
		System.out.println(estados);
	}

	private static Map<String, String> carregaMapDeEstados() {
		Map<String, String> estados = new HashMap<String, String>();
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
