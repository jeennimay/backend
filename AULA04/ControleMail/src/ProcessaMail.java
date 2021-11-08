public class ProcessaMail {
    public static void main(String[] args) {

        //instanciar a cadeia de responsabilidade
        CheckMail check = new CheckMail();
        System.out.println("*------------------ Teste eMails ------------------*");
        check.verificar(new Mail("wheslley@digitalhouse.com", "tecnico@colmeia.com", "Teste"));
        check.verificar(new Mail("wheslley@digitalhouse.com", "gerencia@colmeia.com", "Teste"));
        check.verificar(new Mail("wheslley@digitalhouse.com", "comercial@colmeia.com", "Teste"));
        check.verificar(new Mail("wheslley@digitalhouse.com", "comercol@colmeia.com", "Teste"));    //SPAM
        System.out.println("\n\n\n");

        System.out.println("*------------------ Teste Assuntos ------------------*");
        check.verificar(new Mail("wheslley@digitalhouse.com", "teste1@colmeia.com", "Tecnico"));
        check.verificar(new Mail("wheslley@digitalhouse.com", "teste2@colmeia.com", "gerencia"));
        check.verificar(new Mail("wheslley@digitalhouse.com", "teste3@colmeia.com", "coMercial"));
        check.verificar(new Mail("wheslley@digitalhouse.com", "teste4@colmeia.com", "Teste"));    //SPAM
    }
}
