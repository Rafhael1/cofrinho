import Moedas.Moeda;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class Cofrinho {

    public ArrayList<Moeda> moedas;

    public Cofrinho() {
        this.moedas = new ArrayList<Moeda>();
    }

    public void adicionarMoeda(Moeda moeda) {
        this.moedas.add(moeda);
    }

    public void listarMoedas() {
        Iterator<Moeda> iterator = this.moedas.iterator();

        while (iterator.hasNext()) {
            Moeda moeda = iterator.next();
            int index = this.moedas.indexOf(moeda);
            System.out.println(moeda.getInfo(index));
        }

    }

    public void removerMoeda(int index) {
        this.moedas.remove(index);

    }

    public String getValorTotal() {
        double valorTotal = 0;
        DecimalFormat decimalFormat = new DecimalFormat("0.###");


        Iterator<Moeda> iterator = this.moedas.iterator();

        while (iterator.hasNext()) {
            Moeda moeda = iterator.next();
            valorTotal += moeda.converter(moeda.valor);
        }

        return decimalFormat.format(valorTotal);
    }
}
