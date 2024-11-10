package me.krishnamurti.game;

import me.krishnamurti.board.playing_piece.PieceType;
import me.krishnamurti.board.playing_piece.PlayingPiece;
import me.krishnamurti.player.Player;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class TicTacToeGame extends BoardGame{

    List<Player> players;
    PlayingPiece[][] gameBoard;
    Deque<Player> moves;
    Player winner;


    public TicTacToeGame(List<Player> players, int size) {
        this.players = players;
        this.gameBoard = new PlayingPiece[size][size];
        moves = new LinkedList<>(players);
    }

    public static List<Player> initPlayers(String player1, String player2) {
        Player p1 =  new Player(player1, new PlayingPiece(PieceType.O));
        Player p2 = new Player(player2, new Player(PlayingPiece.X));

        List<Player> players = new ArrayList<>();
        players.add(p1);
        players.add(p2);

        return players;
    }

    public void playGame() {
        boolean hasGameEnded = false;

        while (!hasGameEnded) {

        }

    }


    public void printResult() {
        if (winner == null) {
            System.out.println("Game Tied");
        } else {
            System.out.println("Player " + winner.getName() + " is the winner");
        }
    }


}
