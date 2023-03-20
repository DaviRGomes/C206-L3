import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // iniciando as classes
        Deck d1 = new Deck();

        Carta c1 = new Carta();
        Carta c2 = new Carta();
        Carta c3 = new Carta();
        Carta c4 = new Carta();

        boolean i = true; // parametro para o while
        int saida; // entrada pra definir a opção que queira fazer

        // Declarando a entrada
        Scanner entrada = new Scanner(System.in);


        // Definindo valores das variaveis
        d1.dono = "Davi";

        c1.nome = "Valquiria";
        c1.poder = 15;
        c1.classificacao = "soldado";

        c2.nome = "Elfo";
        c2.poder = 22;
        c2.classificacao = "arqueiro";

        c3.nome = "alfa";
        c3.poder = 42;
        c3.classificacao = "arqueiro";

        d1.adicionarCarta(c1);
        d1.adicionarCarta(c2);
        d1.adicionarCarta(c3);


        while (i) {

            System.out.println("Favor digite de 1 a 5");
            saida = entrada.nextInt();

            switch (saida) {
                // adicionando carta
                case 1:
                    c4.nome = "Gladiador";
                    c4.poder = 25;
                    c4.classificacao = "pesados";
                    d1.adicionarCarta(c4);
                    break;
                // mostrando todas as informações
                case 2:
                    d1.mostrainfo();
                    break;
                // mostrando o poder medio do deck
                case 3:
                    d1.calculaPoderMedio();

                    break;
                // mostra a quantidade de tipos de cartas
                case 4:
                    d1.calculaClassificacao();
                    break;
                // finalizando o while
                case 5:
                    i = false;
                    break;
            }
        }
    }
}