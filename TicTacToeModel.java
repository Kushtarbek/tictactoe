public class TicTacToeModel {

    public class Game {
        private String PlayerName;
        private String Player0;
        private String Winner;
        private String Score;

    }

    public String getPlayerName(){
        return PlayerName;
    }

    public void setPlayerName (String name1){
        this.PlayerName = name1;
    }

    public int setScore( int score){
        this.Score = score;
        return score;
    }


    public static void main(String[] args) {

    }
}
