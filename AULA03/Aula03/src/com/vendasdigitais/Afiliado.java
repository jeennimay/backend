package com.vendasdigitais;

public class Afiliado extends Vendedores{

    //O objetivo dos afiliados é realizar vendas (vender),

    public Afiliado(String nome) {
        super(nome);

    }

    @Override
    public int obterAfiliado() {
        return 0;
    }


    @Override
    public int calcularPontos() {
        return vender();
    }

    // mas o cálculo dos pontos é diferente: eles ganham 15 pontos a cada nova venda.
    @Override
    public int vender() {
        return 15;
    }

    @Override
    public int quantAnos() {
        return 0;
    }

}
