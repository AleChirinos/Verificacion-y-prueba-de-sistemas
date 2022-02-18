package testEjercicio3;

import ejercicio3.ConvertirMoneda;
import ejercicio3.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TestCambioMoneda {
    Utils mock = Mockito.mock(Utils.class);

    @Test
    public void verify(){
        Mockito.when(mock.convert("dolares", "bolivianos")).thenReturn(7);
        ConvertirMoneda convertirMoneda = new ConvertirMoneda(mock);
        String result = "Se convirtio a: 70";
        String actual = convertirMoneda.cambio(10, "dolares", "bolivianos");
        Assertions.assertEquals(result, actual, "Error");
        Mockito.verify(mock).convert("dolares", "bolivianos");
    }

    @Test
    public void verifyError(){
        Mockito.when(mock.convert("reales", "bolivianos")).thenReturn(2);
        ConvertirMoneda convertirMoneda = new ConvertirMoneda(mock);
        String result = "La cantidad ingresada es incorrecta";
        String actual = convertirMoneda.cambio(-1, "reales", "bolivianos");
        Assertions.assertEquals(result, actual, "Error");
    }
}
