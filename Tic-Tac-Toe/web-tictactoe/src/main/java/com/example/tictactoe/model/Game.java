package com.example.tictactoe.model;

public class Game {
    private String[] board;
    private String turn; // "X" or "O"
    private String winner; // "X", "O" or null
    private boolean draw;
    private String message;

    public Game() {
    }

    public Game(String[] board, String turn, String winner, boolean draw, String message) {
        this.board = board;
        this.turn = turn;
        this.winner = winner;
        this.draw = draw;
        this.message = message;
    }

    public String[] getBoard() {
        return board;
    }

    public void setBoard(String[] board) {
        this.board = board;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public boolean isDraw() {
        return draw;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
