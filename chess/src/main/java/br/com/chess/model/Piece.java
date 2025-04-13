// Pacote: com.br.xadrez.model
package br.com.chess.model;

import br.com.chess.enums.PieceColor;
import br.com.chess.enums.PieceType;

public class Piece {
    private PieceType type;
    private PieceColor color;

    public Piece(PieceType type, PieceColor color) {
        this.type = type;
        this.color = color;
    }

    public PieceType getType() {
        return type;
    }

    public PieceColor getColor() {
        return color;
    }
}