public class Produto implements Comparable<Produto>{

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
       // return Double.compare(this.preco, outroProduto.preco);
        return this.getNome().compareTo(outroProduto.getNome());
    }
}
