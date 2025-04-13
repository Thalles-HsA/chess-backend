package br.com.chess.model;

import br.com.chess.enums.PieceColor;
import br.com.chess.enums.PieceType;

public class Board {
    private Piece[][] board;

    public Board() {
        this.board = new Piece[8][8];
        initialize();
    }

    private void initialize() {
        // Peças pretas
        board[0][0] = board[0][7] = new Piece(PieceType.ROOK, PieceColor.BLACK);
        board[0][1] = board[0][6] = new Piece(PieceType.KNIGHT, PieceColor.BLACK);
        board[0][2] = board[0][5] = new Piece(PieceType.BISHOP, PieceColor.BLACK);
        board[0][3] = new Piece(PieceType.QUEEN, PieceColor.BLACK);
        board[0][4] = new Piece(PieceType.KING, PieceColor.BLACK);
        for (int i = 0; i < 8; i++) board[1][i] = new Piece(PieceType.PAWN, PieceColor.BLACK);

        // Peças brancas
        board[7][0] = board[7][7] = new Piece(PieceType.ROOK, PieceColor.WHITE);
        board[7][1] = board[7][6] = new Piece(PieceType.KNIGHT, PieceColor.WHITE);
        board[7][2] = board[7][5] = new Piece(PieceType.BISHOP, PieceColor.WHITE);
        board[7][3] = new Piece(PieceType.QUEEN, PieceColor.WHITE);
        board[7][4] = new Piece(PieceType.KING, PieceColor.WHITE);
        for (int i = 0; i < 8; i++) board[6][i] = new Piece(PieceType.PAWN, PieceColor.WHITE);
    }

    public Piece[][] getBoard() {
        return board;
    }
}