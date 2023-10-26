package cursojava.aula14;

import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do item: ");

        double valor = scan.nextDouble();

        if(valor <= 10){
            System.out.println("Está barato!");
        } else if (valor > 10 && valor < 15) {
            System.out.println("Pedir desconto");
        } else if (valor >= 15 && valor <= 17) {
            System.out.println("Pesquisar mais");
        } else {
            System.out.println("Muito caro");
        }
    }
}
