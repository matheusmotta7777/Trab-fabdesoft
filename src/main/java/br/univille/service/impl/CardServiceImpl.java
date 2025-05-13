package br.univille.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.entity.Card;
import br.univille.repository.CardRepository;
import br.univille.service.CardService;


@Service
public class CardServiceImpl implements CardService {
    
    @Autowired
    private CardRepository repository;   //CRIAR REPOSITORY

    @Override
    public Card save(Card card) {
        repository.save(card);
        return card;
    }

    @Override
    public List<Card> getAll() {
        return repository.findAll();
    }

    @Override
    public Card getById(Long id) {
        var retorno = repository.findById(id);
        if(retorno.isPresent())
            return retorno.get();
        return null;
    }

    @Override
    public Card delete(Long id) {
        var card = getById(id);
        if(card != null)
            repository.deleteById(id);
        return card;
    }
}
