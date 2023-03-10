public class Carro {

    // declaração das variaveis
    String cor;
    String marca;
    String modelo;
    double velocidadeMaxima;
    double velocidadeAtual;

    void ligar(){

        System.out.println("Ligando o carro, velocidade: 0");
        System.out.println();
    }

    void acelarar(){

        System.out.println("Velocidade agora esta: "+ velocidadeAtual);
        System.out.println();
    }

    void mostraInfo(){

        System.out.println(cor);
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(velocidadeAtual);
        System.out.println(velocidadeMaxima);
        System.out.println();

    }

}
