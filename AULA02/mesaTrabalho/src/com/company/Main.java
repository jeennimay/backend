package com.company;

public class Main {
    public static void main(String[] args) {

        Cardapio pedido = new CardapioAdulto(25.00);
        pedido.preparacao();

        System.out.println("\n\n");
        pedido = new CardapioInfantil(25.00, "Mario", 10.00);
        pedido.preparacao();

    }
}
