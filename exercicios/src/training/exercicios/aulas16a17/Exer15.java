package training.exercicios.aulas16a17;

import java.util.Scanner;

public class Exer15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // sequência fibonacci

        System.out.println("Informe o n-ésimo termo da série de fibonacci: ");
        int n = scan.nextInt();

        int primeiro = 1;
        int segundo = 1;
        int proximo;

        System.out.println(primeiro);
        System.out.println(segundo);

        //1,1,2,3,5

        for (int i = 3; i<=n; i++){

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.println(proximo);

        }
    }
}