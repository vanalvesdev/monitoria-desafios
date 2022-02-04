import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DesafioJardineiroTest {

    @Test
    public void cenario_45_metros() {
        assertEquals(240, DesafioJardineiro.calcularValorServico(45));
    }

    @Test
    public void cenario_20_metros() {
        assertEquals(80, DesafioJardineiro.calcularValorServico(10));
    }

    @Test
    public void cenario_500_metros() {
        assertEquals(2720, DesafioJardineiro.calcularValorServico(500));
    }
}
