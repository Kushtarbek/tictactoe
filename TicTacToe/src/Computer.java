import java.util.Random;

public class Computer {
    static Random random = new Random();
    public int move(char[] placements){
        int guess;
        do{
            guess = guess();
        }while(placements[guess] != ' ');
        return guess;
    }

    public static int guess(){
        return random.nextInt(9);
    }

    public int bestMove(char [] placements){
        int bestScore = -1000;
        int bestMove = 0;
        for( char i=0; i<placements.length; i++){
            if(placements[i] == ' '){
                int score = minimax(i, placements, true);
                if(score > bestScore){
                    bestMove = i;
                    System.out.println("bestScore= " + bestScore);
                }
            }
        }
        return bestMove;
    }

    private static int minimax( int placement, char [] placements, boolean isMaximizing){
        Game game = new Game();
        char [] copyPlacements = recreateGame(game, placements);

        int score = 0;

        if(isMaximizing && game.isWon()){
            return 1;
        }else if(!isMaximizing && game.isWon()){
            return -1;
        }else if( game.isTie()){
            return 0;
        }

        if(isMaximizing){
            game.placeComputerPosition(placement, '0');
            if(game.isWon()){
                return 1;
            }
            for( char i=0; i < placements.length; i++){
                if( placements[i] == ' '){
                    score += minimax(i, copyPlacements, false);
                }
            }
        }else{
            game.placeUserPosition(placement+1, 'X');
            if(game.isWon()){
                return -1;
            }
            for(char i=0; i<placements.length; i++){
                if(placements[i] == ' '){
                    score += minimax(i, placements, true);
                }
            }
        }
        return score;
    }

    private static void possibleMoves(){

    }
    private static char[] recreateGame(Game game, char [] placements) {
        for( char i=0; i < placements.length; i++){
            if(placements[i] == 'X'){
                game.placeUserPosition(i+1, 'X');
            }else if(placements[i] == '0'){
                game.placeComputerPosition(i, '0');
            }
        }
        return game.getPlacements();
    }
}
