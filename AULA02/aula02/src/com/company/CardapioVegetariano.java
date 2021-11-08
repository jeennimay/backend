package com.company;

public class CardapioVegetariano extends Menu{
    public CardapioVegetariano(double precoBase, String prato) {
        super(precoBase, prato);
    }

    @Override
    public void montar() {
        System.out.println("O menu possui uma embalagem especial e são acrescentados determinados temperos, por isso a cobrança de uma taxa de 1%. ");
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase() * 1.01;
    }
}
