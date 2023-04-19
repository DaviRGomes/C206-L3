public class Lorde extends Pessoa implements Consagra{
    private String casa;
    private int qtdVassalos;

    public Lorde( String nome, int idade, int honra, String casa, int qtdVassalos) {
        super(nome, idade, honra);
        this.casa = casa;
        this.qtdVassalos = qtdVassalos;
    }

    @Override
    public void consagrarGuerreiro() {
        System.out.println(this.getNome() +" consagrou um novo cavaleiro");
        qtdVassalos +=1;
        System.out.println("Quantidade de vassalos aumentou em 1 unidade");
    }

    @Override
    public void orar() {
        System.out.println(this.getNome() + " fez uma oracao aos setes deuses");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Casa: " + casa);
        System.out.println("Quantidade de vassalos: " + qtdVassalos);
    }
}
