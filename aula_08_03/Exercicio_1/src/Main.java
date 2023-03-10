public class Main {
    public static void main(String[] args) {

        // metedo de saida usando os construtores
        Produto p1 = new Produto(26174, "APM30", "Maionese", "Alimenticio", 10 );
        p1.mostraInfo();

        // quebra de linha
        System.out.println();

        Produto p2 = new Produto(42342, "APEM2129MSDA", "RRU-1800/2100. Negocio da Huawei", "Telecomunicações", 3 );
        p2.mostraInfo();


        /*
        // saida chamando pelo metedo
        p1.codigoSerie = 26174;
        p1.codigoProduto = "APM30";
        p1.nome = "Maionese";
        p1.categoria = "Alimenticio";
        p1.quantidade = 10;

        p1.mostraInfo();

        p2.codigoSerie = 42342;
        p2.codigoProduto = "APEM2129MSDA";
        p2.nome = "RRU-1800/2100. Negocio da Huawei";
        p2.categoria = "Telecomunicações";
        p2.quantidade = 3;

        p2.mostraInfo();
        */
    }
}