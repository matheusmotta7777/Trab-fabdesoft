package br.univille.service;

import java.util.List;

import br.univille.entity.Board;

public interface BoardService {
    Board save(Board usuario);
    List<Board> getAll();
    Board getById(Long id);
    Board delete(Long id);
    
}
