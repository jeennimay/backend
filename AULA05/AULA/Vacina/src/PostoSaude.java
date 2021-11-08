import java.util.Calendar;
import java.util.Date;

public class PostoSaude {
    public static void main(String[] args) {

        //int year = 2021;
        //int month = 10;
        //int day = 21;

        Calendar calendar = Calendar.getInstance();
        //calendar.set(year, month - 1, day);
        calendar.set(2021, 10-1, 21);
        Date date = calendar.getTime();

        Pessoa pessoa = new Pessoa("Wheslley", "Rimar", "987654321", "CoronaVac", date);

        IRegistro registro = new RegistroVacinaProxy();
        registro.registrar(pessoa.dados());
    }
}
