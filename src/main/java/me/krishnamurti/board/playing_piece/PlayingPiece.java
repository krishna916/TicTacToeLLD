package me.krishnamurti.board.playing_piece;

public class PlayingPiece {

    private PieceType type;

    public PlayingPiece(PieceType type) {
        this.type = type;
    }

    public PieceType getType() {
        return type;
    }
}
