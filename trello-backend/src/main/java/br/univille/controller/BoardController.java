package br.univille.controller;

import br.univille.entity.Board;
import br.univille.repository.BoardRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/boards")
public class BoardController {

    private final BoardRepository boardRepository;

    public BoardController(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @GetMapping
    public List<Board> listar() {
        return boardRepository.findAll();
    }

    @PostMapping
    public Board salvar(@RequestBody Board board) {
        return boardRepository.save(board);
    }
}