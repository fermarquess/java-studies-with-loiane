package training.exercicios.aulas14a15;

import java.util.Scanner;

public class Exer09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");

        int num01 = scan.nextInt();

        System.out.println("Digite o segundo número: ");

        int num02 = scan.nextInt();

        System.out.println("Digite o terceiro número: ");

        int num03 = scan.nextInt();

        if (num01 <= num02 && num01 <= num03 && num02 <= num03){
            //num01 é menor
            //num03 é maior
            // num01 < num02 < num03
            System.out.println(num03 + " - " + num02 + " - " + num01);
        } else if (num01 <= num02 && num01 <= num03 && num03 <= num02) {
            //num01 é menor
            //num02 é maior
            // num01 < num03 < num02
            System.out.println(num02 + " - " + num03 + " - " + num01);
        }else if (num02 <= num01 && num02 <= num03 && num01 <= num03){
            //num02 é menor
            //num03 é maior
            // num02 < num01 < num03
            System.out.println(num03 + " - " + num01 + " - " + num02);
        } else if (num02 <= num01 && num02 <= num03 && num03 <= num01) {
            //num02 é menor
            //num01 é maior
            // num02 < num03 < num01
            System.out.println(num01 + " - " + num03 + " - " + num02);
        } else if (num03 <= num01 && num03 <= num02 && num01 <= num02) {
            //num03 é menor
            //num02 é maior
            // num03 < num01 < num02
            System.out.println(num02 + " - " + num01 + " - " + num03);
        } else if (num03 <= num01 && num03 <= num02 && num02 <= num01) {
            //num03 é menor
            //num01 é maior
            // num03 < num02 < num01
            System.out.println(num01 + " - " + num02 + " - " + num03);


        }

    }
}
