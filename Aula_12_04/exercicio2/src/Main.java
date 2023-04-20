public class Main {
    public static void main(String[] args) {

        Mercadoria fg = new Fogao(4543, "Consul", "Otimo produto",549.99,5,"manual");
        Mercadoria gldr = new Geladeira(7652, "Consul", "Gelaredeira mais vendida",2249.99,1,300,"inox");

        if(fg instanceof Fogao){
            System.out.println("Comprando um fogao");
            Fogao fogao = (Fogao) fg;
            fogao.mostraInfo();
        }
        if(gldr instanceof Geladeira){
            System.out.println("Comprando uma geladeira");
            Geladeira geladeira = (Geladeira) gldr;
            geladeira.mostraInfo();
        }

    }
}