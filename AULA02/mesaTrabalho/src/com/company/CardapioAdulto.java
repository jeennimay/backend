package com.company;

public class CardapioAdulto extends Cardapio{

    public CardapioAdulto(double precoBase) {
        super(precoBase);
    }

    @Override
    public void montarPedido() {
        System.out.println("Montar pedido: \n  - Cardápio Adulto \nAcréscimos:  \n  - Nenhum acrescimo a ser feito");
    }

    @Override
    public void calcularPrecoVenda(double precoBase, double precoVenda) {
        precoVenda = precoBase;
        System.out.println("O valor total do seu pedido é de: R$" + precoVenda);
    }
}
