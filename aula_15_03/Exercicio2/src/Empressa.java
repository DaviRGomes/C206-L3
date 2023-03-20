public class Empressa {
    // declarando as variaveis
    String cnpj;
    String endereco;
    // agregação
    Contato contato[] = new Contato[10];

    public Empressa(String cnpj, String endereco) {
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public void mostraInfo() {
        System.out.println("Cnpj da empressa : " + cnpj);
        System.out.println("Endereco da empressa : " + endereco);
        System.out.println();
        for (int i = 0; i < contato.length; i++) {

            if (contato[i] != null) {
                System.out.println("Cliente : " + (i+1));
                System.out.println("Nome do cliente : " + contato[i].nome);
                System.out.println("Email do cliente : " + contato[i].email);
                System.out.println("Data de nascimento do cliente : " + contato[i].dataNascimento);
                System.out.println("Telefone do cliente : " + contato[i].telefone);
                System.out.println();
            }
        }
    }
}
