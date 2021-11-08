package com.company;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Efetivo("Nelson", "Kobayashi", "1234567890",6000.00, 850.00, 2500.00);
        funcionario.pagamentoSalario();

        funcionario = new Contratado("Jennifer", "Mayumi", "9876543210", 350.00, 150);
        funcionario.pagamentoSalario();
    }
}
