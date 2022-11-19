package Moedas;

public abstract class Moeda {
    public String nome;
    public String simbolo;
    public double valor;
    protected double cambio;

    public Moeda(String nome, String simbolo, double cambio) {
        this.nome = nome;
        this.simbolo = simbolo;
        this.cambio = cambio;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getInfo(int index){
        return String.format("(id: %d) - %s - %s - %.2f", index, this.nome, this.simbolo, this.valor);
    }

    public abstract double converter(double value);

}
