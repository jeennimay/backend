package com.vendasdigitais;

public class Funcionarios extends Vendedores{

    private int anos;

    public Funcionarios(String nome) {
        super(nome);

    }

    //O objetivo dos funcionários é conseguir afiliados (obterAfiliado)
    //Cada um recebe 10 pontos por cada novo afiliado
    @Override
    public int obterAfiliado() {
        return  10;
    }

    // 5 pontos por cada venda que fizer e 5 pontos por cada ano de antiguidade que tiver.
    @Override
    public int vender() {
        int pontosVendas = 5 + (anos * 5);
        return pontosVendas;
    }

    @Override
    public int calcularPontos() {

        return obterAfiliado() + vender();
    }

    @Override
    public int quantAnos() {
           return anos++;
    }

}
