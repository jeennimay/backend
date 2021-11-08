import java.util.Date;

public class RegistroVacinaProxy implements IRegistro{

    //Proxy, controla se a vacina está ocorrendo dentro da data agendada ou posterior a ela
    @Override
    public void registrar(Object[] dados) {
        if (verificarData((Date) (dados[1]))){
            RegistroVacina registro = new RegistroVacina();
            registro.registrar(dados);
        }
        else {
            System.out.println("Não pode vacinar em data futura!");
        }
    }

    //Verificador se a data é anterior ou igual a data atual
    public boolean verificarData(Date data){
        return data.before(new Date());
    }
}
