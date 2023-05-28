import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Carrinho c = new Carrinho();
        Produto p1 = new Produto();
        p1.setNome("davi");
        p1.setPreco(10.99);

        Produto p2 = new Produto();
        p2.setNome("sdfa");
        p2.setPreco(14);

        Produto p3 = new Produto();
        p3.setNome("asafsd");
        p3.setPreco(1.57);

        c.addProduto(p1);
        c.addProduto(p2);
        c.addProduto(p3);

        //Ordenar a lista de produtos pelo preço
       Collections.sort(c.getProdutos());
        /*
        // Mostrar a lista de produtos do carrinho em ordem
        System.out.println("Lista de Produtos no Carrinho em ordem:");
        for (Produto produto : c.getProdutos()) {
            System.out.println("Nome: " + produto.getNome() + ", Preço: " + produto.getPreco());
        }
        */
        Collections.reverse(c.getProdutos());

        // Mostrar a lista de produtos do carrinho em ordem
        System.out.println("Lista de Produtos no Carrinho em ordem:");
        for (Produto produto : c.getProdutos()) {
            System.out.println("Nome: " + produto.getNome() + ", Preço: " + produto.getPreco());
        }
    }
}