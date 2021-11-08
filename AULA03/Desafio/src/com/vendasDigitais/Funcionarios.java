package com.vendasDigitais;

public class Funcionarios extends Vendedores {

    /*
    O objetivo dos funcionários é conseguir afiliados (obterAfiliado) e realizar vendas (vender).
    Cada um recebe 10 pontos por cada novo afiliado, 5 pontos por cada venda que fizer e
    5 pontos por cada ano de antiguidade que tiver.
    */

    private int antiguidade;

    public Funcionarios(String nome, int pontos, int antiguidade) {
        super(nome, pontos);
        this.antiguidade = antiguidade;
    }

    public void obterAfiliado(int pontos){
        pontos += 10;
    }

    @Override
    public int calcularPontos() {
        return 0;
    }

    @Override
    public void vender(int pontos) {
        pontos = pontos + antiguidade * 5;
    }
}
