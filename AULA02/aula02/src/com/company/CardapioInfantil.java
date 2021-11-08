package com.company;

public class CardapioInfantil extends Menu{

    private double itemSupresa;
    public CardapioInfantil(double precoBase, String prato, double itemSupresa) {
        super(precoBase, prato);
        this.itemSupresa = itemSupresa;
    }

    @Override
    public void montar() {
        System.out.println("O menu possui um item Supresa no valor de: " + itemSupresa);
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase() + itemSupresa;
    }
}

