public class Cliente {
    String nome;
    int cpf;
    Computador computador[] = new Computador[15];

    public Cliente(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public float calcula() {
        float soma = 0;
        for (int i = 0; i < computador.length; i++) {
            if (computador[i] != null) {
                soma += computador[i].preco;
            }

        }
        return soma;
    }
}