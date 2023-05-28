package List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Carrinho {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    /*
    public void mostrarProdutos() {
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome() + ", Preço: " + produto.getPreco());
        }
    }
      //pegando o valor total presente no cofre;
    public double getValorTotal() {
        for(Moeda m1 : m) {
            valor = valor + m1.getValor();
        }

        return valor;
    }

    //pegando a quantidade de moedas usando um metodo de array list chamado size:
    public int getQuantMoedas() {
        return m.size();
    }

    //pegando a moeda de maior valor usando um metodo de colections de array list chamado.max
    //que devolve o maior valor de uma array
    public Moeda getMoedaMaiorValor() {
        Moeda m1 =  Collections.max(m);
        return m1;
    }


    // ordenando as moedas por meio do metodo sort:
    public void ordenaMoedas() {
        Collections.sort(m);
        for(Moeda m1 : m) {
            System.out.println(m1.getValor());
        }
    }
     */


}