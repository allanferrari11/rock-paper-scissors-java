package rockpaperscisors.domain;

public enum Move {
    ROCK("Rock") {
        @Override
        public boolean beats(Move opponentMove) {
            return opponentMove == Move.SCISSORS;
        }
    },

    PAPER("Paper") {
        @Override
        public boolean beats(Move opponentMove) {
            return opponentMove == Move.ROCK;
        }
    },

    SCISSORS("Scissors") {
        @Override
        public boolean beats(Move opponentMove) {
            return opponentMove == Move.PAPER;
        }
    };

    private final String description;

    private Move(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public abstract boolean beats(Move opponentMove);

}
