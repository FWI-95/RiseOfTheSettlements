package buildings.Refinement;

import buildings.Base.Building;
import buildings.Base.BuildingType;

public class IronForge extends Building {
    public IronForge() {
        super(BuildingType.IRON_FORGE);
    }

    public int refineIron(int rawIron) {
        return (int) (rawIron * 1.2);
    }
}
