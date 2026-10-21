package org.example.aula19.builder.pizarriasemlombok;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .borda("Catupiry")
                .sabor("Mussarela")
                .temQueijo(true)
                .build();

        pizza.mostrar();

    }
}
