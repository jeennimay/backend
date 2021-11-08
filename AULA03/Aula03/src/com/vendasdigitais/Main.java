package com.vendasdigitais;

public class Main {
    public static void main(String[] args) {
        System.out.println("====================================================");
        Vendedores vendedor1 = new Funcionarios("Joao");
        System.out.println("Resumo de pontos do Funcionário: ");
        System.out.println("Pontos de Afiliado: " + vendedor1.obterAfiliado());
        System.out.println("Anos: " + vendedor1.quantAnos());
        System.out.println("Anos: " + vendedor1.quantAnos());
        System.out.println("Pontos de vendas: " + vendedor1.vender());
        System.out.println("Total de pontos: " + vendedor1.calcularPontos());;
        vendedor1.mostrarCategoria();
        System.out.println("====================================================");
        Vendedores afiliado = new Afiliado("Maria");
        System.out.println("Resumo de pontos do Afiliado: ");
        System.out.println("Pontos de vendas: " + afiliado.vender());
        afiliado.mostrarCategoria();
        System.out.println("====================================================");

    }
}
