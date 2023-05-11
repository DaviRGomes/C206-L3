package Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // declarando scanner

        float x = 10, y = 0; // variveis da calculadora
        String op;
        System.out.println("Variavel x");
        x = entrada.nextFloat();
        entrada.nextLine();

        System.out.println("Variavel y");
        y = entrada.nextFloat();
        entrada.nextLine();

        System.out.println("Operacao que queira fazer");
        op = entrada.nextLine();

        if (op == "+") {
            System.out.println("res = " + (x + y));
        } else if (op == "-") {
            System.out.println("res = " + (x - y));
        } else if (op == "*") {
            System.out.println("res = " + (x * y));
        } else if (op == "/") {

            try {
                System.out.println("res = " + (x / y));
            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } else {
            System.out.println("Operação inválida!");
        }

    }
}