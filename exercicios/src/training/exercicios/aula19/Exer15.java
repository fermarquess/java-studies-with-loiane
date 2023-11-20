package training.exercicios.aula19;

import java.util.Scanner;

public class Exer15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++){

            System.out.println("Informe o valor para a posição: " + i);
            vetorA[i] = scan.nextInt();

        }

        int pares = 0;

        int soma = 0;

        for (int i = 0; i < vetorA.length; i++) {

            if (vetorA[i] % 2 == 0) {
                pares++;
            }

        }

        int impar = vetorA.length - pares;

        double porcentagemPar = (pares * 100) / vetorA.length;
        double porcentagemImpar = 100 - porcentagemPar;

        System.out.print("Vetor A: ");

        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.print("Percentual pares: " + porcentagemPar);

        System.out.println();

        System.out.print("Percentual ímpares: " + porcentagemImpar);

    }
}
