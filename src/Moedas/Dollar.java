package Moedas;

public class Dollar extends Moeda {
    public Dollar() {
        super("Dolar",  "$", 5.40);
    }

    public double converter(double value) {
        return value * this.cambio;
    }
}
