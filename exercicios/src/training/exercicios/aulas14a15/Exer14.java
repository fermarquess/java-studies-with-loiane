package training.exercicios.aulas14a15;

import java.util.Scanner;

public class Exer14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");

        int nota01 = scan.nextInt();

        System.out.println("Informe a segunda nota: ");

        int nota02 = scan.nextInt();

        int media = (nota01 + nota02) / 2;


        System.out.println("A média do aluno é de: " + media);

        if (media >= 9 && media <= 10){
            System.out.println("Primeira nota:  " + nota01);
            System.out.println("Segunda nota: " + nota02);
            System.out.println("Média: " + media);
            System.out.println("Conceito A");
            System.out.println("Aprovado");
        } else if (media >= 7.5 && media <= 9) {
            System.out.println("Primeira nota:  " + nota01);
            System.out.println("Segunda nota: " + nota02);
            System.out.println("Média: " + media);
            System.out.println("Conceito B");
            System.out.println("Aprovado");
        } else if (media >= 6 && media <= 7.5) {
            System.out.println("Primeira nota:  " + nota01);
            System.out.println("Segunda nota: " + nota02);
            System.out.println("Média: " + media);
            System.out.println("Conceito C");
            System.out.println("Aprovado");
        } else if (media >= 4 && media <= 6) {
            System.out.println("Primeira nota:  " + nota01);
            System.out.println("Segunda nota: " + nota02);
            System.out.println("Média: " + media);
            System.out.println("Conceito D");
            System.out.println("Reprovado");
        } else if (media <= 4){
            System.out.println("Primeira nota:  " + nota01);
            System.out.println("Segunda nota: " + nota02);
            System.out.println("Média: " + media);
            System.out.println("Conceito E");
            System.out.println("Reprovado");
        }

    }}
