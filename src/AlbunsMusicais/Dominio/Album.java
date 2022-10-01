package AlbunsMusicais.Dominio;

import javax.xml.crypto.Data;
import java.util.HashSet;
import java.util.Set;

public class Album {

    private String nome;
    private Data ano;
    private String duracao;
    private Genero genero;
    private Gravadora gravadora;
    private Set<Faixa> faixas = new HashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = nome;
    }

    public Data getAno() {
        return ano;
    }

    public void setAno(Data ano) {
        ano = ano;
    }

    public String getTempoDuracao() {
        return duracao;
    }

    public void setTempoDuracao(String tempoDuracao) {
        this.duracao = tempoDuracao;
    }

    public Set<Faixa> getFaixas() {
        return faixas;
    }

    public void setFaixas(Set<Faixa> faixas) {
        this.faixas = faixas;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Gravadora getGravadora() {
        return gravadora;
    }

    public void setGravadora(Gravadora gravadora) {
        this.gravadora = gravadora;
    }
}
