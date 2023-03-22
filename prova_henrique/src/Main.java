import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declarar entrada
        Scanner entrada = new Scanner(System.in);
        // declarando uma unica estante
        Estante est1 = new Estante();
        // delarando as variaveis da estante
        est1.idEstante = 4543;
        est1.letra = 'D';

        // declarando varios livros
        Livro l1 = new Livro("O Senhor dos Anéis", "Drama", 1123, "Aurora");
        l1.autor.profissao = "Advogado";
        l1.autor.anoNascimento = 1988;
        l1.autor.nome = "Davi";
        Livro l2 = new Livro("B", "Suspense", 123, "Aurora");
        l2.autor.profissao = "Medico";
        l2.autor.anoNascimento = 1998;
        l2.autor.nome = "Francisco";
        Livro l3 = new Livro("C", "Suspense", 123, "Aurora");
        l3.autor.profissao = "Professor";
        l3.autor.anoNascimento = 1996;
        l3.autor.nome = "Evelyn";
        Livro l4 = new Livro("D", "Outros", 12, "Aurora");
        l4.autor.profissao = "Analista";
        l4.autor.anoNascimento = 2002;
        l4.autor.nome = "Christian";
        // l5 vai ser acionado apenas dentro do while no caso "a"
        Livro l5 = new Livro("E", "Outros", 1, "Aurora");
        l5.autor.profissao = "Engenheiro";
        l5.autor.anoNascimento = 2003;
        l5.autor.nome = "Marco";

        boolean aux = true;
        int aux2 = 0; // auxiliar pra verificar se foi add um novo livro
        String saida;

        // adicionando os livros definidos
        est1.adicionarLivro(l1);
        est1.adicionarLivro(l2);
        est1.adicionarLivro(l3);
        est1.adicionarLivro(l4);

        while (aux) {
            System.out.println("Favor digite de 'a' a 'e'");
            saida = entrada.nextLine();
            switch (saida) {
                // "a" - adicionando um novo livro
                case "a":
                    est1.adicionarLivro(l5);
                    aux2++;
                    break;
                case "b":
                    est1.porcentagemGen();
                    break;
                case "c":
                    est1.livroMaisEMenosPag();
                    break;
                case "d":
                    est1.mostraInfos();
                    l1.mostraInfos();
                    l1.autor.mostraInfos();
                    l2.mostraInfos();
                    l2.autor.mostraInfos();
                    l3.mostraInfos();
                    l3.autor.mostraInfos();
                    l4.mostraInfos();
                    l4.autor.mostraInfos();
                    // mostra o livro 5 caso voce chamou o 'a'
                    if (aux2 == 1) {
                        l5.mostraInfos();
                        l5.autor.mostraInfos();
                    }
                    break;
                case "e":
                    aux = false;
                    break;

            }
        }
        entrada.close();
    }

}