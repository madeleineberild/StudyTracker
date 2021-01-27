package tracker;

import java.time.LocalTime;
import java.util.List;

public class Statistics {


    /**
     *
     * @param entryList
     * @return LocalTime, as the sum time of all instances in entryList
     */
    public static LocalTime taskSum(List<StudyEntry> entryList) {

        //Use TemporalQuery as lamdba. query()
        //Use getHour(), getMinute() on LocalTime object to extract.

        int hours = entryList.stream().mapToInt(entry -> entry.getTime().getHour()).sum();
        int minutes = entryList.stream().mapToInt(entry -> entry.getTime().getMinute()).sum();

        return LocalTime.of(hours, minutes);
    }


}
