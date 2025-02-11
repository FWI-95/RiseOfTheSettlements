import Building;

package military.types;
public class ArcheryRange extends Building {
    public ArcheryRange() {
        super();
    }

    @Override
    public void produceUnit(String unitType) {
        if (isResearched(unitType)) {
            System.out.println("Producing " + unitType + " in Archery Range.");
        } else {
            System.out.println(unitType + " not researched yet.");
        }
    }

    @Override
    public void upgrade() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'upgrade'");
    }
}
