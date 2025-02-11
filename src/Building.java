
public abstract class Building {
    protected String name;
    protected int level;
    protected int productionTime;
    protected Village village;

    public Building(String name, int level, Village village) {
        this.name = name;
        this.level = level;
        this.village = village;
    }

    public abstract void upgrade();

    public void produce() {
        // Placeholder logic for production
        System.out.println("Producing in " + name);
    }

    public int getProductionTime() {
        return productionTime;
    }
}
