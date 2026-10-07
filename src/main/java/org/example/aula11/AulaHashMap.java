package org.example.aula11;

import java.util.ArrayList;
import java.util.HashMap;

public class AulaHashMap {
    public static void main(String[] args){
        /*..put("Ana", 28);
        .get("Ana");
        .getOrDefault("Zoe", 0);
        .containsKey("Ana");
        .containsValue(28);
        .remove("Ana");
        .size();
        .isEmpty();
        .keySet();
        .values();
        putAll(Map.of())
        */

        HashMap<String, String> emails = new HashMap<>();

        emails.put("Ane", "ane@gmail.com");
        System.out.println(emails.get("Ane"));

        emails.put("posicao 2", "qualquer coisa");
        System.out.println(emails.get("posicao 2"));

        System.out.println(emails.getOrDefault("posicao 79", "Opção inválida"));

        System.out.println(emails.keySet());
        System.out.println(emails.values());

        ArrayList<String> filmesDeTerror = new ArrayList<>();

        filmesDeTerror.add("A freira");
        filmesDeTerror.add("A freira2");
        filmesDeTerror.add("Terror 1");
        filmesDeTerror.add("Terror 2");

        HashMap<String, ArrayList>  catalogo = new HashMap<>();
        catalogo.put("Terror", filmesDeTerror);

        System.out.println(catalogo);
    }
}
