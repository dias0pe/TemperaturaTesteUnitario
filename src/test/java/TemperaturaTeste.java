import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TemperaturaTeste {

    Temperatura objTemp;

    @Before
    public void setup() throws Exception {
        objTemp = new Temperatura();
    }

    @Test
    public void deveriaConverterCelsiusParaFarenheit() {
        assertEquals(23, objTemp.celsiusParaFarenheit(-5), 0);
        assertEquals(32, objTemp.celsiusParaFarenheit(0), 0);
        assertEquals(64.40, objTemp.celsiusParaFarenheit(18), 0);
    }

    @Test
    public void deveriaConverterCelsiusParaKelvin() {
        assertEquals(268.150, objTemp.celsiusParaKelvin(-5), 0);
        assertEquals(273.150, objTemp.celsiusParaKelvin(0), 0);
        assertEquals(291.150, objTemp.celsiusParaKelvin(18), 0);
    }

    @Test
    public void deveriaClassificarTemperatura() {
        assertTrue(objTemp.classificaTemperatura(-5).equals("NEGATIVA"));
        assertTrue(objTemp.classificaTemperatura(0).equals("ZERO"));
        assertTrue(objTemp.classificaTemperatura(18).equals("POSITIVA"));
    }

    @Test
    public void deveriaValidarConversaoCelsiusFarenheit() {
        assertTrue(objTemp.validaConversaoCelsiusFarenheit(-5, 23));
    }
}