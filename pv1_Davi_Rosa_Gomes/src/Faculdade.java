public class Faculdade {
    String nome;
    String cnpj;
    Aluno aluno;


    // construtor
    public Faculdade(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    // metodo para mostrar as informções da faculdade
    public void  exibirInfos(){
        System.out.println("Informacoes da faculdade");
        System.out.println("Nome da faculdade : " + nome);
        System.out.println("Cnpj da faculdade : " + cnpj);
        System.out.println();
    }
}
