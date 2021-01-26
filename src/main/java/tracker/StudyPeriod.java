package src.main.java.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created for each semester/term and contains a number of StudyEntries
 */
public class StudyPeriod extends StudyRecorder {
    int weeks;

    public StudyPeriod(String name, int weeks) {
        super(name);
        this.weeks = weeks;
    }

    public int getWeeks() {
        return weeks;
    }

}
