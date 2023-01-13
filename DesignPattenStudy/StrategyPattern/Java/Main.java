package StrategyPattern.Java;

public class Main {

    public static void main(String[] args) {

        GameCharacter gameCharacter = new GameCharacter();

        gameCharacter.attack();

        gameCharacter.setWeapon(new Sword());
        gameCharacter.attack();

        gameCharacter.setWeapon(new Knife());
        gameCharacter.attack();

        gameCharacter.setWeapon(new Axe());
        gameCharacter.attack();
    }
}
