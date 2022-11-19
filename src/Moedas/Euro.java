package Moedas;

public class Euro extends Moeda {
    public Euro() {
        super("Euro", "€", 6.40);
    }

    public double converter(double value) {
        return value * this.cambio;
    }
}
