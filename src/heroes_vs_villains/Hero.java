package heroes_vs_villains;

public class Hero extends Person {
    public Hero() {
        this.setName("Hero");
        this.setAttack(randomizer(40, 100));
        this.setDefense(randomizer(0, 50));
        this.setHitpoints(100);
    }
}
