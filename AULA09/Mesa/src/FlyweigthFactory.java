import java.util.HashMap;

public class FlyweigthFactory {

    public static final HashMap<String, Roupa> roupaMap = new HashMap<>();

    public static Roupa obterRoupa(String tipo){
        Roupa roupa = roupaMap.get(tipo);

        if (roupa == null) {
            roupa = new Roupa(tipo);
            roupaMap.put(tipo, roupa);

        }
        return roupa;
    }
}
