import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorSumaReTest {

    @Test
    public void testFactorialDeCero() {
        FactorSumaRe fs = new FactorSumaRe();
        assertEquals(1, fs.calcularFactorial(0));
    }

    @Test
    public void testFactorialDeUno() {
        FactorSumaRe fs = new FactorSumaRe();
        assertEquals(1, fs.calcularFactorial(1));
    }

    @Test
    public void testFactorialDeCinco() {
        FactorSumaRe fs = new FactorSumaRe();
        assertEquals(120, fs.calcularFactorial(5));
    }

    @Test
    public void testFactorialNegativo() {
        FactorSumaRe fs = new FactorSumaRe();
        assertThrows(IllegalArgumentException.class, () -> fs.calcularFactorial(-1));
    }
}
