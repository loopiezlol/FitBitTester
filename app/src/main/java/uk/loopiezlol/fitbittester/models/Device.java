package uk.loopiezlol.fitbittester.models;

import java.util.HashMap;
import java.util.Map;


public class Device {

    private String battery;
    private String deviceVersion;
    private String id;
    private String lastSyncTime;
    private String type;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The battery
     */
    public String getBattery() {
        return battery;
    }

    /**
     *
     * @param battery
     * The battery
     */
    public void setBattery(String battery) {
        this.battery = battery;
    }

    /**
     *
     * @return
     * The deviceVersion
     */
    public String getDeviceVersion() {
        return deviceVersion;
    }

    /**
     *
     * @param deviceVersion
     * The deviceVersion
     */
    public void setDeviceVersion(String deviceVersion) {
        this.deviceVersion = deviceVersion;
    }

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The lastSyncTime
     */
    public String getLastSyncTime() {
        return lastSyncTime;
    }

    /**
     *
     * @param lastSyncTime
     * The lastSyncTime
     */
    public void setLastSyncTime(String lastSyncTime) {
        this.lastSyncTime = lastSyncTime;
    }

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}