package training.exercicios.aulas16a17;

import java.util.Scanner;

public class Exer12 {

    public static void main(String[] args) {
        //gerador de tabuada

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número de 1 a 10 e te mostro a tabuada correspondente: ");

        int num = scan.nextInt();

        System.out.println("Tabuada de " + num + ":");

        for (int i = 1; i <= 10; i++){

            System.out.println(num + " X " + i + " = " + (num*i));

        }
    }
}
