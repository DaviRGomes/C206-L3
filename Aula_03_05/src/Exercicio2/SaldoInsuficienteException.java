package Exercicio2;

public class SaldoInsuficienteException  extends RuntimeException{
    public SaldoInsuficienteException(String msn) {
        super(msn);
    }
}