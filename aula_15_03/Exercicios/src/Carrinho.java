public class Carrinho {

    double total;

    Produto[] produtos = new Produto[10];

    public Carrinho(double total) {

        this.total = total;
    }

    // Metodo para preencher  o vetor produto
    public void addProdutos(Produto novoProdutos) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == null) {
                produtos[i] = novoProdutos;
                break;
            }
        }
    }
    // Metodo pra mostrar todas as informaçoes do produto
    public  void exibirInfos () {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null) {
                System.out.println("Nome : " +produtos[i].nome);
                System.out.println("Fabricante : " +produtos[i].fabricante);
                System.out.println("Descrição : " +produtos[i].descricao);
                System.out.println("Preço : " +produtos[i].preco);
                System.out.println();
            }
        }
    }

    // Metodo pra mostrar a soma total do carrinho
    public  double calculaTotal () {
        int soma = 0;
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null) {
                soma += produtos[i].preco;
            }
        }
        return soma;
    }

}