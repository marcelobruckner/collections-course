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

		System.out.println("O estado de Santa Catarina está na lista? " + estados.containsKey("SC"));
		System.out.println("O estado do Maranhão está na lista? " + estados.containsValue("Maranhão"));

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
		estados.put("AP", "Amapá");
		estados.put("AM", "Amazonas");
		estados.put("BA", "Bahia");
		estados.put("CE", "Ceará");
		estados.put("DF", "Distrito Federal");
		estados.put("ES", "Espírito Santo");
		estados.put("GO", "Goiás");
		estados.put("MA", "Maranhão");
		estados.put("MT", "Mato Grosso");
		estados.put("MS", "Mato Grosso do Sul");
		estados.put("MG", "Minas Gerais");
		estados.put("PA", "Pará");
		estados.put("PB", "Paraíba");
		estados.put("PR", "Paraná");
		estados.put("PE", "Pernambuco");
		estados.put("PI", "Piauí");
		estados.put("RJ", "Rio de Janeiro");
		estados.put("RN", "Rio Grande do Norte");
		estados.put("RS", "Rio Grande do Sul");
		estados.put("RO", "Rondônia");
		estados.put("RR", "Roraima");
		estados.put("SC", "Santa Catarina");
		estados.put("SP", "São Paulo");
		estados.put("SE", "Sergipe");
		estados.put("TO", "Tocantins");
		return estados;
	}

}
