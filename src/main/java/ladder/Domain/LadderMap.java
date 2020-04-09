package ladder.Domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class LadderMap {

    List<Line> ladderMap;

    public LadderMap(Users uesrs, int highest, CrossRoadStrategy crossRoadStrategy) {
        this.ladderMap = createMap(uesrs.toList().size(), highest, crossRoadStrategy);
    }

    public static LadderMap of(Users uesrs, int height, CrossRoadStrategy crossRoadStrategy) {
        return new LadderMap(uesrs, height, crossRoadStrategy);
    }

    private List<Line> createMap(int usersCount, int height, CrossRoadStrategy crossRoadStrategy) {
        List<Line> newMap = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            newMap.add(Line.of(usersCount, crossRoadStrategy));
        }
        return newMap;
    }

    public List<Line> toList() {
        return Collections.unmodifiableList(ladderMap);
    }
}
