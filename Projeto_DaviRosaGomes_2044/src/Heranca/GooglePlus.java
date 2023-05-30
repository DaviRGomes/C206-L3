package Heranca;

import Interface.Compartilhamento;
import Interface.VideoConferencia;

public class GooglePlus extends RedeSocial implements Compartilhamento, VideoConferencia {

    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Google+");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Google+");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Google+");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma foto no Google+");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou uma foto no Google+");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo live no Google+");
    }
}