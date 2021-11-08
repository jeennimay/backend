package com.vendasDigitais;

public class Afiliados extends Vendedores {

    /*
    O objetivo dos afiliados é realizar vendas (vender),
    mas o cálculo dos pontos é diferente: eles ganham 15 pontos a cada nova venda.
    */

    public Afiliados(String nome, int pontos) {
        super(nome, pontos);
    }

    @Override
    public int vender() {
        return 15;
    }

    @Override
    public int calcularPontos() {
        getPontos() += vender();
        return getPontos();
    }
}
