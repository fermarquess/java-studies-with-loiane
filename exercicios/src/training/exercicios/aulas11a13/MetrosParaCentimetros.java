package training.exercicios.aulas11a13;

import java.util.Scanner;

public class MetrosParaCentimetros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a quantidade de metros?");

        double metros = scanner.nextDouble();

        //1m = 100cm

        double cm = metros * 100;

        System.out.println(metros + "m " + " é igual a " + cm + "cm");

    }
}
