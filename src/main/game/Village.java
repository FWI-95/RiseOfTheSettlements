import java.util.*;

public class Village {
    private String name;
    private List<Building> buildings;
    private Queue<UnitProduction> unitQueue;
    private Resources resources;

    public Village(String name) {
        this.name = name;
        this.buildings = new ArrayList<>();
        this.unitQueue = new LinkedList<>();
        this.resources = new Resources();
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public void produceResources() {
        for (Building b : buildings) {
            if (b instanceof ResourceProducingBuilding) {
                ((ResourceProducingBuilding) b).produce(resources);
            }
        }
    }

    public void updateUnitProduction() {
        if (!unitQueue.isEmpty()) {
            UnitProduction up = unitQueue.peek();
            up.reduceProductionTime();
            if (up.isFinished()) {
                up.produceUnit();
                unitQueue.poll();
            }
        }
    }
}
