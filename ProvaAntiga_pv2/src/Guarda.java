public class Guarda extends Pessoa implements Patrulha{
    private int coragem;

    public Guarda(String nome, int idade, int honra, int coragem) {
        super(nome, idade, honra);
        this.coragem = coragem;
    }

    @Override
    public void fazerPatrulha() {
        System.out.println( this.getNome() + " fez uma patrulha além da muralha");
        coragem +=20;
        System.out.println("Coragem foi aumentada em 20 unidades");
    }

    @Override
    public void orar() {
        System.out.println(this.getNome() + " fez uma oracao aos deuses antigos");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Coragem: " + coragem);
    }

}
