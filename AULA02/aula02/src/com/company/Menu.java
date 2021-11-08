package com.company;

public abstract class Menu {

    private String prato;
    private double precoBase;

    public Menu(double precoBase, String prato) {
        this.precoBase = precoBase;
    }

    public String getPrato() {
        return prato;
    }

    public void setPrato(String prato) {
        this.prato = prato;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public void preparar() {
        montar();
        System.out.println(calcularPreco());
    }

    public abstract void montar();
    public abstract double calcularPreco();
}
