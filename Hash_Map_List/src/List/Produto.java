package List;

import java.util.Collection;
import java.util.function.IntFunction;
public class Produto implements Comparable<Produto> {

    private String nome;
    private double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Produto outroProduto) {
        // compara valor
       // return Double.compare(this.preco, outroProduto.preco);
        // compara caracter
       return this.getNome().compareTo(outroProduto.getNome());

    }
}