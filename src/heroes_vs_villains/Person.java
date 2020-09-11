package heroes_vs_villains;

public class Person {
    private String name;
    private String type;
    private int attack;
    private int defense;
    private int hitpoints;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String name) { this.type = type; }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public Person() { // default constructor
        this.hitpoints = 80;
    }

    public int randomizer(int min, int max) {
        int randomInt = (int)(Math.random() * (max - min) + min);
        return randomInt;
    }

    @Override
    public String toString() {
        return "name = '" + name + '\'' +
                ", attack = " + attack +
                ", defense = " + defense +
                ", hitpoints = " + hitpoints;
    }

//  Damage function
    public static void damage(Person attacker, Person defender) {
        if(attacker.getType() == "Hero") { // used to always randomize attack
            attacker.setAttack(attacker.randomizer(40, 100));
        } else if(attacker.getType() == "Villain") { // used to always randomize attack
            attacker.setAttack((attacker.randomizer(30, 50)));
        }
        int damage = attacker.getAttack() - defender.getDefense() / 2;
        int newHitpoints = defender.getHitpoints() - damage;
        defender.setHitpoints(newHitpoints);
        System.out.println(attacker.getName() + " hits " + defender.getName() + " for " + damage + " damage.");
        System.out.println(defender.getName() + " has " + defender.getHitpoints() + " hitpoints left.");
        System.out.println("-------------------");
    }
}
