package training.exercicios.aulas11a13;

import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você recebe por horas trabalhadas?");

        double valorHora = scan.nextDouble();

        System.out.println("E quantas horas você trabalhou este mês?");

        double horasTrabalhadasMes = scan.nextDouble();

        double totalSalarioMes = valorHora * horasTrabalhadasMes;

        System.out.println("O total do seu salário este mês é: " + totalSalarioMes);

    }

}
