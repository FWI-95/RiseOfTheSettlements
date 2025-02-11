public class Barracks extends Building {
    public Barracks() {
        super();
    }

    @Override
    public void produceUnit(String unitType) {
        if (isResearched(unitType)) {
            System.out.println("Producing " + unitType + " in Barracks.");
        } else {
            System.out.println(unitType + " not researched yet.");
        }
    }
}
