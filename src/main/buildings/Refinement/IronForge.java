package main.buildings.refinement;

import main.buildings.base.Building;
import main.buildings.base.BuildingType;

public class IronForge extends Building {
    public IronForge() {
        super(BuildingType.IRON_FORGE);
    }

    public int refineIron(int rawIron) {
        return (int) (rawIron * 1.2);
    }
}
