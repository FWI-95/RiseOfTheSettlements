
public class Barracks extends Building {
    public Barracks(Village village) {
        super("Barracks", 1, village);
        this.productionTime = 10; // Example production time
    }

    @Override
    public void upgrade() {
        this.level++;
        this.productionTime -= 1; // Shortens production time with each upgrade
    }
}
