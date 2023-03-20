import java.math.BigDecimal;
import java.math.RoundingMode;
public class Deck {
    String dono;
    // agregação
    Carta cartas[] = new Carta[10];


    // preencher o vetor Carta
    public void adicionarCarta(Carta carta) {
        for (int i = 0; i < cartas.length; i++) {
            // preenche o primeiro vetor que achar e esta vazio
            if (cartas[i] == null) {
                cartas[i] = carta;
                break;
            }
        }

    }
    // metodo de mostrar tudo

    public void mostrainfo() {
        System.out.println("Dono do deck : " + dono);

        for (int i = 0; i < cartas.length; i++) {
            // entra no if so se o vetor ja estiver preenchido
            if (cartas[i] != null) {

                System.out.println("Carta " + (i + 1) + " :");
                System.out.println("Nome da carta : " + cartas[i].nome);
                System.out.println("Classificação da carta : " + cartas[i].classificacao);
                System.out.println("Poder da carta : " + cartas[i].poder);
                System.out.println();
            }
        }
    }

    public void calculaPoderMedio() {
        double soma = 0; // soma final
        double aux = 0; // contador de posições preenchidas
        double fim;
        for (int i = 0; i < cartas.length; i++) {
            if (cartas[i] != null) {
                soma += cartas[i].poder;
                aux++;
            }
        }
        fim = soma/aux;

        // metodo para arredondar o decimal
        BigDecimal res = new BigDecimal(fim);
        // 2 indica quantidade de casas depois da virgula
        // RoundingMode.HALF_UP metodo padrão para o arredondamento
        res = res.setScale(2, RoundingMode.HALF_UP);

        System.out.println("Media de poder do deck : " + res);
        System.out.println();
    }

    public void calculaClassificacao() {
        int cont_sold = 0; // contador para soldados
        int cont_arq = 0; // contador para arqueiros
        int cont_pes = 0;// contador para pesados
        for (int i = 0; i < cartas.length; i++) {
            if (cartas[i] != null) {
                switch (cartas[i].classificacao) {
                    case "pesados":
                        cont_pes++;
                        break;
                    case "arqueiro":
                        cont_arq++;
                        break;
                    case "soldado":
                        cont_sold++;
                        break;
                }
            }
        }
        System.out.println("Quantidade de soldados no deck : " + cont_sold);
        System.out.println("Quantidade de arqueiro no deck : " + cont_arq);
        System.out.println("Quantidade de pesados no deck : " + cont_pes);
    }
}