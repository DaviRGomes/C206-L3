public class Geladeira extends Mercadoria{
    private int quantidadePortas;
    private int tamanho;
    private String tipo;

    public Geladeira(int codigo, String fabricante, String descricao, double valor, int quantidadePortas, int tamanho, String tipo) {
        super(codigo, fabricante, descricao, valor);
        this.quantidadePortas = quantidadePortas;
        this.tamanho = tamanho;
        this.tipo = tipo;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Quantidade de portas: " + quantidadePortas);
        System.out.println("Tamanho: " + tamanho + " litros");
        System.out.println("Tipo: " + tipo);
        System.out.println();
    }
}
