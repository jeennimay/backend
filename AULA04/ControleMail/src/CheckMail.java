import java.net.ContentHandlerFactory;

public class CheckMail {

    Handler initial;

    public CheckMail() {
        this.initial = new DepartamentoGerencial();
        Handler tecnico = new DepartamentoTecnico();
        Handler comercial = new DepartamentoComercial();
        Handler SPAM = new HandlerSpam();

        initial.setSeguinte(tecnico);
        tecnico.setSeguinte(comercial);
        comercial.setSeguinte(SPAM);

    }

    public void verificar(Mail eMail){
        initial.verificar(eMail);
    }
}
