package training.exercicios.aulas11a13;

import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a temperatura em graus Farenheit: ");

        double grausFarenheit = scan.nextDouble();

        //formula para calcular graus Celsius

        double grausCelsius = (5 * (grausFarenheit-32) / 9);


        System.out.println("A temperatura em Farenheit é" + grausFarenheit + "  e a temperatura em graus Celsius é : " + grausCelsius);


    }
}
