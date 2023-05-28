package Map;
import HASH.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Carrinho {

    //private Set<Produto> produtos = new LinkedHashSet<>();// em ordem de inserir
    private Set<HASH.Produto> produtos = new HashSet<>();// aleatorio
    public void setProdutos(HashSet<HASH.Produto> produtos) {
        this.produtos = produtos;
    }

    public Set<HASH.Produto> getProdutos() {
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
