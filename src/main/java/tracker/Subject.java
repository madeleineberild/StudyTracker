package tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * We study a subject
 */
public class Subject {
    String name;
    List<StudyEntry> recorded;

    public Subject(String name) {
        this.name = name;
        this.recorded = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void record(StudyEntry e) {
        recorded.add(e);
    }

    public void getRecorded() {
        //samma som i StudyPeriod
    }
}
