public class Produto {

    // declaraçao das variaveis
    int codigoSerie; // SN
    String codigoProduto; // codigo de barra sei la
    String nome; // nome do produto
    String categoria; // categoria do produto ( limpeza, belaza, utensilios, ... sei la)
    int quantidade; // quantidade de produtos que tem


    Produto(int codigoSerie, String codigoProduto, String nome, String categoria, int quantidade){
        this.codigoSerie = codigoSerie;
        this.codigoProduto = codigoProduto;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }



    // saida - metodo mostraInfo
    void mostraInfo(){
        System.out.println("Codigo de serie : " + codigoSerie);
        System.out.println("Codigo do produto : " + codigoProduto);
        System.out.println("Nome do produto : " + nome);
        System.out.println("Categoria do produto : " + categoria);
        System.out.println("Quantidade que tem do produto : " + quantidade);

    }
}
