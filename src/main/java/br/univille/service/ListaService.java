package br.univille.service;

import java.util.List;

import br.univille.entity.Lista;

public interface ListaService {
    Lista save(Lista lista);
    List<Lista> getAll();
    Lista getById(Long id);
    Lista delete(Long id);
    
}
