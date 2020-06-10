package one.digitalinnovation.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

	public static void main(String[] args) {

		List<String> estudantes = new ArrayList<String>();
		estudantes.add("Pedro");
		estudantes.add("Thayse");
		estudantes.add("Marcelo");
		estudantes.add("Carla");
		estudantes.add("Juliana");
		estudantes.add("Thiago");
		estudantes.add("Rafael");

		// Retorna a contagem de itens na lista
		System.out.println("Contagem: " + estudantes.stream().count());

		// Retorna o nome que tem a maior quantidade de letras na lista
		System.out
				.println("Maior numero de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

		// Retorna o nome que tem a menor quantidade de letras na lista
		System.out
				.println("Menor numero de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

		// Retorna os elementos que tem a letra r no nome.
		System.out.println("Com letra r no nome: " + estudantes.stream()
				.filter((estudante) -> estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

		// Retorna a lista com cada nome concatenado com a quantidade de caracteres do
		// nome
		System.out.println("Retorna uma nova coleção com a quantidade de letras: " + estudantes.stream()
				.map((estudante) -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
				.collect(Collectors.toList()));

		// Retorna somente os 3 primeiros elementos
		System.out.println(
				"Retorna os 3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));

		// Retorna cada elemento no console e depois retorna a mesma coleção
		System.out.println(
				"Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

		// Exibe os elementos no console sem retornar nova coleção
		System.out.println("Retorna os elementos novamente: ");
		estudantes.stream().forEach(System.out::println);

		System.out.println("Todos os elementos tem w no nome: "
				+ estudantes.stream().allMatch(elemento -> elemento.contains("w")));

		System.out.println("Tem algum elemento com letra 'a' minuscula no nome? "
				+ estudantes.stream().anyMatch(elemento -> elemento.contains("a")));
		
		System.out.println("Não tem nenhum elemento com letra 'a' minuscula no nome? "
				+ estudantes.stream().noneMatch(elemento -> elemento.contains("a")));
		
		System.out.println("Retorna o primeiro elemento da coleção: "); 
				estudantes.stream().findFirst().ifPresent(System.out::println);

	}

}
