package AlbunsMusicais.Dominio;

import java.util.HashSet;
import java.util.Set;

public class Faixa {

    private String nome;
    private Album album;
    private  int duracao;
    private String genero;

    private Set<Artista> artistas = new HashSet<>();

    private Set<Compositor> compositores = new HashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Set<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(Set<Artista> artistas) {
        this.artistas = artistas;
    }

    public Set<Compositor> getCompositores() {
        return compositores;
    }

    public void setCompositores(Set<Compositor> compositores) {
        this.compositores = compositores;
    }
}
