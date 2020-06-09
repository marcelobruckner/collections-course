package one.digitalinnovation.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {

	public static void main(String[] args) {

		Set<Integer> seqNumerica = new LinkedHashSet<Integer>();
		
		seqNumerica.add(1);
		seqNumerica.add(2);
		seqNumerica.add(4);
		seqNumerica.add(8);
		seqNumerica.add(16);
		
		System.out.println(seqNumerica);
		
		/*
		 * seqNumerica.remove(4);
		 * 
		 * System.out.println(seqNumerica);
		 * 
		 * System.out.println("Tamanho do conjunto: " + seqNumerica.size());
		 * 
		 * Iterator<Integer> it = seqNumerica.iterator(); while (it.hasNext()) {
		 * System.out.println(">>> " + it.next()); }
		 * 
		 * for (Integer elemento : seqNumerica) { System.out.println("### " + elemento);
		 * }
		 * 
		 * System.out.println("O conjunto está vazio? " + seqNumerica.isEmpty());
		 */
	}

}
