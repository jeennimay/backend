public class CheckFacade implements ICheckFacade {

    // Armazenar a instância de cada API na memória
    private ApiVoos apiVoos;
    private ApiHoteis apiHoteis;

    public CheckFacade(){

        //Construtor que cria as instâncias (inicializa)
        apiVoos = new ApiVoos();
        apiHoteis = new ApiHoteis();
    }

    // Centraliar as buscas de vôos e hotéis
    public void buscar(String dataPartida, String dataRetorno, String origem, String destino) {
        apiVoos.buscarVoos(dataPartida, dataRetorno, origem, destino);
        apiHoteis.buscarHoteis(dataPartida, dataRetorno, destino);
    }
}
