package Heranca;

public abstract class RedeSocial {

    protected String senha;
    protected int numAmigos;

    public RedeSocial(String senha, int numAmigos) {
        this.senha = senha;
        this.numAmigos = numAmigos;
    }

    public void postarFoto(){
        System.out.println("Postou uma foto em uma rede social");
    }

    public void postarVideo(){
        System.out.println("Postou um video em uma rede social");
    }

    public void postarComentario(){
        System.out.println("Postou um comentario em uma rede social");
    }

    public void  curtirPublicacao(){
        System.out.println("Curtiu uma publicacao em uma rede social");
    }
}
