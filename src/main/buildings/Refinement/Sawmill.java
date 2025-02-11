package main.buildings.refinement;

import main.buildings.base.Building;
import main.buildings.base.BuildingType;

public class Sawmill extends Building {
    public Sawmill() {
        super(BuildingType.SAWMILL);
    }

    public int refineWood(int rawWood) {
        return (int) (rawWood * 1.2);
    }
}
