package com.Kushtarbek;

public class Game {
    private final char [][] board = {
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', ' ', ' ', ' ', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}
    };

    private final char[] placements = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
    public String[] winningPositions = new String[8];
}
