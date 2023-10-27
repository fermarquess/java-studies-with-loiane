package training.exercicios.aulas14a15;

import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o salário do colaborador: ");

        double salario = scan.nextDouble();

        double salarioCom20 = (salario * 20 / 100);

        double salarioReajustado20 = salario + salarioCom20;

        double salarioCom15 = (salario * 15 / 100);

        double salarioReajustado15 = salario + salarioCom15;

        double salarioCom10 = (salario * 10 / 100);

        double salarioReajustado10 = salario + salarioCom10;

        double salarioCom5 = (salario * 5 / 100);

        double salarioReajustado5 = salario + salarioCom5;

        if (salario <= 280){
            System.out.println("Aumento será de 20%");
            System.out.println("Seu salário antes do reajuste era de: " + salario);
            System.out.println("Sendo o valor do aumento de: " + (salario * 20) / 100);
            System.out.println("Seu salário reajustado é de " + salarioReajustado20);
        }else if (salario > 280 && salario <= 700){
            System.out.println("Aumento de 15%");
            System.out.println("Seu salário antes do reajuste era de: " + salario);
            System.out.println("Sendo o valor do aumento de: " + (salario * 15) / 100);
            System.out.println("Seu salário reajustado é de " + salarioReajustado15);
        } else if (salario > 700 && salario <= 1500) {
            System.out.println("Aumento de 10%");
            System.out.println("Seu salário antes do reajuste era de: " + salario);
            System.out.println("Sendo o valor do aumento de: " + (salario * 10) / 100);
            System.out.println("Seu salário reajustado é de " + salarioReajustado10);
        }else {
            System.out.println("Aumento de 5%");
            System.out.println("Seu salário antes do reajuste era de: " + salario);
            System.out.println("Sendo o valor do aumento de: " + (salario * 5) / 100);
            System.out.println("Seu salário reajustado é de " + salarioReajustado5);
        }


    }
}
