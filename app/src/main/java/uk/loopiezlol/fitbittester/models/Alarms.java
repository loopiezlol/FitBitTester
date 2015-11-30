package uk.loopiezlol.fitbittester.models;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Alarms {

    @SerializedName("trackerAlarms")
    @Expose
    private List<TrackerAlarm> trackerAlarms = new ArrayList<TrackerAlarm>();

    public Alarms() {
        this.trackerAlarms = new ArrayList<>();
    }

    /**
     *
     * @return
     * The trackerAlarms
     */
    public List<TrackerAlarm> getTrackerAlarms() {
        return trackerAlarms;
    }

    /**
     *
     * @param trackerAlarms
     * The trackerAlarms
     */
    public void setTrackerAlarms(List<TrackerAlarm> trackerAlarms) {
        this.trackerAlarms = trackerAlarms;
    }





}