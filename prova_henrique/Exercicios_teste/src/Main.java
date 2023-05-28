
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // declarando entrada
        Scanner entrada = new Scanner(System.in);

        // Instanciando classes
        Carrinho carrinho = new Carrinho(12);

        // definindo o tamanho do vetor produto da classe
        Produto p[]= new Produto[10];

        // Definindo valores das variaveis

        int i =0;
        int res; // define se quer continuar ou não

        while (i < 10) {

           // define se quer continuar ou não
            res = entrada.nextInt();
            // se for igual a 1 entra e preencher uma posição do vetor
            if ( res == 1)   {
                entrada.nextLine();
                p[i] = new Produto(); // instanciando o produto para todas as posições do vetor
                p[i].nome = entrada.nextLine();
                p[i].preco = entrada.nextInt();
                carrinho.addProdutos(p[i]);
            }
            // se for diferente de 1 para o while e ja joga na saida
            else
                break;

            System.out.println("Continuar a preencher o vetor?");
            i++;
        }

        // saida
        carrinho.exibirInfos();
        System.out.println("Preço total : " + carrinho.calculaTotal());

    }

}