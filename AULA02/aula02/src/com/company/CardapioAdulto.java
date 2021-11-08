package com.company;

public class CardapioAdulto extends Menu{

    public CardapioAdulto(double precoBase, String prato) {
        super(precoBase, prato);
    }

    @Override
    public void montar() {
        System.out.println("Não possui itens adicionais");
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase();
    }
}

