package rockpaperscisors.domain;

public class Player {

    private String name;
    private Move currentMove;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Move getCurrentMove() {
        return this.currentMove;
    }

    public void setCurrentMove(Move currentMove) {
        this.currentMove = currentMove;
    }

    @Override
    public String toString() {
        return "Player Name: " + this.name;
    }

}
