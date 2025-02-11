package main.buildings.refinement;

import main.buildings.base.Building;
import main.buildings.base.BuildingType;

public class Brickworks extends Building {
    public Brickworks() {
        super(BuildingType.BRICKWORKS);
    }

    public int refineClay(int rawClay) {
        return (int) (rawClay * 1.2); // 20% increase based on available clay
    }
}
