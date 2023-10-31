package training.exercicios.aulas16a17;

import java.util.Scanner;

public class Exer07 {

    public static void main(String[] args) {
        // solicitando ao usuário para entrar com 5 números e
        // informando o maior número.
        Scanner scan = new Scanner(System.in);

        //variaveis

        int num;
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i<5; i++){
            System.out.println("Informe um número: ");
            num = scan.nextInt();

            if (num > maior){
                maior = num;
                System.out.println("O maior número agora é o: " + maior);
            }
        }

        System.out.println("O maior número digitado foi: " + maior);

    }
}
