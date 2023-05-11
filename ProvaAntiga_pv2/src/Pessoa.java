public abstract class Pessoa {
    public static int qtdPessoas = 0;
    private  String nome;
    private int idade;
    private int honra;
    Arma arma;
    public Pessoa(String nome, int idade, int honra) {
        this.qtdPessoas ++;
        this.nome = nome;
        this.idade = idade;
        this.honra = honra;
    }

    public String getNome() {
        return nome;
    }

    // metodo para aumentar a honra do cavaleiro
    public void setHonra(int honra) {
        this.honra += honra;
    }
    // metodo para contar quantas pessoas foram criadas
    public static int getQtdPessoas() {
        return qtdPessoas;
    }

    public void mostraInfo(){
       System.out.println("Nome: " + nome);
       System.out.println("Idade: " + idade);
       System.out.println("Honra: " + honra);
       if(arma != null){
           System.out.println("Arma: " + arma.getTipo());
       }
   }

   public void orar(){
   }
}
