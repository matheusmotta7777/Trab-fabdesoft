package br.univille.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.entity.Lista;
import br.univille.repository.ListaRepository;
import br.univille.service.ListaService;

@Service
public class ListaServiceImpl implements ListaService {
    
    @Autowired
    private ListaRepository repository;   //CRIAR REPOSITORY

    @Override
    public Lista save(Lista lista) {
        repository.save(lista);
        return lista;
    }

    @Override
    public List<Lista> getAll() {
        return repository.findAll();
    }

    @Override
    public Lista getById(Long id) {
        var retorno = repository.findById(id);
        if(retorno.isPresent())
            return retorno.get();
        return null;
    }

    @Override
    public Lista delete(Long id) {
        var lista = getById(id);
        if(lista != null)
            repository.deleteById(id);
        return lista;
    }
}