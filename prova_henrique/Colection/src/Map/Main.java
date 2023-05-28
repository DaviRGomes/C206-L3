package Map;

import HASH.Carrinho;
import HASH.Produto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        HASH.Carrinho c = new Carrinho();
        HASH.Produto p1 = new HASH.Produto();
        p1.setNome("davi");
        p1.setPreco(10.99);

        HASH.Produto p2 = new HASH.Produto();
        p2.setNome("sdfa");
        p2.setPreco(14);

        HASH.Produto p3 = new HASH.Produto();
        p3.setNome("asafsd");
        p3.setPreco(1.57);

        c.addProduto(p1);
        c.addProduto(p2);
        c.addProduto(p3);


        // Mostrar a lista de produtos do carrinho em ordem
        c.mostrarProdutos();
    }
}