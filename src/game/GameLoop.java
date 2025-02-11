package game;

import java.util.ArrayList;
import java.util.List;

public class GameLoop {
    private List<Village> villages;
    private int tickCounter;

    public GameLoop() {
        this.villages = new ArrayList<>();
        this.tickCounter = 0;
    }

    public void addVillage(Village village) {
        villages.add(village);
    }

    public void update() {
        for (Village v : villages) {
            v.produceResources();
            v.updateUnitProduction();
        }
        tickCounter++;
    }
}
