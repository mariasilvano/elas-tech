package org.example.aula19.builder.pizzariacomlombok;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = Pizza.builder()
                .borda("Catupiry")
                .sabor("Mussarela")
                .temQueijo(true)
                .build();

        pizza.mostrar();
    }
}