import java.util.ArrayList;
import java.util.List;

public class GameLoop {
    private List<Village> villages;
    private int tickCounter;

    public GameLoop() {
        this.villages = new ArrayList<>();
        this.tickCounter = 0;
    }

    public GameLoop(List<Village> villages, int tickCounter) {
        this.villages = villages;
        this.tickCounter = tickCounter;
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

    public List<Village> getVillages() {
        return villages;
    }

    public int getTickCounter() {
        return tickCounter;
    }
}
