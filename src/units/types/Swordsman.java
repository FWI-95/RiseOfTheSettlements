package units.types;

import units.Unit;

public class Swordsman extends Unit {
    public Swordsman() {
        super("Swordsman", 100, 20);  // Example health and attack power
    }

    @Override
    public void attack() {
        System.out.println("Swordsman attacks with sword!");
    }
}
