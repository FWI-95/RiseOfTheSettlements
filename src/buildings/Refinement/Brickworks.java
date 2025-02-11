package buildings.Refinement;

import buildings.Base.Building;
import buildings.Base.BuildingType;

public class Brickworks extends Building {
    public Brickworks() {
        super(BuildingType.BRICKWORKS);
    }

    public int refineClay(int rawClay) {
        return (int) (rawClay * 1.2);
    }
}
