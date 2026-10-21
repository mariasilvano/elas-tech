package org.example.aula19.builder.refactoragendamento;

public class MainRefactor {
    public static void main(String[] args) {
        RefactorAgendamento a01 =  RefactorAgendamento.builder()
                .nomePet("Thor")
                .servico("banho")
                .horario("14h")
                .perfume(true)
                .laco(true)
                .observacao("Alérgico a shampoo")
                .desconto(10)
                .build();

        RefactorAgendamento a02 =  RefactorAgendamento.builder()
                .nomePet("Luna")
                .servico("tosa")
                .horario("10h")
                .observacao("")
                .build();

        RefactorAgendamento a03 =  RefactorAgendamento.builder()
                .nomePet("Mel")
                .servico("banho")
                .horario("16h")
                .hidratacao(true)
                .observacao("")
                .build();

        a01.mostrar();
        a02.mostrar();
        a03.mostrar();

    }

}
