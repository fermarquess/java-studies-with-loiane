package training.exercicios.aulas16a17;

import java.util.Scanner;

public class Exer31 {

    public static void main(String[] args) {

        //caixa supermercado

        Scanner scan = new Scanner(System.in);

        boolean sair = false;

        String continuarCompra;

        int qtdProdutos;

        double preco;

        double total;

        String saida;

        double valorPago;

        double troco;

        do {

            System.out.println("Deseja informar uma nova compra? S/N");
            continuarCompra = scan.next();

            if (continuarCompra.equalsIgnoreCase("S")){
                    // o \n é para pular linha
                saida = "Lojas Tabajara\n";

                System.out.println("Informe a quantidade de produtos da compra");
                qtdProdutos = scan.nextInt();

                total = 0;

                for (int i = 1; i <= qtdProdutos; i++ ){

                    System.out.println("Informe o preço do produto " + i);
                    preco = scan.nextDouble();

                    total += preco;

                    saida += "Produto: " + i + " : R$ " + preco + "\n";
                }

                saida += " Total: R$ " + total + "\n";

                System.out.println("Total: R$ " + total);

                System.out.println("Informe o valor pago: ");
                valorPago = scan.nextDouble();

                saida += " Dinheiro: R$ " + valorPago + "\n";

                troco = total - valorPago;

                saida += "Troco: R$ " + troco;

                System.out.println(saida);

            } else {
                sair = true;
            }


        } while (!sair);


    }

}
