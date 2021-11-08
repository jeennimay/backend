package com.company;

import javax.xml.catalog.Catalog;

public class Main {
    public static void main(String[] args) {
        Menu menu = new CardapioAdulto(150,"Risoto com salmão grelhado");
        menu.preparar();
        System.out.println("______________________________________________");
        Menu infantil = new CardapioInfantil(35,"X-tudo",15);
        infantil.preparar();
        System.out.println("_________________________________________________________________________________________");
        Menu vegetariano = new CardapioVegetariano(200,"Hamburguer vegetariano");
        vegetariano.preparar();
    }
}