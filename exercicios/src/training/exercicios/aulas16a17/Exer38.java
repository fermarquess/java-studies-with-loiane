package training.exercicios.aulas16a17;

import java.text.DecimalFormat;

public class Exer38 {

    public static void main(String[] args) {

        double salario = 1000; //1995

        double percentual = 1.5;

        salario += (salario/100) * percentual; //1996

        DecimalFormat format = new DecimalFormat("###,###.##");

        // a partir de 1997, o percentual de aumento deve ser o dobro do ano anterior

        for (int i = 1997; i<= 2023; i++){

            percentual *= 2;

            salario += (salario/100) * percentual;

            System.out.println("No ano de " + i + ", o salário foi de = " + format.format(salario) + " com o percentual de " + percentual + "%");

    }
}
}
