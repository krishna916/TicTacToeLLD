package me.krishnamurti.board;

import me.krishnamurti.board.playing_piece.PlayingPiece;
import me.krishnamurti.player.Player;

import java.util.List;

public class TicTacToeBoard implements Board{
   private Player winner;
   private List<Player> players;
   private PlayingPiece[][] playingBoard;

   public TicTacToeBoard(int )


    @Override
    public boolean isGameOver() {
        return false;
    }

    @Override
    public void playGame() {

    }

    @Override
    public String getWinner() {
        return null;
    }
}
