package com.vendasDigitais;

public abstract class Vendedores {

    //classe abstrata para criar funcionários e afiliados
    private String nome;
    private int pontos;

    public Vendedores(String nome, int pontos) {
        this.nome = nome;
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public void mostrarCategoria(){
        pontos = calcularPontos();
        if (pontos < 20) {
            System.out.println( nome +" sua categoria é novato, sua pontuação é de: " + pontos);
        } else if (pontos >= 20 && pontos <= 30) {
            System.out.println( nome +" sua categoria é aprendiz, sua pontuação é de: " + pontos);
        } else if (pontos >= 31 && pontos <= 40) {
            System.out.println( nome +" sua categoria é bom, sua pontuação é de: " + pontos);
        } else {
            System.out.println( nome +" sua categoria é mestre, sua pontuação é de: " + pontos);
        }
    }

    public abstract int calcularPontos();

    public abstract void vender(int pontos);
}
