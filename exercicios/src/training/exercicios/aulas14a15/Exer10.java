package training.exercicios.aulas14a15;

import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o período que você estuda M-matutino, V-vespertino ou N-noturno?");

        String periodo = scan.next();

        switch (periodo) {
            case "M", "m":
                System.out.println("Bom dia!");
                break;
            case "V", "v":
                System.out.println("Boa tarde!");
                break;
            case "N", "n":
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Valor inválido");
        }
    }}



/**
             * OUTRA RESOLUÇÃO POSSÍVEL
             * if (periodo.equalsIgnoreCase("M")) {
 *             System.out.println("Bom dia!");
 *         } else if (periodo.equalsIgnoreCase("V")) {
 *             System.out.println("Boa tarde!");
 *         } else if (periodo.equalsIgnoreCase("N")) {
 *             System.out.println("Boa noite!");
 *         }else {
 *             System.out.println("Valor inválido");
 *         }
 *     }}
 *     */