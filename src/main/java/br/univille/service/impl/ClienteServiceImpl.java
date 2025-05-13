package br.univille.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.entity.Cliente;
import br.univille.repository.ClienteRepository;
import br.univille.service.ClienteService;


@Service
public class ClienteServiceImpl implements ClienteService {
    
    @Autowired
    private ClienteRepository repository;   //CRIAR REPOSITORY

    @Override
    public Cliente save(Cliente Cliente) {
        repository.save(Cliente);
        return Cliente;
    }

    @Override
    public List<Cliente> getAll() {
        return repository.findAll();
    }

    @Override
    public Cliente getById(Long id) {
        var retorno = repository.findById(id);
        if(retorno.isPresent())
            return retorno.get();
        return null;
    }

    @Override
    public Cliente delete(Long id) {
        var cliente = getById(id);
        if(cliente != null)
            repository.deleteById(id);
        return cliente;
    }
}
