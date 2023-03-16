public class Carro {

    // declaração das variaveis
    String cor;
    String marca;
    String modelo;
    double velocidadeMaxima;
    double velocidadeAtual;
    Motor motor;

    public Carro(){

        motor = new Motor();

    }

    void ligar(){

        System.out.println("Ligando o carro");
        System.out.println();
    }

    void acelarar(){

        System.out.println("Velocidade agora esta: "+ velocidadeAtual);
        System.out.println();
    }

    void mostraInfo(){

        System.out.println("Mostrar as informações:");
        System.out.println("Nome : "+ cor);
        System.out.println("Marca : "+ marca);
        System.out.println("Modelo : "+ modelo);
        System.out.println("Velocidade atual : "+ velocidadeAtual);
        System.out.println("Velocidade maxima : "+ velocidadeMaxima);
        System.out.println();

    }

}
