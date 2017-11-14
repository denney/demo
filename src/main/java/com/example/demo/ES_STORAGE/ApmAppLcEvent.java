package com.example.demo.ES_STORAGE;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by admin on 2017/8/19.
 */
@Entity
@Table(name = "APM_APP_LC_EVENT", schema = "PUBLIC", catalog = "ES_STORAGE")
public class ApmAppLcEvent {
    private Integer eventId;
    private Integer appId;
    private String previousState;
    private String newState;
    private String userId;
    private Integer tenantId;
    private Timestamp eventDate;
    private ApmApp apmAppByAppId;

    @Id
    @Column(name = "EVENT_ID")
    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    @Basic
    @Column(name = "APP_ID")
    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    @Basic
    @Column(name = "PREVIOUS_STATE")
    public String getPreviousState() {
        return previousState;
    }

    public void setPreviousState(String previousState) {
        this.previousState = previousState;
    }

    @Basic
    @Column(name = "NEW_STATE")
    public String getNewState() {
        return newState;
    }

    public void setNewState(String newState) {
        this.newState = newState;
    }

    @Basic
    @Column(name = "USER_ID")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "TENANT_ID")
    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    @Basic
    @Column(name = "EVENT_DATE")
    public Timestamp getEventDate() {
        return eventDate;
    }

    public void setEventDate(Timestamp eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmAppLcEvent that = (ApmAppLcEvent) o;

        if (eventId != null ? !eventId.equals(that.eventId) : that.eventId != null) return false;
        if (appId != null ? !appId.equals(that.appId) : that.appId != null) return false;
        if (previousState != null ? !previousState.equals(that.previousState) : that.previousState != null)
            return false;
        if (newState != null ? !newState.equals(that.newState) : that.newState != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;
        if (eventDate != null ? !eventDate.equals(that.eventDate) : that.eventDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = eventId != null ? eventId.hashCode() : 0;
        result = 31 * result + (appId != null ? appId.hashCode() : 0);
        result = 31 * result + (previousState != null ? previousState.hashCode() : 0);
        result = 31 * result + (newState != null ? newState.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + (eventDate != null ? eventDate.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "APP_ID", referencedColumnName = "APP_ID", nullable = false)
    public ApmApp getApmAppByAppId() {
        return apmAppByAppId;
    }

    public void setApmAppByAppId(ApmApp apmAppByAppId) {
        this.apmAppByAppId = apmAppByAppId;
    }
}
