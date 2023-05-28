package Exercicio2;

public class Conta {

    private float saldo;
    private int numero;
    private String nome;
    private float limite;


    public Conta(float saldo, int numero, String nome, float limite) {
        this.saldo = saldo;
        this.numero = numero;
        this.nome = nome;
        this.limite = limite;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {

        if (valor < saldo + limite) {
            this.saldo -= valor;
            System.out.println("Saque concluido");

        } else {
            throw new SaldoInsuficienteException("Saldo Insuficiente");

        }

    }


}
