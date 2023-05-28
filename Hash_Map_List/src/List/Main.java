package List;

import java.util.Collections;

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

        // Mostrar a lista de produtos do carrinho
        // c.mostrarProdutos();

        Collections.sort(c.getProdutos());
        // modo decrecente Collections.reverse(c.getProdutos());
        // Mostrar a lista de produtos do carrinho
        System.out.println("Lista de Produtos no Carrinho:");
        for (Produto produto : c.getProdutos()) {
            System.out.println("Nome: " + produto.getNome() + ", Preço: " + produto.getPreco());
        }

    }
}

