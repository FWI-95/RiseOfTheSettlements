package main.buildings.refinement;

import main.buildings.base.Building;
import main.buildings.base.BuildingType;

public class StoneMason extends Building {
    public StoneMason() {
        super(BuildingType.STONE_MASON);
    }

    public int refineStone(int rawStone) {
        return (int) (rawStone * 1.2); // 20% increase based on available stone
    }
}
