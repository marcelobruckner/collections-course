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
		campeoesMundiaisFifa.put("Fran�a", 2);
		campeoesMundiaisFifa.put("Inglaterra", 1);
		campeoesMundiaisFifa.put("Espanha", 1);
		System.out.println(campeoesMundiaisFifa);

		campeoesMundiaisFifa.put("Brasil", 6);

		System.out.println(campeoesMundiaisFifa);

		System.out.println("Quanto t�tulos tem a Argentina? " + campeoesMundiaisFifa.get("Argentina"));
		System.out.println("A Fran�a � um campe�o mundial da Fifa? " + campeoesMundiaisFifa.containsKey("Fran�a"));
		System.out.println("Existe alguma sele��o com 6 t�tulos mundiais? " + campeoesMundiaisFifa.containsValue(6));
		System.out.println("Quantas sele��es campe�s existem? " + campeoesMundiaisFifa.size());
		campeoesMundiaisFifa.remove("Fran�a");
		System.out
				.println("Quantas sele��es campe�s existem, ap�s a remo��o da Fran�a? " + campeoesMundiaisFifa.size());

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
