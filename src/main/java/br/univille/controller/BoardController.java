package br.univille.controller;

import br.univille.entity.Board;
import br.univille.service.BoardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/boards")
public class BoardController {

    @Autowired
    private BoardService service;

    @GetMapping
    public ResponseEntity<List<Board>> getBoards() {
        var boards = service.getAll();
        return new ResponseEntity<>(boards, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Board> postBoard(@RequestBody Board board) {
        if (board == null) return ResponseEntity.badRequest().build();
        if (board.getId() == null || board.getId() == 0) {
            service.save(board);
            return new ResponseEntity<>(board, HttpStatus.CREATED);
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Board> putBoard(@PathVariable Long id, @RequestBody Board board) {
        if (id <= 0 || board == null) return ResponseEntity.badRequest().build();

        var boardAntigo = service.getById(id);
        if (boardAntigo == null) return ResponseEntity.notFound().build();

        boardAntigo.setTitulo(board.getTitulo());
        service.save(boardAntigo);

        return new ResponseEntity<>(boardAntigo, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Board> deleteBoard(@PathVariable Long id) {
        if (id <= 0) return ResponseEntity.badRequest().build();

        var board = service.getById(id);
        if (board == null) return ResponseEntity.notFound().build();

        service.delete(id);
        return new ResponseEntity<>(board, HttpStatus.OK);
    }
}