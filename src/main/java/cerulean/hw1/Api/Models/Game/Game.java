package cerulean.hw1.Api.Models.Game;
import cerulean.hw1.Api.Models.Account.Account;
import org.springframework.data.annotation.Id;


public class Game{

    @Id
    public String sessionId;

    public Account player;
    public int moveCounter;
    public int winner;
    public Board board;

    //Constructor
    public Game(){}

    public Game(String sessionId, Account player){
        this.sessionId = sessionId;
        this.player = player;
        this.moveCounter = 0;
        this.winner = 0;
        this.board = new Board(); //Board Size Needs to be set!
    }
    //TODO: implement move
    public void move(Account account, String gameSession, int from, int to){

    }

    public String getsessionId() { return sessionId; }
    public void setsessionId(String sessionId) { this.sessionId = sessionId; }

    public Account getPlayer() {
        return player;
    }

    public void setPlayer(Account player) {
        this.player = player;
    }

    public int getMoveCounter() {
        return moveCounter;
    }

    public void setMoveCounter(int moveCounter) {
        this.moveCounter = moveCounter;
    }

    public int getWinner() {
        return winner;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}