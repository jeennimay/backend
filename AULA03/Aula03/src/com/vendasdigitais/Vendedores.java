package com.vendasdigitais;

public abstract class Vendedores {


    private String nome;


    public Vendedores(String nome ) {
        this.nome = nome;
    }

    //Cada vendedor retorna uma categoria (mostrarCategoria)
    // de acordo com o número de pontos obtidos.

    public void mostrarCategoria(){
      int pontostotal = calcularPontos();
        if(pontostotal < 20) {
            System.out.println("Novato - Total de pontos: " + pontostotal);
        } else if (pontostotal >= 20 && pontostotal <= 30) {
            System.out.println("Aprendiz - Total de pontos: " + pontostotal);
        } else if (pontostotal > 30 && pontostotal < 41) {
            System.out.println("Bom - Total de pontos: " + pontostotal);
        } else {
            System.out.println("Mestre - Total de pontos: " + pontostotal);
        }

    }

    public abstract int quantAnos();
    public abstract int calcularPontos();
    public abstract int vender();
    public abstract int obterAfiliado();
}
