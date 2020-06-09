package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");


        System.out.println(nomes);

        nomes.set(2, "Larissa");

        System.out.println(nomes);

        Collections.sort(nomes);

        nomes.set(2, "Wesley");

        System.out.println(nomes);

        nomes.remove(4);

        System.out.println(nomes);

        nomes.remove("Wesley");

        System.out.println(nomes);

        String nome = nomes.get(3);

        System.out.println(nome);

        int tamanho = nomes.size();

        System.out.println("Tamanho da lista " + tamanho);

        nomes.remove("Larissa");

        tamanho = nomes.size();

        System.out.println("Tamanho da lista " + tamanho);

        boolean temAnderson = nomes.contains("Anderson");

        System.out.println("Tem Anderson? " + temAnderson);

        boolean temFernando = nomes.contains("Fernando");

        System.out.println("Tem Fernando? " + temFernando);

        System.out.println("Lista está vazia? " + nomes.isEmpty());

        System.out.println("A posição do Carlos na lista: " + nomes.indexOf("Carlos"));

        System.out.println("A posição do Wesley na lista: " + nomes.indexOf("Wesley"));

        for (String item: nomes) {
            System.out.println("--> " + item);
        }

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){

            System.out.println("--#" + iterator.next());
        }

        List<String> novaLista = new ArrayList<>();
        novaLista.add("Ismael");
        novaLista.add("Rodrigo");
        novaLista.addAll(nomes);

        for (String item: novaLista) {
            System.out.println("### " + item);
        }

        nomes.clear();

        System.out.println("Lista está vazia? " + nomes.isEmpty());
    }

}
