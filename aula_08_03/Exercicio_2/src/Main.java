public class Main {
    public static void main(String[] args) {
        // criando mt para motor
        Motor mt = new Motor();

        // declaração das variaveis por composição
        mt.veiculo.modelo = "Gol bolinha";
        mt.veiculo.cor = "Roxo";
        mt.veiculo.marca = "Volkswagen";
        mt.veiculo.velocidadeAtual = 80;
        mt.veiculo.velocidadeMaxima = 300;

        // saida dos metodos na composição
        mt.veiculo.ligar();
        mt.veiculo.acelarar();
        mt.veiculo.mostraInfo();
    }
}