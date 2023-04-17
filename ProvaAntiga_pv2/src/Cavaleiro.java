public class Cavaleiro extends Pessoa implements  Patrulha, Consagra{
    private String casa;
    private String nomeEscudeiro;
    public int aux;
    Montaria montaria;

    public Cavaleiro( String nome, int idade, int honra, String casa, String nomeEscudeiro) {
        super( nome, idade, honra);
        this.casa = casa;
        this.nomeEscudeiro = nomeEscudeiro;
    }

    @Override
    public void fazerPatrulha() {
        System.out.println(this.getNome() + " fez patrula no reino");
    }

    @Override
    public void consagrarGuerreiro() {
        System.out.println(this.getNome()+ " consagrou um novo cavaleiro");
        setHonra(5);
        System.out.println("Honra aumenta em 5 unidades");
    }

    @Override
    public void orar() {
        System.out.println(getNome() + " fez uma oracao ao deus do fogo");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Casa: " + casa);
        System.out.println("Nome do escudeiro: " + nomeEscudeiro);
    }
}
