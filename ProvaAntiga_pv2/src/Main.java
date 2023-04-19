public class Main {
    public static void main(String[] args) {
        // declarando as variaveis
        Pessoa pessoa[] = new Pessoa[3];
        Pessoa L = new Lorde("Davi", 18, 10, "Rosa", 2);
        // declarando arma para o Lorde
        L.arma = new Arma("pistola");
        Pessoa G = new Guarda("Gabriel", 32, 13, 9);
        G.arma = new Arma("espada");
        Pessoa C = new Cavaleiro("Marcos", 23, 15, "Sagitario", "Pedro");



        pessoa[0] = L;
        pessoa[1] = G;
        pessoa[2] = C;


        for (int j = 1; j <= 2; j++) {
            if (j == 2)
                System.out.println("Mostrando as alteracoes");
            for (int i = 0; i < pessoa.length; i++) {
                if (pessoa[i] instanceof Lorde) {
                    System.out.println("Lorde");
                    Lorde lorde = (Lorde) pessoa[i];
                    lorde.mostraInfo();
                    lorde.consagrarGuerreiro();
                    lorde.orar();

                    System.out.println();
                }
                if (pessoa[i] instanceof Guarda) {
                    System.out.println("Guarda");
                    Guarda guarda = (Guarda) pessoa[i];
                    guarda.mostraInfo();
                    guarda.fazerPatrulha();
                    guarda.orar();
                    System.out.println();
                }
                if (pessoa[i] instanceof Cavaleiro) {
                    System.out.println("Cavaleiro");
                    Cavaleiro cavaleiro = (Cavaleiro) pessoa[i];
                    cavaleiro.montaria = new Montaria("Cavalo de raca pura");
                    cavaleiro.mostraInfo();
                    cavaleiro.consagrarGuerreiro();
                    cavaleiro.fazerPatrulha();
                    cavaleiro.orar();
                    System.out.println();
                }
            }
        }
        System.out.println("Quantidade de pessoas: " + Pessoa.getQtdPessoas());
    }

}