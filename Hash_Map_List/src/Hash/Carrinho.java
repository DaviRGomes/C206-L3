package Hash;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Carrinho {

    private Set<Produto> produtos = new HashSet<>();
   // private Set<Produto> produtos = new LinkedHashSet<>();

    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }

    public Set<Produto> getProdutos() {
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