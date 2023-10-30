package training.exercicios.aulas14a15;

import java.util.Scanner;

public class Exer16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o valor A: ");

        int a = scan.nextInt();

        System.out.println("Insira o valor B: ");

        int b = scan.nextInt();

        System.out.println("Insira o valor C: ");

        int c = scan.nextInt();

        if (a == 0){
            System.out.println("Estão não é um valor válido para a equação de segundo grau.");
        } else {

           double delta = (b*b) - (4*a*c);

            if (delta < 0){
                System.out.println("Delta negativo");
            } else {

                System.out.println("delta : " + delta);

                double x1 = ((-b) + Math.sqrt(delta)) / (2*a);
                double x2 = ((-b) - Math.sqrt(delta)) / (2*a);

                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);

            }
        }
    }
}
