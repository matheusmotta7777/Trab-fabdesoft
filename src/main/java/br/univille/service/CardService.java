package br.univille.service;

import java.util.List;

import br.univille.entity.Card;

public interface CardService {
    Card save(Card usuario);
    List<Card> getAll();
    Card getById(Long id);
    Card delete(Long id);
    
}
