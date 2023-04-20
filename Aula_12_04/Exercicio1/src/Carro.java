public class Carro implements Controle {

    private double valor;
    private String cor;
    private int  ano;

    public Carro(double valor, String cor, int ano) {
        this.valor = valor;
        this.cor = cor;
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public void mostraInfo() {
        System.out.println("Valor: " + valor);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }

    @Override
    public void taxa() {
        System.out.println("taxa alta");
    }
}
