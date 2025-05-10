package br.univille.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Cliente {
    private String nome;
    private String instagram;
    private String persona;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getInstagram() { return instagram; }
    public void setInstagram(String instagram) { this.instagram = instagram; }

    public String getPersona() { return persona; }
    public void setPersona(String persona) { this.persona = persona; }
}