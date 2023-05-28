package Hash;

import List.Carrinho;
import List.Produto;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        List.Carrinho c = new Carrinho();
        List.Produto p1 = new List.Produto();
        p1.setNome("davi");
        p1.setPreco(10.99);

        List.Produto p2 = new List.Produto();
        p2.setNome("sdfa");
        p2.setPreco(14);

        List.Produto p3 = new List.Produto();
        p3.setNome("asafsd");
        p3.setPreco(1.57);

        c.addProduto(p1);
        c.addProduto(p2);
        c.addProduto(p3);


        // Mostrar a lista de produtos do carrinho
        System.out.println("Lista de Produtos no Carrinho:");
        for (Produto produto : c.getProdutos()) {
            System.out.println("Nome: " + produto.getNome() + ", Preço: " + produto.getPreco());
        }

    }
}
