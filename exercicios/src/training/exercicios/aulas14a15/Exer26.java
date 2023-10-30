package training.exercicios.aulas14a15;

import java.util.Scanner;

public class Exer26 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos litros?");

        double qtdLitros = scan.nextDouble();

        System.out.println("A - álcool ou G - gasolina?");

        String tipoCombustivel = scan.next();

        double precoLitroGasolina = 2.50;

        double precoLitroAlcool = 1.90;

        int percDesconto = 0;

        double total = 0;

        double totalDesc = 0;


       if (tipoCombustivel.equalsIgnoreCase("A")){
           if (qtdLitros <= 20){
               percDesconto = 3;
           } else {
               percDesconto = 5;
           }

           total = qtdLitros * precoLitroAlcool;

           System.out.println("Total sem desconto: " + total);

       } else if (tipoCombustivel.equalsIgnoreCase("G")) {
           if (qtdLitros <= 20){
               percDesconto = 4;
           } else {
               percDesconto = 6;
           }
           total = qtdLitros * precoLitroGasolina;

           System.out.println("Total sem desconto: " + total);
       }

       totalDesc = (total / 100) * percDesconto;

        System.out.println("Valor total de desconto: " + totalDesc);

       double precoAPagar = total - totalDesc;

        System.out.println("Valor a ser pago: " + precoAPagar);
    }
}
