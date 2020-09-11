package heroes_vs_villains;

public class Villain extends Person {
    public Villain() {
        this.setType("Villain");
        this.setAttack(randomizer(30, 50));
        this.setDefense(randomizer(0, 50));
        this.setHitpoints(130);
    }
}
