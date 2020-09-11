import heroes_vs_villains.Hero;
import heroes_vs_villains.Person;
import heroes_vs_villains.Villain;

public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero();
        Villain villain = new Villain();

        System.out.println(hero.toString());
        System.out.println(villain.toString());
        System.out.println("======= End of hero and villain info strings =======");

        while(hero.getHitpoints() > 0 && villain.getHitpoints() > 0) {
            System.out.println("It's " + villain.getName() + "'s turn!");
            Person.damage(villain, hero);
            if(hero.getHitpoints() > 0) {
                System.out.println("It's " + hero.getName() + "'s turn!");
                Person.damage(hero, villain);
            }
        }

        if(hero.getHitpoints() <= 0) {
            System.out.println("The winner is " + villain.getName() + " with " + villain.getHitpoints() + " hitpoints remaining.");
        } else if(villain.getHitpoints() <= 0) {
            System.out.println("The winner is " + hero.getName() + " with " + hero.getHitpoints() + " hitpoints remaining.");
        }
    }
}
