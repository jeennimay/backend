public class RegistroVacina implements IRegistro{

    ///Método que exibe/imprime o registro da vacina
    @Override
    public void registrar(Object[] dados) {
        //System.out.printf("Foi registrado o RG %s na data %t como vacinado", dados[0], dados[1].toString() );
        System.out.println("Foi registrado o RG " + dados[0] + " na data " + dados[1].toString() + " como vacinado ");
    }
}
