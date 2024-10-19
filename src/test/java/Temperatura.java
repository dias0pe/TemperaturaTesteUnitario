
public class Temperatura {

    public double celsiusParaFarenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double celsiusParaKelvin(double celsius) {
        return celsius + 273.15;
    }

    public String classificaTemperatura(double celsius) {
        if (celsius < 0) {
            return "NEGATIVA";
        } else if (celsius == 0) {
            return "ZERO";
        } else {
            return "POSITIVA";
        }
    }

    public boolean validaConversaoCelsiusFarenheit(double celsius, double farenheit) {
        return celsiusParaFarenheit(celsius) == farenheit;
    }
}