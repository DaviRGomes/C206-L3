public class Main {
    public static void main(String[] args) {

        Carro suv = new SUV(122.32,"laranja",2015,"12");

        SUV Suv = (SUV) suv;
        Suv.mostraInfo();
        Suv.taxa();

    }
}