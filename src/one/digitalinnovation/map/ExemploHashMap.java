package one.digitalinnovation.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

	public static void main(String[] args) {

		Map<String, Integer> campeoesMundiaisFifa = new HashMap<>();

		campeoesMundiaisFifa.put("Brasil", 5);
		campeoesMundiaisFifa.put("Alemanha", 4);
		campeoesMundiaisFifa.put("Italia", 4);
		campeoesMundiaisFifa.put("Uruguai", 2);
		campeoesMundiaisFifa.put("Argentina", 2);
		campeoesMundiaisFifa.put("França", 2);
		campeoesMundiaisFifa.put("Inglaterra", 1);
		campeoesMundiaisFifa.put("Espanha", 1);
		System.out.println(campeoesMundiaisFifa);

		campeoesMundiaisFifa.put("Brasil", 6);

		System.out.println(campeoesMundiaisFifa);

		System.out.println("Quanto títulos tem a Argentina? " + campeoesMundiaisFifa.get("Argentina"));
		System.out.println("A França é um campeão mundial da Fifa? " + campeoesMundiaisFifa.containsKey("França"));
		System.out.println("Existe alguma seleção com 6 títulos mundiais? " + campeoesMundiaisFifa.containsValue(6));
		System.out.println("Quantas seleções campeãs existem? " + campeoesMundiaisFifa.size());
		campeoesMundiaisFifa.remove("França");
		System.out
				.println("Quantas seleções campeãs existem, após a remoção da França? " + campeoesMundiaisFifa.size());

		for (String key : campeoesMundiaisFifa.keySet()) {
			System.out.println(">>> " + key + " -- " + campeoesMundiaisFifa.get(key));
		}

		for (Map.Entry<String, Integer> entry : campeoesMundiaisFifa.entrySet()) {
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}

		campeoesMundiaisFifa.clear();
		System.out.println(campeoesMundiaisFifa);

	}

}
