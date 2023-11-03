package training.exercicios.aulas16a17;

import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //cálculo de expoente

        System.out.println("Informe um número base: ");

        int numBase = scan.nextInt();

        System.out.println("Informe outro número expoente: ");

        int numExpoente = scan.nextInt();

        // 2² = 2 * 2
        // 2³ = 2 * 2 * 2

        int resultado = numBase;

        for (int i = 1; i < numExpoente; i++){
            resultado *= numBase;


        }
        System.out.println("O resultado é igual a : " + resultado);
    }
}
