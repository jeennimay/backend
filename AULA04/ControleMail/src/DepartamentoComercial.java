public class DepartamentoComercial extends Handler{
    //Classe filha da Handler, herança.


    @Override
    public void verificar(Mail eMail) {
        if((eMail.getDestino().equalsIgnoreCase("comercial@colmeia.com")) || (eMail.getAssunto().equalsIgnoreCase("comercial"))){
            System.out.println("Enviado ao Comercial");
        }else {
            if (this.getSeguinte() != null){
                this.getSeguinte().verificar(eMail);
            }
        }
    }
}
