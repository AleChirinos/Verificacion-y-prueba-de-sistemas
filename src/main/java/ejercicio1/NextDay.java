package ejercicio1;

public class NextDay {
    public String nextDate(int day, String month, int year) {

        boolean validDay = true;
        boolean validMonth = true;
        boolean validYear = true;
        int invalidos = 0;

        int d = day;
        String m = month;
        int y = year;

        int diasTotalesMes = cantidadDias(month);

        if (year % 4 == 0 && month.equals("febrero")) {
            diasTotalesMes++;
        }
        if (diasTotalesMes > d) {
            d++;
        } else if (!m.equals("diciembre")) {
            d = 1;
            m = nextMonth(m);
        } else {
            d = 1;
            m = nextMonth(m);
            y++;
        }
        if(day < 1 || day > diasTotalesMes) {
            validDay = false;
            invalidos ++;
        }
        if(nextMonth(month).equals("mes incorrecto")) {
            validMonth = false;
            invalidos ++;
        }
        if(year<0) {
            validYear = false;
            invalidos ++;
        }
        if(invalidos>1) {
            return "ingresar nuevos datos";
        }
        if(!validDay) {
            return "dia incorrecto";
        }
        if(!validMonth) {
            return "mes incorrecto";
        }
        if(!validYear) {
            return "gestion incorrecto";
        }
        return d + " " + m + " " + y;
    }

    public String nextMonth(String month) {
        switch (month) {
            case "enero":
                return "febrero";

            case "febrero":
                return "marzo";

            case "marzo":
                return "abril";

            case "abril":
                return "mayo";

            case "mayo":
                return "junio";

            case "junio":
                return "julio";

            case "julio":
                return "agosto";

            case "agosto":
                return "septiembre";

            case "septiembre":
                return "octubre";

            case "octubre":
                return "noviembre";

            case "noviembre":
                return "diciembre";

            case "diciembre":
                return "enero";

            default:
                return "mes incorrecto";
        }

    }

    public int cantidadDias(String mes) {
        switch (mes) {
            case "enero":
                return 31;

            case "febrero":
                return 28;

            case "marzo":
                return 31;

            case "abril":
                return 30;

            case "mayo":
                return 31;

            case "junio":
                return 30;

            case "julio":
                return 31;

            case "agosto":
                return 31;

            case "septiembre":
                return 30;

            case "octubre":
                return 31;

            case "noviembre":
                return 30;

            case "diciembre":
                return 31;

            default:
                return 31;
        }
    }
}
