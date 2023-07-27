    TicTacToe Game 
-Attributes

    -Board: char [3] [3];

    -CurrentPlayer: char;

    -gameStatus: boolean;

-Methods

    +TicTacToeGame()
    +initializeBoard()
    +switchPlayer()
    +makeMove(int [] row, int [] col): boolean
    +checkForWin(): boolean
    +checkForDraw(): boolean
    +isGameOver(): boolean



Explanation of the class diagram:

TicTacToeGame: This class represents the Tic Tac Toe game. It contains the game board, the current player (either 'X' or 'O'), and the game status. The board is a 3x3 array of characters that stores the current state of the game.

- board: A private 2D array of characters representing the Tic Tac Toe board.

- currentPlayer: A private character representing the current player ('X' or 'O').

- gameStatus: A private boolean variable indicating whether the game is still in progress (true) or has ended (false).

+ TicTacToeGame(): The constructor of the TicTacToeGame class. It initializes the game by calling the initializeBoard() method and sets the current player to 'X'.

+ initializeBoard(): A method to initialize the game board with empty cells (e.g., '-'). It is called during the construction of the TicTacToeGame object.

+ switchPlayer(): A method that switches the current player after each move.

+ makeMove(row: int, col: int): boolean: A method that allows a player to make a move by specifying the row and column indices of the board. It checks if the move is valid, updates the board with the player's symbol, and returns a boolean indicating whether the move was successful.

+ checkForWin(): boolean: A method that checks if any player has won the game. It scans the board to determine if there is a winning combination of symbols in rows, columns, or diagonals.

+ checkForDraw(): boolean: A method that checks if the game has resulted in a draw (i.e., no player has won, and the board is full).

+ isGameOver(): boolean: A method that checks if the game is over either due to a win or a draw.


![UML diagram for tictactoe](https://github.com/Kushtarbek/tictactoe/assets/44345257/86dbeb55-25c4-4a73-a23b-ddb97e8a93f8)
