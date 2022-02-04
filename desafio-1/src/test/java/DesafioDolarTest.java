import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DesafioDolarTest {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    @Test
    public void cenario_200_reais() {
        assertEquals(df.format(36.40), df.format(DesafioDolar.calcularCompraDolar(200)));
    }

    @Test
    public void cenario_1_reais() {
        assertEquals(df.format(0.27), df.format(DesafioDolar.calcularCompraDolar(1.5)));
    }

    @Test
    public void cenario_40_reais() {
        assertEquals(df.format(7.28), df.format(DesafioDolar.calcularCompraDolar(40)));
    }
}
