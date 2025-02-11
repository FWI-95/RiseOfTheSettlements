package main.buildings.base;

public abstract class Building {
    protected BuildingType type;

    public Building(BuildingType type) {
        this.type = type;
    }

    public BuildingType getType() {
        return type;
    }
}
