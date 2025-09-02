package com.example.tictactoe.service;

import com.example.tictactoe.model.Game;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    private String[] board;
    private String turn; // "X" or "O"
    private String winner; // null / "X" / "O"
    private boolean draw;

    public GameService() {
        resetInternal();
    }

    private void resetInternal() {
        board = new String[9];
        for (int i = 0; i < 9; i++)
            board[i] = String.valueOf(i + 1);
        turn = "X";
        winner = null;
        draw = false;
    }

    public synchronized Game reset() {
        resetInternal();
        return currentState("New game started. X begins.");
    }

    public synchronized Game getState() {
        return currentState(null);
    }

    public synchronized Game move(int pos) {
        if (winner != null || draw) {
            return currentState("Game over. Click Reset to play again.");
        }
        if (pos < 1 || pos > 9) {
            return currentState("Invalid move. Choose a slot 1..9.");
        }
        if (!board[pos - 1].equals(String.valueOf(pos))) {
            return currentState("That slot is already taken.");
        }

        board[pos - 1] = turn;

        String result = checkWinner(board);
        if (result == null) {
            turn = turn.equals("X") ? "O" : "X";
            return currentState("Next turn: " + turn);
        }
        if ("DRAW".equals(result)) {
            draw = true;
            return currentState("It's a draw.");
        }
        winner = result;
        return currentState(winner + " wins!");
    }

    private Game currentState(String message) {
        return new Game(board.clone(), turn, winner, draw, message);
    }

    // returns "X" or "O" if someone won, "DRAW" if draw, or null to continue.
    private String checkWinner(String[] b) {
        int[][] lines = {
                { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 },
                { 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 },
                { 0, 4, 8 }, { 2, 4, 6 }
        };
        for (int[] L : lines) {
            String a = b[L[0]], c = b[L[1]], d = b[L[2]];
            if (a.equals(c) && c.equals(d) && (a.equals("X") || a.equals("O"))) {
                return a;
            }
        }
        // draw if no numeric placeholders remain
        for (int i = 0; i < 9; i++) {
            if (b[i].equals(String.valueOf(i + 1))) {
                return null; // still moves left
            }
        }
        return "DRAW";
    }
}
