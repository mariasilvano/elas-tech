package org.example.atividadeheranca;

public class Aluna extends Pessoa{
    public String curso;

    void estudar(){
        System.out.println(nome + " está estudando " + curso + ".");
    }
}
