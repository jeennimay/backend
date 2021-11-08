import java.util.Arrays;

public class IP {

    //Array com 4 posições
    private int[] nro = new int[4];

    public IP(int n1, int n2, int n3, int n4){
        this.nro[0] = n1;
        this.nro[1] = n2;
        this.nro[2] = n3;
        this.nro[3] = n4;
    }

    @Override
    public String toString() {
        return "IP{ " + this.nro[0] + "." + this.nro[1] + "." + this.nro[2] + "." + this.nro[3] + "}";
    }

    String getPais(){
        String pais =  "";

        if (nro[0] <= 49){
            pais = "Argentina";
        }
        if ((nro[0]>=50) && (nro[0] >= 99)){
            pais = "Brasil";
        }
        if ((nro[0]>=100) && (nro[0] >= 149)){
            pais = "Brasil";
        }
        return pais;
    }
}
