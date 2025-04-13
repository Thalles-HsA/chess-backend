package br.com.chess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.chess.model.Board;
import br.com.chess.model.Move;

@RestController
@RequestMapping("/game")
@CrossOrigin(origins = "*")
public class GameController {

    @Autowired
    private br.com.chess.service.ChessGameService chessGameService;

    @GetMapping
    public Board getBoard() {
        return chessGameService.getCurrentBoard();
    }

    @PostMapping("/move")
    public String makeMove(@RequestBody Move move) {
        boolean success = chessGameService.makeMove(move);
        return success ? "OK" : "Invalid move";
    }
} 
