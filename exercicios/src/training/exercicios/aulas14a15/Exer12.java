package training.exercicios.aulas14a15;

import java.util.Scanner;

public class Exer12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu valor/hora?");

        double valorHora = scan.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas no mês");

        double qtdHoras = scan.nextDouble();

        double salarioBruto = valorHora * qtdHoras;

        double desconto3Sindicato = (salarioBruto * 3) /100;

        double desconto5 = (salarioBruto * 5) / 100;

        double desconto10 = (salarioBruto * 10) / 100;

        double desconto20 = (salarioBruto * 20) / 100;

        double fgts = (salarioBruto * 11) / 100;

        double totalDescontos1500 = (desconto3Sindicato + desconto5 + desconto10);

        double totalDescontos2500 = (desconto3Sindicato + desconto10 + desconto10);

        double totalDescontosAcima2500 = (desconto3Sindicato + desconto20 + desconto10);

        double salarioLiquido1 = salarioBruto - desconto3Sindicato;

        double salarioLiquido2 = salarioBruto - totalDescontos1500;

        double salarioLiquido3 = salarioBruto - totalDescontos2500;

        double salarioLiquido4 = salarioBruto - totalDescontosAcima2500;

        if (salarioBruto <= 900){
            System.out.println("isento dos descontos");
            System.out.println("Salário bruto : " + salarioBruto);
            System.out.println("FGTS = 11% : " + fgts);
            System.out.println("Sindicato -3% :" + desconto3Sindicato);
            System.out.println("Salário líquido : " + salarioLiquido1);
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            System.out.println("Salário bruto : " + salarioBruto);
            System.out.println("IR - 5% : " + desconto5);
            System.out.println("INSS - 10% : " + desconto10);
            System.out.println("Sindicato - 3% : " + desconto3Sindicato);
            System.out.println("FGTS = 11% : " + fgts);
            System.out.println("Total de descontos : " + totalDescontos1500);
            System.out.println("Salário líquido : " + salarioLiquido2);
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            System.out.println("Salário bruto : " + salarioBruto);
            System.out.println("IR - 10% : " + desconto10);
            System.out.println("INSS - 10% : " + desconto10);
            System.out.println("Sindicato - 3% : " + desconto3Sindicato);
            System.out.println("FGTS = 11% : " + fgts);
            System.out.println("Total de descontos : " + totalDescontos2500);
            System.out.println("Salário líquido : " + salarioLiquido3);
        } else {
            System.out.println("Salário bruto : " + salarioBruto);
            System.out.println("IR - 20% : " + desconto20);
            System.out.println("INSS - 10% : " + desconto10);
            System.out.println("Sindicato - 3% : " + desconto3Sindicato);
            System.out.println("FGTS = 11% : " + fgts);
            System.out.println("Total de descontos : " + totalDescontosAcima2500);
            System.out.println("Salário líquido : " + salarioLiquido4);
        }


    }
}
