package training.exercicios.aulas16a17;

import java.util.Scanner;

public class Exer28 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos CDs você possui?");
        
        int qtdCds = scan.nextInt();

        double precoCd;
        
        double soma = 0;

        for (int i = 1; i <= qtdCds; i++){

                System.out.println("Informe o preço de cada CD: " + i);
                precoCd = scan.nextInt();

                soma += precoCd;
        }

        double media = soma / qtdCds;

        System.out.println("O preço médio de cada CD foi de: " + media);
    }
    }

