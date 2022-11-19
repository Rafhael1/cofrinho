package Moedas;

public class Real  extends Moeda {
    public Real() {
        super("Real", "R$", 1);
    }

    public double converter(double value) {
        return value * this.cambio;
    }
}
