package me.krishnamurti.board;

public interface Board {

    boolean isGameOver();

    void playGame();

    String getWinner();

    default String startGame() {
        playGame();
        return getWinner();
    }

}
