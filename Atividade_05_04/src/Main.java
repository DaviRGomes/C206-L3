import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        double preco;

        Notebook note = new Notebook();
        double armazenamento;
        String gpu;
        String processador;

        Camiseta camiseta = new Camiseta();
        String cor;
        String tamanho;

        boolean flag = true;
        int aux = 0; // quant de compras
        int produto;
        for (int i = 0; i < 2; i++) {
            produto = entrada.nextInt();
            entrada.nextLine(); // consumir a quebra de linha deixada pela entrada anterior
            switch (produto) {
                case 1: // notebook
                    nome = entrada.nextLine();
                    preco = entrada.nextDouble();
                    entrada.nextLine(); // consumir a quebra de linha deixada pela entrada anterior
                    armazenamento = entrada.nextDouble();
                    entrada.nextLine(); // consumir a quebra de linha deixada pela entrada anterior
                    gpu = entrada.nextLine();
                    processador = entrada.nextLine();
                    note.nome = nome;
                    note.preco = preco;
                    note.setArmazenamento(armazenamento);
                    note.setGpu(gpu);
                    note.setProcessador(processador);
                    note.etiquetaPreco();
                    break;

                case 2: // camiseta
                    nome = entrada.nextLine();
                    preco = entrada.nextDouble();
                    entrada.nextLine(); // consumir a quebra de linha deixada pela entrada anterior
                    cor = entrada.nextLine();
                    tamanho = entrada.nextLine();
                    camiseta.nome = nome;
                    camiseta.preco = preco;
                    camiseta.setCor(cor);
                    camiseta.setTamanho(tamanho);
                    camiseta.etiquetaPreco();
                    break;

                default:
                    i -= 1;
                    System.out.println("Digite um valor correto");
            }
        }
    }
}