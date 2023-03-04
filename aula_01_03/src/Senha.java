import java.util.Scanner;
public class Senha {

    public static void main(String[] args) {

        //declarando variaveis
        Scanner entrada = new Scanner(System.in);

        int senha; // entrada - senha

        System.out.println("Favor inserir uma senha: ");
        // primira entrada do valor senha
        senha = entrada.nextInt();

        // caso seja errada entra no while
        while( senha != 2022){

            System.out.println("Senha invalida");
            // entrada do valor senha ate esta correto
            senha = entrada.nextInt();

        }

        System.out.println("Acesso permitido");

    }
}
