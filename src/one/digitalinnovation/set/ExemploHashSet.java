package one.digitalinnovation.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

	public static void main(String[] args) {
		
		Set<Double> notas = new HashSet<Double>();
		
		notas.add(5.8);
		notas.add(9.3);
		notas.add(6.5);
		notas.add(10.0);
		notas.add(5.4);
		notas.add(7.3);
		notas.add(3.8);
		notas.add(4.0);
		
		System.out.println(notas);
		
		notas.remove(3.8);
		
		notas.add(null);
		System.out.println(notas);
		
		System.out.println("Tamanho do conjuntos de notas: " + notas.size());
		
		Iterator<Double> it = notas.iterator();
		while (it.hasNext()) {
			System.out.println(">> "+it.next());
			
		}
		
		for(Double nota: notas) {
			System.out.println("### " + nota);
		}
		
		notas.clear();
		
		System.out.println("O conjuntos de notas está vazio? "+ notas.isEmpty());
	}
}















