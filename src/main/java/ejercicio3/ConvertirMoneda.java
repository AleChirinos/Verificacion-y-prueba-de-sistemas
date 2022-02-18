package ejercicio3;

public class ConvertirMoneda {
    private Utils utils = new Utils();
    private String message;

    public ConvertirMoneda(){}

    public ConvertirMoneda(Utils utilMock){
        utils = utilMock;
    }

    public  String cambio(int monto, String moneda1, String moneda2){
        if(monto > 0){
            message = "Se convirtio a: " + (monto*utils.convert(moneda1, moneda2));
        }else {
            message = "La cantidad ingresada es incorrecta";
        }
        return message;
    }
}
