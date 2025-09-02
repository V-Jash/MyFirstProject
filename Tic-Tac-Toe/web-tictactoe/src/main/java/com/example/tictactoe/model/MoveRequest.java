package com.example.tictactoe.model;

public class MoveRequest {
    private int pos; // 1..9

    public MoveRequest() {
    }

    public MoveRequest(int pos) {
        this.pos = pos;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
}
