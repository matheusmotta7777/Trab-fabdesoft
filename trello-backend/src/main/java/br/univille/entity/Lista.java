package br.univille.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Lista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @ManyToOne
    private Board board;

    @OneToMany(mappedBy = "lista", cascade = CascadeType.ALL)
    private List<Card> cards;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Board getBoard() { return board; }
    public void setBoard(Board board) { this.board = board; }

    public List<Card> getCards() { return cards; }
    public void setCards(List<Card> cards) { this.cards = cards; }
}