import Moedas.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cofrinho - Rafhael Marques - RU: 3921519");

        Scanner input = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        while (true) {
            try{
                System.out.println(
                        "1 - Adicionar Moeda \n" +
                        "2 - Listar Moedas \n" +
                        "3 - Valor total das moedas convertidas para real \n" +
                        "4 - Remover moeda \n" +
                        "5 - Sair \n"
                ); // Menu

                int opcao = input.nextInt();

                if (opcao == 1) {

                    System.out.println(
                            "1 - Adicionar Dolar \n" +
                            "2 - Adicionar Euro \n" +
                            "3 - Adicionar Real \n"
                    ); // Menu de moeadas

                    int moeda = input.nextInt();

                    System.out.println("Digite o valor da moeda: ");
                    double valor = input.nextDouble();

                    if (moeda == 1) {
                        Dollar dolar = new Dollar();
                        dolar.setValor(valor);
                        cofrinho.adicionarMoeda(dolar);
                    } else if (moeda == 2) {
                        Euro euro = new Euro();
                        euro.setValor(valor);
                        cofrinho.adicionarMoeda(euro);
                    } else if (moeda == 3) {
                        Real real = new Real();
                        real.setValor(valor);
                        cofrinho.adicionarMoeda(real);
                    } else {
                        System.out.println("Opção inválida");
                        input.next();
                    }

                } else if (opcao == 2) {
                    System.out.println("Listar moedas");
                    cofrinho.listarMoedas();
                } else if (opcao == 3) {
                    System.out.println("Valor total das moedas convertidas para real");
                    System.out.println(cofrinho.getValorTotal());
                } else if (opcao == 4) {
                    System.out.println("Remover moeda");
                    cofrinho.listarMoedas();
                    System.out.println("Digite o id da moeda que deseja remover: ");
                    int id = input.nextInt(); // id = index da moeda
                    cofrinho.removerMoeda(id);
                } else if (opcao == 5) {
                    System.out.println("Saindo...");
                    break;
                } else {
                    System.out.println("Opção inválida");
                }
            } catch (Exception e) {
                System.out.println("Ops! Ocorreu um erro inesperado.");
                input.next();
            }
        }
    }
}