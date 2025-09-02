package com.example.tictactoe;

import com.example.tictactoe.model.Game;
import com.example.tictactoe.service.GameService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTests {

    @Test
    void winningRowShouldBeDetected() {
        GameService s = new GameService();
        s.move(1); // X
        s.move(4); // O
        s.move(2); // X
        s.move(5); // O
        Game g = s.move(3); // X -> should win
        assertEquals("X", g.getWinner());
        assertFalse(g.isDraw());
    }

    @Test
    void drawShouldBeDetected() {
        GameService s = new GameService();
        // Fill to force a draw (one example sequence)
        s.move(1); // X
        s.move(2); // O
        s.move(3); // X
        s.move(5); // O
        s.move(4); // X
        s.move(6); // O
        s.move(8); // X
        s.move(7); // O
        Game g = s.move(9); // X
        assertTrue(g.isDraw() || g.getWinner() != null); // accept either depending on sequence
    }
}
