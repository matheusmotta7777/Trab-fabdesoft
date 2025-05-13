package br.univille.service;

import java.util.List;

import br.univille.entity.Cliente;

public interface ClienteService {
    Cliente save(Cliente usuario);
    List<Cliente> getAll();
    Cliente getById(Long id);
    Cliente delete(Long id);
    
}
