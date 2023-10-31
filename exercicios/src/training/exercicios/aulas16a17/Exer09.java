package training.exercicios.aulas16a17;

public class Exer09 {

    public static void main(String[] args) {

        //  imprimindo somente os números ímpares de 1 a 50

        for (int i = 1; i < 50; i++){
            // para ser número par é necessário que seja divisível por dois
            if (i % 2 !=0){
               // System.out.println(i);
                System.out.print(i + " ");
            }
        }

    }
}
