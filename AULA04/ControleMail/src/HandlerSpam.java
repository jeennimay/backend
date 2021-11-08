public class HandlerSpam extends Handler{

    //Já passou por todos os outros "métodos" e "emails"


    @Override
    public void verificar(Mail eMail) {
        System.out.println("Marcado como SPAM");
    }
}
