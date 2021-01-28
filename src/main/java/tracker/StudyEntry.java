package tracker;

import java.time.LocalTime;

/**
 * A StudyEntry is created for each recorded study event
 * TODO: figure out how to represent the amount of time. int? double? hours and minutes via some time class?
 */
public class StudyEntry {

    private LocalTime time;
    private String description;
    private Subject subject;

    public StudyEntry (LocalTime time, String description, Subject subject) {

        this.time = time;
        this.subject = subject;
        this.description = description;
    }


    //useful methods
    public LocalTime getTime() {
        return this.time;
    }

    public Subject getSubject () {
        return this.subject;
    }

    //Not sure about this implementation, but worth a try.
    public boolean isOfSubject(Subject subject) {
        return subject.getClass() == this.subject.getClass();
    }

    public String getDescription() {
        return this.description;
    }

    public void addDescription(String desc) {
        this.description += " " + desc;
    }

    //Builder pattern, if needed.
    public class StudyEntryBuilder {
        private LocalTime time;
        private String description;
        private Subject subject;

        public StudyEntryBuilder () {}

        public StudyEntryBuilder time(LocalTime time) {
            this.time = time;
            return this;
        }

        public StudyEntryBuilder subject(Subject subject) {
            this.subject = subject;
            return this;
        }

        public StudyEntryBuilder description(String description) {
            this.description = description;
            return this;
        }

        public StudyEntry build() {
            return new StudyEntry(time, description, subject);
        }
    }


}
