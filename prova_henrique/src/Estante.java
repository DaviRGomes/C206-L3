import java.util.Arrays;

public class Estante {
    int idEstante;
    char letra;
    Livro livros[] = new Livro[120];

    public void adicionarLivro(Livro livro) {
        for (int i = 0; i < livros.length; i++) {
            // preenche o primeiro vetor que achar e esta vazio
            if (livros[i] == null) {
                livros[i] = livro;
                break;
            }
        }
    }

    public void porcentagemGen() {
        double Drama_por; // porcentagem dos filmes de drama
        double Suspense_por; // porcentagem dos filmes de suspense
        double Or_por; // porcentagem dos filmes outros
        double Drama_cont = 0; // contador dos filmes de drama
        double Suspense_cont = 0; // contador dos filmes de drama
        double Or_cont = 0; // contador dos filmes de drama
        double cont = 0; // contador total de livros

        for (int i = 0; i < livros.length; i++) {
            // faz varredura e entra a posição que estiver preenchida
            if (livros[i] != null) {
                // entra se o genero for Drama e faz uma contagem
                if (livros[i].genLiterario == "Drama") {
                    Drama_cont++;
                }
                // entra se o genero for Suspense e faz uma contagem
                else if (livros[i].genLiterario == "Suspense") {
                    Suspense_cont++;
                }
                // entra se o genero for Outros e faz uma contagem
                else {
                    Or_cont++;
                }
                // faz contagem total de livros
                cont++;
            }
        }
        // faz as contas de porcentagem
        Drama_por = Drama_cont * 100 / cont;
        Suspense_por = Suspense_cont * 100 / cont;
        Or_por = Or_cont * 100 / cont;

        // saida desse metodo
        System.out.println("Porcentagem de livros de Drama eh : " + Drama_por + "%");
        System.out.println("Porcentagem de livros de Suspense eh : " + Suspense_por + "%");
        System.out.println("Porcentagem de livros de Outros eh : " + Or_por + "%");
    }

    public void livroMaisEMenosPag() {

        int menor_quant = 120; // termo pra ficar alterando
        int menor = 120; // posição do livro com menor quantidade
        int maior_quant = 0; // termo pra ficar alterando
        int maior = 0; // posição do livro com maior quantidade

        for (int i = 0; i < livros.length - 1; i++) {
            if (livros[i] != null) {
                // vai atulizando ate achar o livro  com menor quantidade de paginas
                if (livros[i].qtdFolhas < menor_quant) {
                    menor_quant = livros[i].qtdFolhas;
                    menor = i;
                }
                if (livros[i].qtdFolhas > maior_quant) {
                    maior_quant = livros[i].qtdFolhas;
                    maior = i;
                }
            }
        }
        System.out.println("Livro com mais paginas:");
        System.out.println("Titulo do livro :" + livros[maior].titulo);
        System.out.println("Genero do livro :" + livros[maior].genLiterario);
        System.out.println("Quantidade de folhas do livro :" + livros[maior].qtdFolhas);
        System.out.println("Editora do livro :" + livros[maior].editora);
        System.out.println("Nome do autor :" + livros[maior].autor.nome);
        System.out.println("Ano de nascimento do autor :" + livros[maior].autor.anoNascimento);
        System.out.println("Profissao do autor :" + livros[maior].autor.profissao);
        System.out.println();

        System.out.println("Livro com menos paginas:");
        System.out.println("Titulo do livro :" + livros[menor].titulo);
        System.out.println("Genero do livro :" + livros[menor].genLiterario);
        System.out.println("Quantidade de folhas do livro :" + livros[menor].qtdFolhas);
        System.out.println("Editora do livro :" + livros[menor].editora);
        System.out.println("Nome do autor :" + livros[menor].autor.nome);
        System.out.println("Ano de nascimento do autor :" + livros[menor].autor.anoNascimento);
        System.out.println("Profissao do autor :" + livros[menor].autor.profissao);
        System.out.println();
    }

    public void mostraInfos() {
        System.out.println("ID da estante : " + idEstante);
        System.out.println("Letra da estante : " + letra);
        System.out.println();
    }
}
