package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

	public static void main(String[] args) {
		
		Queue<String> filaBanco = new LinkedList<String>();
		
		filaBanco.add("Patr�cia");
		filaBanco.add("Roberto");
		filaBanco.add("Fl�vio");
		filaBanco.add("Pamela");
		filaBanco.add("Anderson");
		
		imprimeFila(filaBanco);
		filaBanco.clear();
		System.out.println("Primeiro cliente da file (sendo removido): " + filaBanco.poll());
		
//		filaBanco.clear();
		
		imprimeFila(filaBanco);
		
		System.out.println("Primeiro cliente da fila (sem remover): " + filaBanco.peek());
		
		imprimeFila(filaBanco);
		
//		filaBanco.clear();
		
		System.out.println("Primeiro elemento da fila, sem remover ou erro se estiver vazio: " + filaBanco.element());
		
		imprimeFila(filaBanco);
		
		
		for (String cliente : filaBanco) {
			System.out.println(">>> " + cliente);
		}
		
		Iterator<String> iterator = filaBanco.iterator();
		while (iterator.hasNext()) {
			System.out.println("### " + iterator.next());
			
		}
		
		System.out.println("Clientes na fila: " + filaBanco.size());
		System.out.println("Fila est� vazia? " + filaBanco.isEmpty());
		
		System.out.println("O Fl�vio est� na fila? "+filaBanco.contains("Fl�vio"));
		System.out.println("A Amanda est� na fila? "+filaBanco.contains("Amanda"));
		
	}
	
	private static void imprimeFila(Queue<String> fila) {
		System.out.println(">>>>>>>>>>> Imprimindo fila atual: " + fila);
	}
}
