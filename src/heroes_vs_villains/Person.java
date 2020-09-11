package heroes_vs_villains;

public class Person {
    private String name;
    private int attack;
    private int defense;
    private int hitpoints;

    public Person() { // default constructor
        this.hitpoints = 80;
    }

    public int randomizer(int min, int max) {
        int randomInt = (int)(Math.random() * (max - min) + min);
        return randomInt;
    }
}
