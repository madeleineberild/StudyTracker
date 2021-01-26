package tracker;

import java.util.ArrayList;
import java.util.List;

public class StudyPeriod {
    String name;
    int weeks;
    List<StudyEntry> recorded;

    public StudyPeriod(String name, int weeks) {
        this.name = name;
        this.weeks = weeks;
        this.recorded = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getWeeks() {
        return weeks;
    }

    public void getRecorded() {
        //TODO: hitta ett sätt där vi kan ge ut en struktur med alla entries
        // (till statistics) som inte är mutable och kan fucka upp allt
    }

}
