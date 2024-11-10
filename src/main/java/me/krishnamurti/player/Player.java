package me.krishnamurti.player;

import me.krishnamurti.board.playing_piece.PlayingPiece;

public class Player {

    private final String name;
    private final PlayingPiece piece;

    public Player(String name, PlayingPiece piece) {
        this.name = name;
        this.piece = piece;
    }

    public String getName() {
        return name;
    }

    public PlayingPiece getPiece() {
        return piece;
    }
}
