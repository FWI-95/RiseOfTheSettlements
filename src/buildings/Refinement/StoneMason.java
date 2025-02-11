package buildings.Refinement;

import buildings.Base.Building;
import buildings.Base.BuildingType;

public class StoneMason extends Building {
    public StoneMason() {
        super(BuildingType.STONE_MASON);
    }

    public int refineStone(int rawStone) {
        return (int) (rawStone * 1.2);
    }
}
