package com.example.tictactoe.controller;

import com.example.tictactoe.model.Game;
import com.example.tictactoe.model.MoveRequest;
import com.example.tictactoe.service.GameService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/game", produces = MediaType.APPLICATION_JSON_VALUE)
public class GameController {
    private final GameService service;

    public GameController(GameService service) {
        this.service = service;
    }

    @GetMapping
    public Game getState() {
        return service.getState();
    }

    @PostMapping(path = "/move", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Game makeMove(@RequestBody MoveRequest req) {
        return service.move(req.getPos());
    }

    @PostMapping("/reset")
    public Game reset() {
        return service.reset();
    }
}
