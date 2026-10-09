package org.example.atividadeheranca;

public class Professora extends Pessoa{
    public String disciplina;

    void lancarNota(String aluna,double nota){
        System.out.printf("%s lançou nota %.1f para %s %n", nome, nota, aluna);
    }

    @Override
    void apresentar() {
        System.out.println("Oi, sou "+ nome + " e ensino "+disciplina+".");
    }
}
