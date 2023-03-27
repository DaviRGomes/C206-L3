import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        // criando uma unica classe cliente
        Cliente c1 = new Cliente("Davi", 22313);
        // Promoção 1
        Computador comp1 = new Computador("Positivo", 2300, "Linux Ubuntu", 32,  8, "Gb de HD",500, "Pentium Core i3", 2200);
        MemoriaUSB usb1 = new MemoriaUSB("Pen drive Gb", 16);
        comp1.addMemoria(usb1);
        // Promoção 2
        Computador comp2 = new Computador("Acer", 5800, "Windows 8", 64,16 ,"Tb de HD",1,"Pentium Core i3",3370);
        MemoriaUSB usb2 = new MemoriaUSB("Pen drive Gb", 32);
        comp2.addMemoria(usb2);
        // Promoção 3
        Computador comp3 = new Computador("Vaio", 1800, "Windows 10", 64, 8, "Tb de HD",2,"Pentium Core i7", 4500 );
        MemoriaUSB usb3 = new MemoriaUSB (" HD externo Tb", 1);
        comp3.addMemoria(usb3);
        // mostrando o que tem na loja para o cliente
        System.out.println("Na loja estamos tendo tres promocoes");
        System.out.println("A Promocao 1 : ");
        comp1.mostraPCConfigs();
        System.out.println("A Promocao 2 : ");
        comp2.mostraPCConfigs();
        System.out.println("A Promocao 3 : ");
        comp3.mostraPCConfigs();


        System.out.println("Menu de compras :");
        System.out.println("Voce pode inserir o numero 1 para realizar a compra da Promocao 1");
        System.out.println("Voce pode inserir o numero 2 para realizar a compra da Promocao 2");
        System.out.println("Voce pode inserir o numero 3 para realizar a compra da Promocao 3");
        System.out.println("Caso nao queria comprar mais algum pc basta digitar o numero 0");
        System.out.println();

        float soma ; // preço final da compra
        int aux_p1 = 0; // defini quantas compras de pc o cliente fez da promoção 1
        int aux_p2 = 0; // defini quantas compras de pc o cliente fez da promoção 2
        int aux_p3 = 0; // defini quantas compras de pc o cliente fez da promoção 3

        boolean aux = true;
        int res;
        while (aux) {

            System.out.println("Insira um numero :");
            // entrada
            res = entrada.nextInt();

            switch (res) {

                case 1:
                    for (int i = 0; i < c1.computador.length; i++) {
                        if (c1.computador[i] == null) {
                            c1.computador[i] = comp1;
                            break;
                        }
                    }
                    aux_p1++;

                    break;
                case 2:
                    for (int i = 0; i < c1.computador.length; i++) {
                        if (c1.computador[i] == null) {
                            c1.computador[i] = comp2;
                            break;
                        }
                    }
                    aux_p2++;
                    break;
                case 3:
                    for (int i = 0; i < c1.computador.length; i++) {
                        if (c1.computador[i] == null) {
                            c1.computador[i] = comp3;
                            break;
                        }
                    }
                    aux_p3++;
                    break;
                case 0:
                    aux = false;
                    System.out.println("Finalizando a compra");
                    System.out.println();
                    break;
                default:
                    System.out.println("Favor digite alguns dos numeros que foi fornecido no menu");
                    break;
            }
        }

        if (aux_p1 >= 1) {
            System.out.println("Foram feitas " + aux_p1 + " compra da Promocao 1 : ");
            System.out.println();
            c1.computador[0].mostraPCConfigs();
        }
        if (aux_p2 >= 1) {
            System.out.println("Foram feitas " + aux_p2 + " compra da Promocao 2 : ");
            System.out.println();
            c1.computador[1].mostraPCConfigs();
        }
        if (aux_p3 >= 1) {
            System.out.println("Foram feitas " + aux_p3 + " compra da Promocao 3 : ");
            System.out.println();
            c1.computador[2].mostraPCConfigs();
        }
        soma = c1.calcula();
        System.out.println("Valor da compra total : " + soma);

        entrada.close();


    }
}