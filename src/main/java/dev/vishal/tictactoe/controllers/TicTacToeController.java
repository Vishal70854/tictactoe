package dev.vishal.tictactoe.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tictactoe")
public class TicTacToeController {

    @GetMapping()
    public String getMessage(){
        return "Hello Vishal this is tac tac toe example!";
    }
}
