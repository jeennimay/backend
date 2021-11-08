import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;



public class Aplicacao {

    private static final Logger logger = Logger.getLogger(Aplicacao.class);

    private List<Integer> listaInteiros = new ArrayList<>();


    //Getter and Setter
    public List<Integer> getListaInteiros() {
        return listaInteiros;
    }

    public void setListaInteiros(List<Integer> listaInteiros) {
        this.listaInteiros = listaInteiros;
    }

    public int media(List<Integer> inteiro){
        this.listaInteiros = inteiro;
        int valor =0;
        for(int i =0; i < listaInteiros.size(); i++){
            valor = valor + listaInteiros.get(i);
        }
        int media = valor / listaInteiros.size();
        return media;

    }

    public void lista(List<Integer> inteiro) throws Exception{
        this.listaInteiros = inteiro;
        if(listaInteiros.size() > 5) {
            logger.info("ListaMedia: "+media(inteiro)+" O comprimento da lista é maior que 5");
        }
        if(listaInteiros.size() > 10) {
            logger.info("ListaMedia: "+media(inteiro)+" O comprimento da lista é maior que 10");
        }
        if(listaInteiros.size() == 0){
            throw new Exception();
        }
    }

}


//Quando a lista tiver mais de 5 itens;
//+ Quando a lista tiver mais de 10 itens;
//+ A média;
//+ Gerar um erro se a lista não tiver elementos e gere o log.
//[2021-07-18 18:15:11] [ INFO ] [ListaMedia:16] O comprimento da lista é maior que 5
//[2021-07-18 18:15:11] [ INFO ] [ListaMedia:16] O comprimento da lista é maior que 5
//1
//[2021-07-18 18:15:11] [ INFO ] [ListaMedia:19] O comprimento da lista é maior que 10
//[2021-07-18 18:15:11] [ ERROR] [Test:24] A lista é igual a zero