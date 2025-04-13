package br.com.chess.service;

import org.springframework.stereotype.Service;

import br.com.chess.model.Board;
import br.com.chess.model.Move;

@Service
public class ChessGameService {

    private final Board board = new Board();

    public Board getCurrentBoard() {
        return board;
    }

    public boolean makeMove(Move move) {
        // Validação simplificada: sempre aceita
        // Lógica real virá depois
        return true;
    }
}
