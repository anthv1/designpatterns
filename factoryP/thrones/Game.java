package thrones;

import java.util.Random;

public class Game {
    //Client side
    public static void main(String[] args) {
        CharacterFactory CharacterFactory = new CharacterFactory();
        
        King king = CharacterFactory.createKing();
        Queen queen = CharacterFactory.createQueen();
        Knight knight = CharacterFactory.createKnight();
        Dragon dragon = CharacterFactory.createDragon();

        knight.attack(dragon);
    }

}