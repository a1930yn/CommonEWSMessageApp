package jp.ac.aiit.pbl.commonews.demo.api;

import org.seasar.doma.*;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;


@Entity
@Table(name = "ewssep")
public class CommonEWSMessageEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long ewsSepId;

    private String preamble;

    private String mt;

    private String messageType;

    private String country;

    private String provider;

    private String event;

    private String severity;

    private LocalDateTime eventOnSet;

    private String guidanceToReact;

    private double latitude;

    private double longitude;

    private long semiMajorAxisLength;

    private long semiMinorAxisLength;

    private double azimuthAngle;

    public long getEwsSepId() {
        return ewsSepId;
    }

    public void setEwsSepId(long ewsSepId) {
        this.ewsSepId = ewsSepId;
    }

    public String getPreamble() {
        return preamble;
    }

    public void setPreamble(String preamble) {
        this.preamble = preamble;
    }

    public String getMt() {
        return mt;
    }

    public void setMt(String mt) {
        this.mt = mt;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public LocalDateTime getEventOnSet() {
        return eventOnSet;
    }

    public void setEventOnSet(LocalDateTime eventOnSet) {
        this.eventOnSet = eventOnSet;
    }

    public String getGuidanceToReact() {
        return guidanceToReact;
    }

    public void setGuidanceToReact(String guidanceToReact) {
        this.guidanceToReact = guidanceToReact;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public long getSemiMajorAxisLength() {
        return semiMajorAxisLength;
    }

    public void setSemiMajorAxisLength(long semiMajorAxisLength) {
        this.semiMajorAxisLength = semiMajorAxisLength;
    }

    public long getSemiMinorAxisLength() {
        return semiMinorAxisLength;
    }

    public void setSemiMinorAxisLength(long semiMinorAxisLength) {
        this.semiMinorAxisLength = semiMinorAxisLength;
    }

    public double getAzimuthAngle() {
        return azimuthAngle;
    }

    public void setAzimuthAngle(double azimuthAngle) {
        this.azimuthAngle = azimuthAngle;
    }
}
