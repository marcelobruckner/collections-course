package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> capitais = new TreeSet<String>();
		
		capitais.add("Porto Alegre");
		capitais.add("Florian�polis");
		capitais.add("Curitiba");
		capitais.add("S�o Paulo");
		capitais.add("Rio de Janeiro");
		capitais.add("Belo Horizonte");
		
		System.out.println(capitais);
		
		System.out.println(capitais.first());
		System.out.println(capitais.last());
		System.out.println(capitais.lower("Florian�polis"));
		System.out.println(capitais.higher("Florian�polis"));
		
		System.out.println(capitais);
		
		System.out.println("Primeira da �rvore removendo: " + capitais.pollFirst());
		System.out.println("Ultima da �rvore removendo: " + capitais.pollLast());
		
		System.out.println(capitais);
		
		Iterator<String> it = capitais.iterator();
		while (it.hasNext()) {
			System.out.println(">>> " + it.next());
			
		}
	}

}
