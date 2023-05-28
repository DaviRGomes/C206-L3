package Exercicio2;

public class Main {
    public static void main(String[] args) {

        Conta c1 = new Conta(100,1221,"das",100);

        c1.depositar(200);
        try {
            c1.sacar(500);
        }catch (SaldoInsuficienteException e){
            System.out.println("Saldo insuficiente");
        }
    }
}
