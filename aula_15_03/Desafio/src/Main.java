import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String nome[] = new String[4];
        nome[0] = "Jaqueline";
        nome[1] = "Franscisco";
        nome[2] = "Davi";
        nome[3] = "Evelyn";

        Arrays.sort(nome);

        for (int i = 0; i < nome.length; i++) {
            System.out.println("Nome : " + nome[i]);

        }
    }
}