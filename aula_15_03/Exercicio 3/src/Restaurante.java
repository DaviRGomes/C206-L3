public class Restaurante {
    String cnpj;
    String endereco;
    String nome;
    // agregação
    Fornecedor fornecedor [] = new Fornecedor[10];


    public Restaurante(String cnpj, String endereco, String nome) {
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.nome = nome;
    }

    public void mostraInfo() {
        System.out.println("Cnpj do restaurante : " + cnpj);
        System.out.println("Endereco do restaurante : " + endereco);
        System.out.println("Nome do restaurante : " + nome);
        System.out.println();
        for (int i = 0; i < fornecedor.length; i++) {

            if (fornecedor[i] != null) {
                System.out.println("Fornecedor : " + (i+1));
                System.out.println("Nome do  fornecedor : " + fornecedor[i].tipo);
                System.out.println("Quantidade de " + fornecedor[i].tipo +  " : " + fornecedor[i].quantidade);
                System.out.println();
            }
        }
    }
}
