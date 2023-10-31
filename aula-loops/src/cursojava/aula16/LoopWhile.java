package cursojava.aula16;

public class LoopWhile {

    public static void main(String[] args) {

        int i = 1; //contador

        int max = 10;

        System.out.println("Contando até " + max);
        //while
        while (i <= max){
            System.out.println("Valor de i: " + i);
            i++;
        }
        System.out.println(i);

        //do e while
        do {
            i++;
            System.out.println("Valor de i: " + i);
        } while (i < 11);

        System.out.println(i);

    }

}
