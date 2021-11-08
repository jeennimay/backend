package com.company;

//Template method
public abstract class Funcionario {

    //Atributos da classe Funcionário
    private String nome;
    private String sobrenome;
    private String numeroConta;

    public Funcionario(String nome, String sobrenome, String numeroConta) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroConta = numeroConta;
    }

    public void pagamentoSalario(){
        double quantia;
        quantia = calcularSalrio();
        imprimirRecibo(quantia);
        depositar(quantia);
    }

    //metorodos abstatros para serem sobreescritos posteriormente
    public abstract double calcularSalrio();
    public abstract void imprimirRecibo(double quantia);
    public abstract void depositar(double quantia);

}
