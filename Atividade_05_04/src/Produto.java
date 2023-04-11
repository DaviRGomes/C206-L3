public class Produto {

    // variaveis
    String nome;
    double preco;

    public String  etiquetaPreco(){
        System.out.println("Nome: "+ nome);
        System.out.println("Preco: R$"+ preco);
        return nome;
    }
}
