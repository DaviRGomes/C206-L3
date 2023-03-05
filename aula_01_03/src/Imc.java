import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Imc {

    public static void main(String[] args) {

        // declarção de variaveis
        double peso; // peso da pessoa
        double altura; // altura da pessoa
        double imc; // valor final da operação
        double soma; // valor da altura elevado por 2

        // entrada das variaveis

        Scanner entrada = new Scanner(System.in);

        System.out.println("Favor inserir o seu peso");

        peso = Double.parseDouble(entrada.nextLine());

        System.out.println("Favor inserir a sua altura");

        altura = Double.parseDouble(entrada.nextLine());

        entrada.close();

        // soma da equação
        soma = java.lang.Math.pow(altura, 2);

        imc = peso/soma;

        // metodo para arredondar o decimal
        BigDecimal res = new BigDecimal(imc);
        // 2 indica quantidade de casas depois da virgula
        // RoundingMode.HALF_UP metodo padrão para o arredondamento
        res = res.setScale(2, RoundingMode.HALF_UP);

        // saida

        if (imc <= 18.5) {
                System.out.println("O seu IMC eh: " + res + " voce esta abaixo do peso");
        }

        else if ((imc >= 18.5) && (imc <= 24.9)) {
            System.out.println("O seu IMC eh: " + res + " voce esta no peso ideal");
        }

        else if ((imc >= 24.9) && (imc <= 29.9) ){
            System.out.println("O seu IMC eh: " + res + " voce esta levemente acima do peso");
        }

        else if ((imc >= 30.0) && (imc <= 34.9) ){
            System.out.println("O seu IMC eh: " + res + " voce esta com obesidade de grua I");
        }

        else if ((imc >= 35.0) && (imc <= 39.9) ){
            System.out.println("O seu IMC eh: " + res + " voce esta com obesidade de grua II (severa)");
        }

        else
            System.out.println("O seu IMC eh: " + res + " voce esta com obesidade de grua III (mórbida)");

    }
}