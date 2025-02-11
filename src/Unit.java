
public abstract class Unit {
    protected String name;
    protected int health;
    protected int attackPower;

    public Unit(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public abstract void attack();

    public void takeDamage(int damage) {
        this.health -= damage;
    }
}
