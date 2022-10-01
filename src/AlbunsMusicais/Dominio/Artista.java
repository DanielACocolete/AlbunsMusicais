package AlbunsMusicais.Dominio;

import java.util.HashSet;
import java.util.Set;

public class Artista extends Pessoa {

    private  int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Set<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(Set<Genero> generos) {
        this.generos = generos;
    }

    private Set<Genero> generos = new HashSet<>();

}
