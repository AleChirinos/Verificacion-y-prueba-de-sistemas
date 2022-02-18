package testEjercicio2;

import ejercicio2.NumbersGenerator;
import ejercicio2.PrimoUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

public class TestNumbers {

    PrimoUtils primoUtilsMock = Mockito.mock(PrimoUtils.class);

    @ParameterizedTest
    @CsvSource({
            "0",
            "-1",
    })

    public void verifyNumberValuesException(int n){
        NumbersGenerator generador = new NumbersGenerator();
        Assertions.assertThrows(Exception.class, ()-> {generador.getValue(n);} );
    }

    @ParameterizedTest
    @CsvSource({
            "11,2 4 6 8 10",
            "21,1 3 5 7 9 11 13 15 17 19 21",
            "8,1 3 5 7",

    })
    public void verifyNumberValues(int n, String expectedResult) throws Exception {

        Mockito.when(primoUtilsMock.esPrimo(8)).thenReturn(false);
        Mockito.when(primoUtilsMock.esPrimo(11)).thenReturn(true);
        Mockito.when(primoUtilsMock.esPrimo(21)).thenReturn(false);

        NumbersGenerator generador = new NumbersGenerator(primoUtilsMock);

        Assertions.assertEquals(expectedResult,generador.getValue(n),"ERROR!! la respuesta es incorrecta");


    }
}
