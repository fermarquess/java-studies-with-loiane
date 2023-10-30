package training.exercicios.aulas14a15;

import java.util.Scanner;

public class Exer27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de Kg de morangos: ");

        double qtdMorangos = scan.nextDouble();

        System.out.println("Informe a quantidade de Kg de maçã: ");

        double qtdMacas = scan.nextDouble();

        double precoMorango = 0;

        double precoMaca = 0;

        if (qtdMorangos <= 5){
           precoMorango = 2.50;
        } else if (qtdMorangos > 5) {
            precoMorango = 2.20;
        }

        if (qtdMacas <= 5){
            precoMaca = 1.80;
        } else if (qtdMacas > 5) {
            precoMaca = 1.50;
        }

        double precoTotalMorango = precoMorango * qtdMorangos;
        System.out.println("Preço - morangos: " + precoTotalMorango);

        double precoTotalMaca = precoMaca * qtdMacas;
        System.out.println("Preço - maçãs: " + precoTotalMaca);

        double precoParcial = precoTotalMorango + precoTotalMaca;
        System.out.println("O preço parcial é de: " + precoParcial);


        double qtdTotal = qtdMorangos + qtdMacas;
        System.out.println("A quantidade total em Kg: " + qtdTotal);

        double valorTotal = 0;

        if (qtdTotal > 8 || precoParcial > 25){
            valorTotal = precoParcial - ((precoParcial /100) * 10);

            System.out.println("Você recebeu mais 10% de desconto, então o valor total de sua compra é de: " + valorTotal);
        }
    }
}
