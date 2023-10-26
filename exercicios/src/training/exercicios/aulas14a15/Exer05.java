package training.exercicios.aulas14a15;

import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");

        double primeiraNota = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");

        double segundaNota = scan.nextDouble();

        double media = (primeiraNota + segundaNota) / 2;

        System.out.println("A média é: " + media);

        if (media >= 7 && media < 10){
            System.out.println("Aprovado");

        } else if (media == 10) {
            System.out.println("Aprovado com distinção");

        } else {
            System.out.println("Reprovado");
        }

    }
}

/** outra maneira de resolução seria:
 *          if (media == 10){
 *             System.out.println("Aprovado com distinção");
 *
 *         } else if (media >= 7) {
 *             System.out.println("Aprovado");
 *
 *         } else {
 *             System.out.println("Reprovado");
 *         }
 *
 *
 */
