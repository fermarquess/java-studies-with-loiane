package training.exercicios.aulas16a17;

public class Exer16 {

    public static void main(String[] args) {


        int primeiro = 1;
        int segundo = 1;
        int proximo = 0;

        System.out.println(primeiro);
        System.out.println(segundo);

        //1,1,2,3,5

        while (proximo <= 500){

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.println(proximo);

        }


    }
}
