import java.util.HashMap;
import java.util.Map;

public class University {
    private final Map<ResearchType, Research> researchMap = new HashMap<>();

    public University() {
        researchMap.put(ResearchType.ADVANCED_FARMING, new Research(ResearchType.ADVANCED_FARMING, 10000));
        researchMap.put(ResearchType.MILITARY_TACTICS, new Research(ResearchType.MILITARY_TACTICS, 15000));
        researchMap.put(ResearchType.ARCHITECTURE, new Research(ResearchType.ARCHITECTURE, 20000));
    }

    public void startResearch(ResearchType type) {
        if (researchMap.containsKey(type)) {
            researchMap.get(type).startResearch();
        }
    }

    public void updateResearchProgress() {
        for (Research research : researchMap.values()) {
            research.update();
        }
    }

    public boolean isResearchCompleted(ResearchType type) {
        return researchMap.containsKey(type) && researchMap.get(type).isCompleted();
    }
}
