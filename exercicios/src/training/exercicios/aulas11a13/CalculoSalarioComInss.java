package training.exercicios.aulas11a13;

import java.util.Scanner;

public class CalculoSalarioComInss {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o valor da sua hora? ");

        double valorHora = scan.nextDouble();

        System.out.println("Quantas horas você trabalhou este mês?");

        double horasTrabalhadasMes = scan.nextDouble();

        double totalSalarioBruto = valorHora * horasTrabalhadasMes;

        double totalPagoImpostoRenda = (totalSalarioBruto * 11) / 100;

        double totalPagoInss = (totalSalarioBruto * 8) / 100 ;

        double totalSindicato = (totalSalarioBruto * 5) / 100;

        double totalDescontos = totalPagoImpostoRenda + totalPagoInss + totalSindicato;

        double salarioLiquido = totalSalarioBruto - totalDescontos;


        System.out.println("O total do seu salário bruto é: " + totalSalarioBruto);

        System.out.println("O total pago de Imposto de renda é de: " + totalPagoImpostoRenda);

        System.out.println("O total pago ao Inss é de: " + totalPagoInss);

        System.out.println("O total pago ao Sindicato é de: " + totalSindicato);

        System.out.println("Seu salário líquido é de: " + salarioLiquido);







    }
}
