package src.main.java.tracker;

import java.util.ArrayList;
import java.util.List;

abstract class StudyRecorder {
    String name;
    List<StudyEntry> recorded;

    StudyRecorder(String name) {
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
        //TODO: hitta ett sätt där vi kan ge ut en struktur med alla entries
        // (till statistics) som inte är mutable och kan fucka upp allt
    }
}
