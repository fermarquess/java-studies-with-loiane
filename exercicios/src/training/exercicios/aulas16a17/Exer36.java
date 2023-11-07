package training.exercicios.aulas16a17;

import java.util.Scanner;

public class Exer36 {

    public static void main(String[] args) {
        // calculando a tabuada conforme números inputados pelo usuário

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número para gerar a tabuada: ");

        int num = scan.nextInt();
        //para verificar se o usuário não digitou o final menor que o inicial

        boolean invalido = true;

        int numInicio, numTermino;

        do {
            System.out.println("Informe um número para começar: ");

            numInicio = scan.nextInt();

            System.out.println("Informe outro número para terminar: ");

            numTermino = scan.nextInt();

            //para verificar se o usuário não digitou o final menor que o inicial
            if (numTermino > numInicio){
                invalido = false;
            }

        }while (invalido);

        System.out.println("Tabuada de: " + num);
        System.out.println("Começar por: " + numInicio);
        System.out.println("Terminar em: " + numTermino);
        System.out.println();

        for (int i = numInicio; i<=numTermino; i++){
            System.out.println(num + " X " + i + " = " + (num*i));

        }
    }
}
