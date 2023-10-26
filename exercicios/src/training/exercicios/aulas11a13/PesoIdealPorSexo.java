package training.exercicios.aulas11a13;

import java.util.Scanner;

public class PesoIdealPorSexo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura: ");

        double altura = scan.nextDouble();

        System.out.println("Digite seu sexo: ");

        String sexo = scan.next();

        double pesoIdealmulher = (62.1*altura) - 44.7;

        double pesoIdealhomem = (72.7*altura) - 58;

        System.out.println("Digite seu peso: ");

        double peso = scan.nextDouble();

        //unsolved











    }
}
