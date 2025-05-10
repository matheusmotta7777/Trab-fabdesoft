package br.univille.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;

    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
    private List<Lista> listas;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public List<Lista> getListas() { return listas; }
    public void setListas(List<Lista> listas) { this.listas = listas; }
}