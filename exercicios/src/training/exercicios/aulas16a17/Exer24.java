package training.exercicios.aulas16a17;

import java.util.Scanner;

public class Exer24 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número de notas: ");

        int notas = scan.nextInt();

        double soma = 0;
        double media;
        double nota;

        for (int i = 0 ; i<notas; i++){
            System.out.println("Informe a nota: " + (i+1));
            nota = scan.nextDouble();

            soma += nota;
        }

        media = soma / notas;

        System.out.println("Soma " + soma);
        System.out.println("Média " + media);

    }




}
