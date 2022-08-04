package lesson28;

import java.util.Date;

public class Capability {
    private final long id;
    private final String channelName;
    private final String fingerprint;
    private final boolean isActive;
    private final Date dataCreated;

    public Capability(long id, String channelName, String fingerprint, boolean isActive, Date dataCreated) {
        this.id = id;
        this.channelName = channelName;
        this.fingerprint = fingerprint;
        this.isActive = isActive;
        this.dataCreated = dataCreated;
    }

    public long getId() {
        return id;
    }

    public String getChannelName() {
        return channelName;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public boolean isActive() {
        return isActive;
    }

    public Date getDataCreated() {
        return dataCreated;
    }

    @Override
    public String toString() {
        return "Capability{" +
                "id=" + id +
                ", channelName='" + channelName + '\'' +
                ", fingerprint='" + fingerprint + '\'' +
                ", isActive=" + isActive +
                ", dataCreated=" + dataCreated +
                '}';
    }
}
