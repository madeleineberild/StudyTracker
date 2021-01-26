package src.main.java.tracker;

import java.time.LocalTime;

/**
 * A StudyEntry is created for each recorded study event
 * TODO: figure out how to represent the amount of time. int? double? hours and minutes via some time class?
 */
public class StudyEntry {

    private LocalTime time;
    private String description;
    private Subject subject;


    public StudyEntry(LocalTime time, String description) {

        this.time = time;
        this.description = description;
    }

    public StudyEntry (LocalTime time) {
        this.time = time;
        this.description = "";
    }

    public LocalTime getTime () {
        return time;
    }

    public void addDescription (String description) {
        this.description += description;
    }

    public void addSubject (Subject sub) {
        this.subject = sub;
    }

}
