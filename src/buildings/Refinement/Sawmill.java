package buildings.Refinement;

import buildings.Base.Building;
import buildings.Base.BuildingType;

public class Sawmill extends Building {
    public Sawmill() {
        super(BuildingType.SAWMILL);
    }

    public int refineWood(int rawWood) {
        return (int) (rawWood * 1.2);
    }
}
