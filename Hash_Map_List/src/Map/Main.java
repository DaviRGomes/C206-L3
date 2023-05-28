package Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
        p3.setNome("dsafsd");
        p3.setPreco(1.57);

        c.addProduto(p1);
        c.addProduto(p2);
        c.addProduto(p3);

        // Mostrar a lista de produtos do carrinho
        c.mostrarProdutos();
    }
}