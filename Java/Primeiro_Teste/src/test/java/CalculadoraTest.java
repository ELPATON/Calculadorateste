import org.example.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private Calculadora calculadora;
    @BeforeEach
    public void setup(){
    calculadora = new Calculadora();
    System.out.println("Antes de cada teste....");
    }

    @Test
    public void devSomarDoisValores(){

        double valorA = 10;
        double valorB = 20;

        double resultado = calculadora.somar(valorA, valorB);

        Assertions.assertEquals(30, resultado);
    }

    @Test
    public void devSubitrairDoisValores(){

        double valorA = 10;
        double valorB = 20;

        double resultado = calculadora.subitrair(valorA, valorB);

        Assertions.assertEquals(-10, resultado);
    }

    @Test
    public void devMultiplicarDoisValores(){

        double valorA = 10;
        double valorB = 20;

        double resultado = calculadora.multiplicar(valorA, valorB);

        Assertions.assertEquals(200, resultado);
    }

    @Test
    public void devDividirDoisValores(){

        double valorA = 10;
        double valorB = 20;

        double resultado = calculadora.dividir(valorA, valorB);

        Assertions.assertEquals(0.5, resultado);
    }
}