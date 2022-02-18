package testEjercicio3;

import ejercicio3.ConvertirMonedaStatic;
import ejercicio3.UtilsStatic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class TestMockStaticCambioMoneda {
    @BeforeAll
    public static void before(){
        MockedStatic<UtilsStatic> mock = Mockito.mockStatic(UtilsStatic.class);
        mock.when(()->UtilsStatic.convert("bolivianos", "dolares")).thenReturn(7);
        mock.when(()->UtilsStatic.convert("bolivianos", "reales")).thenReturn(2);
    }

    @Test
    public void verify(){
        ConvertirMonedaStatic convertirMonedaStatic = new ConvertirMonedaStatic();
        Assertions.assertEquals("Se convirtio a: 70",
                convertirMonedaStatic.cambio(10, "bolivianos", "dolares"), "Error");
    }

    @Test
    public void verifyWrong(){
        ConvertirMonedaStatic convertirMonedaStatic = new ConvertirMonedaStatic();
        Assertions.assertEquals("La cantidad ingresada es incorrecta",
                convertirMonedaStatic.cambio(-10, "bolivianos", "reales"), "Error");
    }

}
