import java.util.ArrayList;
import java.util.Collections;

public class Carrinho {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    void addProduto(Produto produto) {
        produtos.add(produto);
    }

    /*
    public void mostrarProdutos() {

        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome() + ", Preço: " + produto.getPreco());
        }
    }
    */

}
