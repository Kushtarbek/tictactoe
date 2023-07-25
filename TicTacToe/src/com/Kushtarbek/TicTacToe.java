package com.Kushtarbek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scan = new Scanner(System.in);
        Computer comp = new Computer();


        intro(game);

        while(!game.isWon()){
            userMove(game, scan);

            if(game.isLastMove()){
                if(game.isWon()) gameWon(game);
                else gameTie(game);
            }else computerMove(game, comp);

            game.printBoard();
        }
        finalPrint(game);
    }

    public static void intro(Game game){
        System.out.println("Welcome to TicTacToe!");
        System.out.println("Please choose where to place a piece");
        System.out.println("type in a number 1-9 to place in matrix");
        game.showOptions();
    }

    public static void gameTie(Game game) {
        System.out.println("Tie Game!");
        game.printBoard();
        System.exit(0);
    }

    public static void gameWon(Game game){
        finalPrint(game);
        System.exit(0);
    }

    public static void userMove(Game game, Scanner scan){
        int userMove = 0;
        while(!(userMove < 10) || !(userMove > 0)){
            try{
                userMove = scan.nextInt();
            } catch (InputMismatchException ime){
                System.out.println("Not a valid input.");
                System.out.println("Exiting...");
                System.exit(0);
            }

        if( !(userMove > 0) || !(userMove < 10) ){
            System.out.println("Please Enter Valid Number (1-9)");
        } else if (game.positionIsTaken(userMove)){
            System.out.println("That move is already taken");
            System.out.println("please choose another spot");
            userMove = 0;
        }

        }
        game.placeUserPosition(userMove, 'X');
    }

    public static void computerMove(Game game, Computer computer){
        int computerMove = computer.bestMove(game.getPlacements());
        game.placeComputerPosition(computerMove, '0');
    }

    public static void finalPrint(Game game){
        game.printBoard();
        System.out.printf("%s won the game!", game.getWinner() );
    }
}
