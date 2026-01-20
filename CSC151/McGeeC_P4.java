/*
 * Name: Caleb McGee
 * Programming Assignment 4: Tic Tac Toe
 * Extra credit option: Please add points to exam 4
 */

import java.util.Scanner;

public class McGeeC_P4 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        // Player who's turn it is
        char player = 'X';      
        char winner = " ".charAt(0); // No winner yet
        boolean gameOver = false;

        // 3x3 board
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        //Run while game is live
        while (!gameOver) {

            // Print the board
            System.out.println();
            for (int r = 0; r < 3; r++) {
                System.out.println(" " + board[r][0] + " | " + board[r][1] + " | " + board[r][2]);
                if (r < 2) {
                    System.out.println("---+---+---");
                }
            }

            // Ask player for move
            int row, col;

            while (true) {
                System.out.println("\nEnter row and column to play for " + player);
                row = keyboard.nextInt();
                col = keyboard.nextInt();

                // Check if input was valid
                if (row < 0 || row > 2 || col < 0 || col > 2) {
                    System.out.println("Error : Invalid position. Row/Column must be 0-2.");
                } else if (board[row][col] != ' ') {
                    System.out.println("Space is already taken, go again.");
                } else {
                    break;
                }
            }

            // Show move on board
            board[row][col] = player;

            //Check for winner
            //horizontal
            for (int r = 0; r < 3; r++) {
                if (board[r][0] == player && board[r][1] == player && board[r][2] == player) {
                    winner = player;
                    gameOver = true;
                }
            }

            // vertical
            for (int c = 0; c < 3; c++) {
                if (board[0][c] == player && board[1][c] == player && board[2][c] == player) {
                    winner = player;
                    gameOver = true;
                }
            }

            // diagonal
            if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
                winner = player;
                gameOver = true;
            }

            if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
                winner = player;
                gameOver = true;
            }

            // Check for Draw
            boolean full = true;
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    if (board[r][c] == ' ') {
                        full = false;
                    }
                }
            }

            if (full && winner == ' ') {
                gameOver = true;
            }

            // Switch turns
            if (!gameOver) {
                player = (player == 'X') ? 'O' : 'X';
            }
        }

        // Print final board
        System.out.println();
        System.out.println("Final Board:");
        for (int r = 0; r < 3; r++) {
            System.out.println(" " + board[r][0] + " | " + board[r][1] + " | " + board[r][2]);
            if (r < 2) {
                System.out.println("---+---+---");
            }
        }

        // Show game end results
        if (winner == 'X') {
            System.out.println("X wins!");
        } else if (winner == 'O') {
            System.out.println("O wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
