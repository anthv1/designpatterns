package thrones;

import java.util.Random;

public class CharacterFactory {
    private static final int GRID_LENGTH = 5;
    private static Random random = new Random(System.currentTimeMillis());

    private static int getRandomInt() {
        return random.nextInt(GRID_LENGTH);
    }

    public static King createKing() {
        return new King(getRandomInt(), getRandomInt());
    }

    public static Queen createQueen() {
        return new Queen(getRandomInt(), getRandomInt());
    }

    public static Knight createKnight() {
        return new Knight(getRandomInt(), getRandomInt());
    }

    public static Dragon createDragon() {
        return new Dragon(getRandomInt(), getRandomInt());
    }
}
