package com.company;

public class CardapioInfantil extends Cardapio{

    private String presenteSurpresa;
    private double acrescimo;

    public CardapioInfantil(double precoBase, String presenteSurpresa, double acrescimo) {
        super(precoBase);
        this.presenteSurpresa = presenteSurpresa;
        this.acrescimo = acrescimo;
    }

    @Override
    public void montarPedido() {
        System.out.println("Montar pedido: \n  - Cardápio Infantil \nAcréscimos:  \n  - " + presenteSurpresa);
    }

    @Override
    public void calcularPrecoVenda(double precoBase, double precoVenda) {
        precoVenda = precoBase + acrescimo;
        System.out.println("O valor total do seu pedido é de: R$" + precoVenda);
    }
}
