public class DepartamentoGerencial extends Handler {

    //Classe filha da Handler, herança.


    @Override
    public void verificar(Mail eMail) {
        if((eMail.getDestino().equalsIgnoreCase("gerencia@colmeia.com")) || (eMail.getAssunto().equalsIgnoreCase("gerencia"))){
            System.out.println("Enviado à Gerência");
        }else {
            if (this.getSeguinte() != null){
                this.getSeguinte().verificar(eMail);
            }
        }
    }
}
