import Heranca.*;
public class Main {
    public static void main(String[] args) {
        // User 1
        RedeSocial[] conta = new RedeSocial[2];
        conta[0] = new Instagram("Senha123", 455);
        conta[1] = new GooglePlus("RogerGuedes123", 123);
        Usuario perfil = new Usuario("davi_rs_gomes", "davi.gomes@inatel.com.br", conta);

        System.out.println("Usuario: " + perfil.getNome());
        System.out.println("Email: " + perfil.getEmail());
        System.out.println();
        // conta 1
        perfil.getRedeSocials()[0].postarFoto();
        perfil.getRedeSocials()[0].postarComentario();
        perfil.getRedeSocials()[0].curtirPublicacao();
        System.out.println();
        // conta 2
        perfil.getRedeSocials()[1].postarVideo();
        ((GooglePlus) perfil.getRedeSocials()[1]).compartilhar();
        ((GooglePlus) perfil.getRedeSocials()[1]).fazStreaming();
    }
}