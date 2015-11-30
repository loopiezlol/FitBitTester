package uk.loopiezlol.fitbittester.models;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TrackerAlarm {

    @SerializedName("alarmId")
    @Expose
    private Integer alarmId;
    @SerializedName("deleted")
    @Expose
    private Boolean deleted;
    @SerializedName("enabled")
    @Expose
    private Boolean enabled;
    @SerializedName("recurring")
    @Expose
    private Boolean recurring;
    @SerializedName("snoozeCount")
    @Expose
    private Integer snoozeCount;
    @SerializedName("snoozeLength")
    @Expose
    private Integer snoozeLength;
    @SerializedName("syncedToDevice")
    @Expose
    private Boolean syncedToDevice;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("vibe")
    @Expose
    private String vibe;
    @SerializedName("weekDays")
    @Expose
    private List<String> weekDays = new ArrayList<String>();

    /**
     *
     * @return
     * The alarmId
     */
    public Integer getAlarmId() {
        return alarmId;
    }

    /**
     *
     * @param alarmId
     * The alarmId
     */
    public void setAlarmId(Integer alarmId) {
        this.alarmId = alarmId;
    }

    /**
     *
     * @return
     * The deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     *
     * @param deleted
     * The deleted
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     *
     * @return
     * The enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     *
     * @param enabled
     * The enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     *
     * @return
     * The recurring
     */
    public Boolean getRecurring() {
        return recurring;
    }

    /**
     *
     * @param recurring
     * The recurring
     */
    public void setRecurring(Boolean recurring) {
        this.recurring = recurring;
    }

    /**
     *
     * @return
     * The snoozeCount
     */
    public Integer getSnoozeCount() {
        return snoozeCount;
    }

    /**
     *
     * @param snoozeCount
     * The snoozeCount
     */
    public void setSnoozeCount(Integer snoozeCount) {
        this.snoozeCount = snoozeCount;
    }

    /**
     *
     * @return
     * The snoozeLength
     */
    public Integer getSnoozeLength() {
        return snoozeLength;
    }

    /**
     *
     * @param snoozeLength
     * The snoozeLength
     */
    public void setSnoozeLength(Integer snoozeLength) {
        this.snoozeLength = snoozeLength;
    }

    /**
     *
     * @return
     * The syncedToDevice
     */
    public Boolean getSyncedToDevice() {
        return syncedToDevice;
    }

    /**
     *
     * @param syncedToDevice
     * The syncedToDevice
     */
    public void setSyncedToDevice(Boolean syncedToDevice) {
        this.syncedToDevice = syncedToDevice;
    }

    /**
     *
     * @return
     * The time
     */
    public String getTime() {
        return time;
    }

    /**
     *
     * @param time
     * The time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     *
     * @return
     * The vibe
     */
    public String getVibe() {
        return vibe;
    }

    /**
     *
     * @param vibe
     * The vibe
     */
    public void setVibe(String vibe) {
        this.vibe = vibe;
    }

    /**
     *
     * @return
     * The weekDays
     */
    public List<String> getWeekDays() {
        return weekDays;
    }

    /**
     *
     * @param weekDays
     * The weekDays
     */
    public void setWeekDays(List<String> weekDays) {
        this.weekDays = weekDays;
    }

}