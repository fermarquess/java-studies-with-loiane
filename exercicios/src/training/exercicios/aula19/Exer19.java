package training.exercicios.aula19;

import java.util.Scanner;

public class Exer19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //int[] alunos = new int[2];

        double[] notas1 = new double[10];

        double[] notas2 = new double[notas1.length];

        double[] result = new double[notas1.length];

        for (int i = 0; i < notas1.length; i++){

            System.out.println("Informe a primeira nota do aluno: " + (i + 1));
            notas1[i] = scan.nextDouble();

            System.out.println("Informe a segunda nota do aluno: " + (i + 1));
            notas2[i] = scan.nextDouble();

            result[i] = (notas1[i] + notas2[i]) / 2;

        }

        System.out.print("Notas 1: ");

        for (int i = 0; i < notas1.length; i++){
            System.out.print(notas1[i] + " ");

        }
        System.out.println();

        System.out.print("Notas 2: ");

        for (int i = 0; i < notas2.length; i++){
            System.out.print(notas2[i] + " ");

        }
        System.out.println();

        System.out.println("Resultados: ");

        for (int i = 0; i < result.length; i++){

            if (result[i] >= 7){
                System.out.println(result[i] +  " - Aprovado!");
            } else {
                System.out.println(result[i] +  " - Reprovado.");
            }
        }
        System.out.println();
    }
}
