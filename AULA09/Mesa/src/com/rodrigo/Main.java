package com.rodrigo;

public class Main {

    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();

        fabrica.addRoupa("XS","Calça",true,true);
        fabrica.addRoupa("XS","Calça",true,true);
        fabrica.addRoupa("M","Calça",true,true);
        fabrica.addRoupa("XS","Calça",true,false);
        fabrica.addRoupa("S","Camisa",true,true);
        fabrica.addRoupa("XS","Camisa",false,true);
        fabrica.addRoupa("XS","Calça",true,true);
        fabrica.addRoupa("XS","Calça",false,true);

        fabrica.getQtdEstoque();
    }
}
