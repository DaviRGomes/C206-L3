public class Mercadoria implements Interface{
    private int codigo;
    private String  fabricante;
    private String descricao;
    private double valor;

    //setter
    public Mercadoria(int codigo, String fabricante, String descricao, double valor) {
        this.codigo = codigo;
        this.fabricante = fabricante;
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public void mostraInfo() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Descricacao: " + descricao);
        System.out.println("Valor: R$ " + valor);
    }
}
