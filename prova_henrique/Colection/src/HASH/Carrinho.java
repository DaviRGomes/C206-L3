package HASH;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;

public class Carrinho {

    private Map<String, Produto> produtos = new HashMap<>();

    public void addProduto(Produto produto) {
        produtos.put(produto.getNome(), produto);
    }

    public Map<String, Produto> getProdutos() {
        return produtos;
    }

    public void mostrarProdutos() {
        System.out.println("Lista de Produtos no Carrinho:");
        for (Produto produto : produtos.values()) {
            System.out.println("Nome: " + produto.getNome() + ", Preço: " + produto.getPreco());
        }
    }
}
