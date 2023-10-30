package training.exercicios.aulas14a15;

import java.util.Scanner;

public class Exer28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual tipo de carne precisa: Filé, Alcatra ou Picanha? ");

        String tipoCarne = scan.next();

        System.out.println("Informe a quantidade que precisa em Kg: ");

        double qtdKgCarne = scan.nextDouble();

        double precoKg = 0;


        if (tipoCarne.equalsIgnoreCase("Filé")) {
            if (qtdKgCarne < 5) {

                System.out.println(qtdKgCarne + "kg - Filé");

                precoKg= 4.90;
            } else {
                precoKg = 5.80;
            }
        } else if (tipoCarne.equalsIgnoreCase("Alcatra")) {
            if (qtdKgCarne < 5) {

                System.out.println(qtdKgCarne + "kg - Alcatra");

                precoKg = 5.90;
            } else {
                precoKg = 6.80;
            }
        } else if (tipoCarne.equalsIgnoreCase("Picanha")) {

            System.out.println(qtdKgCarne + "kg - Picanha");

            if (qtdKgCarne < 5) {
                precoKg = 6.90;
            } else {
                precoKg = 7.80;
            }

        }
        double total = qtdKgCarne * precoKg;
        System.out.println(qtdKgCarne + "kg * " + precoKg + "= " + total);

        System.out.println("A compra será no cartão: digite 1 - sim ?");

        int cartao = scan.nextInt();

        if (cartao == 1){
            double desconto = (total/100) * 5;
            System.out.println("Desconto de: " + desconto);
            System.out.println("Valor a pagar: " + (total - desconto));
        }else {
            System.out.println("Valor a pagar: " + total);
        }

    }
}
