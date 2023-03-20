public class Main {
    public static void main(String[] args) {

        // criando o objeto restaurante
        Restaurante rest = new Restaurante("14. 953. 075/3718-00","Rua Henrique Del Castilho","Restaurante Toca");

        // criando o objeto fornecedor [0]
        rest.fornecedor[0] = new Fornecedor("Carnes", 15);

        // criando o objeto fornecedor [1]
        rest.fornecedor[1] = new Fornecedor("Legumes", 25);

        rest.mostraInfo();

    }
}