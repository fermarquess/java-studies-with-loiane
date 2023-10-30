package training.exercicios.aulas14a15;

import java.util.Scanner;

public class Exer24 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");

        int num1 = scan.nextInt();

        System.out.println("Informe outro número: ");

        int num2 = scan.nextInt();

        System.out.println("Qual operação deseja realizar (+ - * /)?");

        String operacao = scan.next();

        double resultado = 0;

        //flag
        boolean valida = true;

        switch (operacao){
            case "+":
               resultado = num1 + num2;
               break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida");
                valida = false;

        }

        if (valida){

            System.out.println("Resultado: " + resultado);

            if (resultado >= 0){
                System.out.println("Resultado positivo");
            } else {
                System.out.println("Resultado negativo");
            }
        }

        if (resultado % 2 == 0){
            System.out.println("É par");
        } else {
            System.out.println("É ímpar");
        }

    }
}
