package training.exercicios.aulas16a17;

import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {

       // Scanner scan = new Scanner(System.in);

        double paisA = 80000;

        double paisB = 200000;

        int contador = 0;

        while (paisA < paisB){

            paisA += (paisA * 3) / 100;
            paisB += (paisA * 1.5) / 100;
            contador++;
        }

        System.out.println("População país A: " + paisA);
        System.out.println("População país B: " + paisB);
        System.out.println("Quantidade de anos: " + contador);


    }
}
