package training.exercicios.aulas14a15;

import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");

        int num01 = scan.nextInt();

        System.out.println("Digite o segundo número: ");

        int num02 = scan.nextInt();

        System.out.println("Digite o terceiro número: ");

        int num03 = scan.nextInt();

        if (num01 >= num02 && num01 >= num03){
            System.out.println("O maior número é o primeiro");
        } else if (num02 >= num03 && num02 >= num01) {
            System.out.println("O maior número é o segundo");
        }else {
            System.out.println("O maior número é o terceiro");
        }
    }
}
