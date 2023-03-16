public class Main {
    public static void main(String[] args) {
        // criando carro para a classe Carro
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        // declaração das variaveis por composição
        carro1.modelo = "Gol bolinha";
        carro1.cor = "Roxo";
        carro1.marca = "Volkswagen";
        carro1.velocidadeAtual = 80;
        carro1.velocidadeMaxima = 300;
        carro1.motor.potencia = 50;
        carro1.motor.tipo = "Motor 1.2";

        carro2.modelo = "Palio";
        carro2.cor = "Preto";
        carro2.marca = "Fiat";
        carro2.velocidadeAtual = 130;
        carro2.velocidadeMaxima = 240;
        carro2.motor.potencia = 80;
        carro2.motor.tipo = "Motor 1.8";

        // saida dos metodos na composição
        carro1.ligar();
        carro1.acelarar();
        carro1.mostraInfo();

        carro2.ligar();
        carro2.acelarar();
        carro2.mostraInfo();
    }
}