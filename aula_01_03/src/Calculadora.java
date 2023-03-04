import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {

        // declaração de variaveis
        Scanner entrada = new Scanner(System.in);

        double nota_1; // primeiro valor pra entrar
        double nota_2; // segundo valor pra entrar
        char operator; // opção que vai fazer

        // entrada
        System.out.println("Favor inserir a primeira variavel: ");
        nota_1 = Double.parseDouble(entrada.nextLine());

        System.out.println("Favor inserir a segunda variavel: ");
        nota_2 = Double.parseDouble(entrada.nextLine());

        System.out.println("Favor a opção pra fazer a equação, digite apenas o simbolo da operação: ");
        System.out.println("Opção 1 eh: soma ( + )");
        System.out.println("Opção 2 eh: subtração ( - )");
        System.out.println("Opção 3 eh: multiplicação ( * )");
        System.out.println("Opção 4 eh: divisão ( / )");
        System.out.println("Opção 5 eh: exponencial ( ^ )");


        operator = entrada.next().charAt(0);

        // saida
        switch (operator){
            case '+':
                System.out.println("O resultado eh: "+(nota_2 + nota_1) );
                break;
            case '-':
                System.out.println("O resultado eh: "+(nota_1 - nota_2) );
                break;
            case '/':
                System.out.println("O resultado eh: "+(nota_1/nota_2) );
                break;
            case '*':
                System.out.println("O resultado eh: "+(nota_2*nota_1) );
                break;
            default:
                System.out.println("O resultado eh: "+ java.lang.Math.pow(nota_1, nota_2));
                break;
        }
    }
}