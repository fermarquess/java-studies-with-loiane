package cursojava.estudos;

public class Arrays {

    public static void main(String[] args) {

        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.7;

        //imprimindo determinada temperatura
        System.out.println("O valor da temperatudo do dia 1 é: " + temperaturas[0]);

        //consultando a quantidade de espaço neste array
        System.out.println("O tamanho do array é: " + temperaturas.length);

        //apontando para o endereço em memória
        System.out.println("O valor do array: " + temperaturas);

        //padrão para iterar um array - mostrando os dados do array na tela
        for (int i = 0; i < temperaturas.length; i++){
            System.out.println("O valor da temperatura do dia " + (i+1) + "é " + temperaturas[i]);
        }
        //outra maneira de fazer o for, mas neste caso só temos acesso ao valor.
        for (double temp : temperaturas){
            System.out.println(temp);
        }

    }
}
