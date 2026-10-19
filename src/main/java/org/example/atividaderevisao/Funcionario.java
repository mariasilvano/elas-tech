package org.example.atividaderevisao;

public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salario){
        setNome(nome);
        setSalarioBase(salario);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if(salarioBase >=0) {
            this.salarioBase = salarioBase;
        }else {
            System.out.println("O salário base não pode ser negativo.");
        }
    }

    public abstract double calcularSalario();
}
