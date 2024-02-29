package training.exercicios.aula19;

import java.util.Scanner;

public class Exer24 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++){

            System.out.println("Informe um número para a posição " + i);
            vetorA[i] = scan.nextInt();

        }

        boolean palindromo = true;

        for (int i = 0; i < (vetorA.length/2); i++){

            if (vetorA[i] != vetorA[vetorA.length - 1 - i]){
                palindromo = false;
                break;
            }
        }

        System.out.println("Vetor A = ");
        for (int i = 0; i< vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();System.out.println("Vetor A = ");
        for (int i = 0; i< vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();

        if (palindromo){
            System.out.println("Palindromo");
        } else {
            System.out.println("Não é palíndromo");
        }
    }
}
