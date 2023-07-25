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
    public char winner;

    private void updateWinningPositions(){
        winningPositions[0] = "" + this.placements[0] + this.placements[1] + this.placements[2];
        winningPositions[1] = "" + this.placements[3] + this.placements[4] + this.placements[5];
        winningPositions[2] = "" + this.placements[6] + this.placements[7] + this.placements[8];
        winningPositions[3] = "" + this.placements[0] + this.placements[3] + this.placements[6];
        winningPositions[4] = "" + this.placements[1] + this.placements[4] + this.placements[7];
        winningPositions[5] = "" + this.placements[2] + this.placements[5] + this.placements[8];
        winningPositions[6] = "" + this.placements[0] + this.placements[4] + this.placements[8];
        winningPositions[7] = "" + this.placements[6] + this.placements[4] + this.placements[2];
    };

    public char [][] getBoard() {return this.board; }
    public char getWinner() { return winner; }
    public char[] getPlacements() { return this.placements; }

    public void printBoard(){
        int count = 0;
        for( char[] row: this.board){
            for( char col: row){
                if( col == ' '){
                    System.out.print( this.placements[count]);
                    count++;
                }else{
                    System.out.print(col);
                }
            }
            System.out.println();
        }
    }

    public void showOptions(){
        int count = 1;
        for( char[] row: this.board){
            for( char col : row){
                if( col == ' '){
                    System.out.print(count);
                    count++;
                }else{
                    System.out.print(col);
                }
            }
            System.out.println();
        }
    }

    public void placeUserPosition( int position, char Xor0){
        this.placements[position-1] = Xor0;
    }

    public void placeComputerPosition( int position, char Xor0){
        this.placements[position] = Xor0;
    }

    public boolean positionIsTaken( int position){
        return this.placements[position-1] != ' ';
    }

    public boolean isLastMove(){
        for( char placement: placements){
            if(placement == ' '){
                return false;
            }
        }
        return true;
    }

    public boolean isTie(){
        for(char placement: this.getPlacements()){
            if(placement == ' '){
                return false;
            }
        }
        return true;
    }

    public boolean isWon(){
        updateWinningPositions();

        for( String position: winningPositions){
            if(isPositionWon(position)){
                setWinner(position);
                return true;
            }
        }
        return false;
    }

    private static boolean isPositionWon( String position){
        return position.equals("XXX") || position.equals("000");
    }

    public void setWinner(String winner){
        this.winner = winner.charAt(0);
    }
}
