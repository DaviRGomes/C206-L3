public class Main {
    public static void main(String[] args) {

        // Instanciando classes
        Carrinho carrinho = new Carrinho(12);

        Produto p1 = new Produto();
        Produto p2 = new Produto();

        // Definindo valores das variaveis
        p1.nome = "Blusa";
        p1.preco = 45;
        p1.descricao = "Blusa com estampa do The Rocky";
        p1.fabricante = "Renner";

        p2.nome = "Blusa de futebol";
        p2.preco = 180;
        p2.descricao = "Blusa do Corinthians";
        p2.fabricante = "Nike";


        // Adicionando no vetor
        carrinho.addProdutos(p1);
        carrinho.addProdutos(p2);

        // saida
        {
            carrinho.exibirInfos();
            System.out.println("Preço total : " + carrinho.calculaTotal());
        }
    }
}