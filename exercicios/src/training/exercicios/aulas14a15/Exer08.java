package training.exercicios.aulas14a15;

import java.util.Scanner;

public class Exer08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o preço do primeiro produto: ");

        double precoPrimeiroProduto = scan.nextDouble();

        System.out.println("Informe o preço do segundo produto: ");

        double precoSegundoProduto = scan.nextDouble();

        System.out.println("Informe o preço do terceiro produto: ");

        double precoTerceiroProduto = scan.nextDouble();

        if(precoPrimeiroProduto <= precoSegundoProduto && precoPrimeiroProduto <= precoTerceiroProduto){
            System.out.println("Este é o preço mais barato (primeiro), pode comprar o produto. " + precoPrimeiroProduto);
        } else if (precoSegundoProduto <= precoPrimeiroProduto && precoSegundoProduto <= precoTerceiroProduto) {
            System.out.println("Este é o preço mais barato (segundo), pode comprar o produto. " + precoSegundoProduto);
        }else {
            System.out.println("Este é o preço mais barato (terceiro), pode comprar o produto. " + precoTerceiroProduto);
        }
    }
}
