package com.company;

public abstract class Cardapio {

    private double precoBase;
    private double precoVenda;

    public Cardapio(double precoBase) {
        this.precoBase = precoBase;
    }

    public void preparacao(){
        montarPedido();
        calcularPrecoVenda(precoBase, precoVenda);
    }
    public abstract void montarPedido();
    public abstract void calcularPrecoVenda(double precoBase, double precoVenda);
}
