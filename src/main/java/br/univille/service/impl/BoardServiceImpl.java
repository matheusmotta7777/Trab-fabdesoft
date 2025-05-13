package br.univille.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.entity.Board;
import br.univille.repository.BoardRepository;
import br.univille.service.BoardService;


@Service
public class BoardServiceImpl implements BoardService {
    
    @Autowired
    private BoardRepository repository;   //CRIAR REPOSITORY

    @Override
    public Board save(Board board) {
        repository.save(board);
        return board;
    }

    @Override
    public List<Board> getAll() {
        return repository.findAll();
    }

    @Override
    public Board getById(Long id) {
        var retorno = repository.findById(id);
        if(retorno.isPresent())
            return retorno.get();
        return null;
    }

    @Override
    public Board delete(Long id) {
        var board = getById(id);
        if(board != null)
            repository.deleteById(id);
        return board;
    }
}
