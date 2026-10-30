package org.example.aula26.stream.atividade;

import java.util.List;

public class Main {
    static void main() {
        List<Integer> numerosDeUmASeis = List.of(1,2,3,4,5,6);

        List<Integer> resultado = numerosDeUmASeis.stream().filter(n->n%2==0).toList();

        System.out.println(resultado);

        List<String> frutas = List.of("melancia", "uva", "banana", "kiwi");

        List<String> frutasEmMaiusculo = frutas.stream().map(fruta -> fruta.toUpperCase()).toList();

        for (String fruta : frutasEmMaiusculo){
            System.out.println(fruta);
        }

        List<String> cidades = List.of("Sulina", "Chapecó", "Salvador", "Sorocaba");

        long countCidadesIniciadasComS = cidades.stream().filter(cidade -> cidade.charAt(0) == 'S').count();

        System.out.println(countCidadesIniciadasComS);

    }
}
