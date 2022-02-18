package ejercicio2;

public class NumbersGenerator {
    PrimoUtils primoUtils;

    public NumbersGenerator() {
        this.primoUtils = new PrimoUtils();
    }

    public NumbersGenerator(PrimoUtils primoUtils) {
        this.primoUtils = primoUtils;
    }

    public String getValue(int n) throws Exception {
        String result="";

        if (n <= 0) {
            throw new Exception("El numero ingresado es incorrecto");
        }

        if (this.primoUtils.esPrimo(n)) {
            for (int i = 2; i <= n; i += 2) {
                result += i+" ";
            }
        } else {
            for(int i = 1; i<=n ; i+=2) {
                result += i+" ";
            }
        }

        return result.trim();

    }
}
