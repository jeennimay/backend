package com.company;

public class CardapioVegetariano extends Cardapio{

    private String embalagemEspecial;
    private double acrescimoContainer;
    private double sobretaxaCodimento;

    public CardapioVegetariano(double precoBase, String embalagemEspecial, double acrescimoContainer, double sobretaxaCodimento) {
        super(precoBase);
        this.embalagemEspecial = embalagemEspecial;
        this.acrescimoContainer = acrescimoContainer;
        this.sobretaxaCodimento = (1/100)*precoBase;
    }

    @Override
    public void montarPedido() {
        System.out.println("Montar pedido: \n  - Cardápio Vegetariano \n Acréscimos:  \n  - Embalagem Especial \n  - Codimentos");
    }

    @Override
    public void calcularPrecoVenda(double precoBase, double precoVenda) {
        precoVenda = precoBase + acrescimoContainer + sobretaxaCodimento;
        System.out.println("O valor total do seu pedido é de: R$" + precoVenda);
    }
}
