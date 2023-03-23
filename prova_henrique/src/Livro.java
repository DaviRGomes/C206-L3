public class Livro {
    String titulo;
    String genLiterario;
    int qtdFolhas;
    String editora;
    Autor autor;

    public Livro(String titulo, String genLiterario, int qtdFolhas, String editora) {
        this.titulo = titulo;
        this.genLiterario = genLiterario;
        this.qtdFolhas = qtdFolhas;
        this.editora = editora;
        autor = new Autor();
    }

    public void mostraInfos(){
        System.out.println("Titulo do livro :" + titulo);
        System.out.println("Genero do livro :" + genLiterario);
        System.out.println("Quantidade de folhas do livro :" + qtdFolhas);
        System.out.println("Editora do livro :" + editora);
        autor.mostraInfos();

    }

}
