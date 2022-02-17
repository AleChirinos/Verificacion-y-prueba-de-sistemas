package testEjercicio1;

import ejercicio1.NextDay;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestNextDay {
    @ParameterizedTest
    @CsvSource({
            "5,mayo,2020,6 mayo 2020",
            "28,febrero,2020,29 febrero 2020",
            "28,febrero,2021,1 marzo 2021",

            "1,enero,2000,2 enero 2000",
            "31,enero,2021,1 febrero 2021",
            "5,abril,2021,6 abril 2021",

            "-1,septiembre,1997,dia incorrecto",
            "32,mayo,1998,dia incorrecto",
            "29,febrero,2021,dia incorrecto",
    })


    public void verifyNextDate(int dia,String mes, int gestion, String expectedResult){
        NextDay dateUtils = new NextDay();
        String actualResult = dateUtils.nextDate(dia, mes, gestion);
        Assertions.assertEquals(expectedResult,actualResult,"ERROR, el mensaje retornado es incorrecto!!");

    }

}
