public class Autor {
    String nome;
    int anoNascimento;
    String profissao;


    public void mostraInfos(){
        System.out.println("Nome do autor :" + nome);
        System.out.println("Ano de nascimento do autor :" + anoNascimento);
        System.out.println("Profissao do autor :" + profissao);
        System.out.println();
    }
}
