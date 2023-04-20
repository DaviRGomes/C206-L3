public class SUV extends Carro{
    private String tracao;

    public SUV(double valor, String cor, int ano, String tracao) {
        super(valor, cor, ano);
        this.tracao = tracao;
    }
    public String getTracao() {
        return tracao;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Tracao: " + tracao);
    }
}
