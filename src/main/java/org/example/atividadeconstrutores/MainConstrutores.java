package org.example.atividadeconstrutores;

public class MainConstrutores {
    public static void main(String[] args) {

    Agendamento a01 = new Agendamento("Thor", "banho", "14h", true, true, false, "Alérgico a shampoo", 10);
    Agendamento a02 = new Agendamento("Luna", "tosa", "10h", false, false, false, "Sem observação", 0);
    Agendamento a03 = new Agendamento("Mel", "banho", "16h", false, false, true, "Sem observação", 0);


        a01.mostrar();
        a02.mostrar();
        a03.mostrar();

    }
}
