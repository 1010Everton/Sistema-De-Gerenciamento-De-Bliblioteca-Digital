package org.example.Bibliotecas;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name = "Livros")
public class Livros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "titulo", nullable = false,length = 100,unique = true)
    private String nome;
    @Column(nullable = false)
    private String autor;
    @Column(nullable = false)
    @Lob
    private String resumo;
    @Temporal(TemporalType.DATE)
    private Date Datadepublicacao;
    @Enumerated(EnumType.ORDINAL)
    private int paginaslidas;
    @Enumerated(EnumType.ORDINAL)
    private int visualizacoes;


    public Date getDatadepublicacao() {
        return Datadepublicacao;
    }

    public void setDatadepublicacao(Date datadepublicacao) {
        Datadepublicacao = datadepublicacao;
    }

    public int getPaginaslidas() {
        return paginaslidas;
    }

    public void setPaginaslidas(int paginaslidas) {
        this.paginaslidas = paginaslidas;
    }

    public int getVisualizacoes() {
        return visualizacoes;
    }

    public void setVisualizacoes(int visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


}
