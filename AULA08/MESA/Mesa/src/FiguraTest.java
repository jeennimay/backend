import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiguraTest {

    Figura circulo, quadrado;

    @BeforeEach
    void doBefore(){
        circulo = new Circulo(2);
        quadrado = new Quadrado(2);
    }

    @Test void perimetroCalculado(){
        //Perimetro  do circulo
        assertEquals(12.566370614359172, circulo.calcularPerimetro());
        //Perimetro do quadrado
        assertEquals(8, quadrado.calcularPerimetro());

        System.out.println("Teste realizado com sucesso!!");
    }

}