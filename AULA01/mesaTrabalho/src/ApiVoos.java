public class ApiVoos {

    //Procurar os vôos de acordo com as datas preestabelecida

    /*
    private String dataPartida;
    private String dataRetorno;
    private String origem;
    private String destino;
    */

    public void buscarVoos(String dataPartida, String dataRetorno, String origem, String destino){
        System.out.println("*===============================================*");
        System.out.println("Voos encontrados para: " + destino + ", saindo de: " + origem);
        System.out.println("Data de partida: " + dataPartida + "\nData de retorno: " + dataRetorno);
    }

}
