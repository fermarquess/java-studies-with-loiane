package training.exercicios.aula19;

import java.util.Scanner;

public class Exer27 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        char[] vetorB = new char[10];

        for (int i = 0; i < vetorA.length; i++){

            System.out.println("Digite o número da posição = " + i);
            vetorA[i] = scan.nextInt();

        }

        for (int i = 0; i < vetorA.length; i++){

            if (vetorA[i] < 7){
                vetorB[i] = 'a';
            } else if (vetorA[i] == 7) {
                vetorB[i] = 'b';
            } else if (vetorA[i] > 7 && vetorA[i] < 10) {
                vetorB[i] = 'c';
            } else if (vetorA[i] == 10) {
                vetorB[i] = 'd';
            } else if (vetorA[i] > 10) {
                vetorB[i] = 'e';
            }

        }

        System.out.print("Vetor A = ");
        for (int i = 0; i< vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i< vetorA.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

    }
}
