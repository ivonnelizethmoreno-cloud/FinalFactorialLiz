import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialMultiTest {

    @Test
    public void factorialDeCeroDebeSerUno() {
        FactorialMulti fm = new FactorialMulti();
        assertEquals(1, fm.calcularFactorial(0));
    }


    @Test
    public void factorialDeUnoDebeSerUno() {
        FactorialMulti fm = new FactorialMulti();
        assertEquals(1, fm.calcularFactorial(1));
    }

    @Test
    public void factorialDeCincoDebeSerCientoVeinte() {
        FactorialMulti fm = new FactorialMulti();
        assertEquals(120, fm.calcularFactorial(5));
    }

}
