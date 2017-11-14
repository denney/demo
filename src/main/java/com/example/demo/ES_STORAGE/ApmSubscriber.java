package com.example.demo.ES_STORAGE;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by admin on 2017/8/19.
 */
@Entity
@Table(name = "APM_SUBSCRIBER", schema = "PUBLIC", catalog = "ES_STORAGE")
public class ApmSubscriber {
    private Integer subscriberId;
    private String userId;
    private Integer tenantId;
    private String emailAddress;
    private Timestamp dateSubscribed;
    private Collection<ApmApplication> apmApplicationsBySubscriberId;

    @Id
    @Column(name = "SUBSCRIBER_ID")
    public Integer getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Integer subscriberId) {
        this.subscriberId = subscriberId;
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
    @Column(name = "EMAIL_ADDRESS")
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Basic
    @Column(name = "DATE_SUBSCRIBED")
    public Timestamp getDateSubscribed() {
        return dateSubscribed;
    }

    public void setDateSubscribed(Timestamp dateSubscribed) {
        this.dateSubscribed = dateSubscribed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmSubscriber that = (ApmSubscriber) o;

        if (subscriberId != null ? !subscriberId.equals(that.subscriberId) : that.subscriberId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;
        if (emailAddress != null ? !emailAddress.equals(that.emailAddress) : that.emailAddress != null) return false;
        if (dateSubscribed != null ? !dateSubscribed.equals(that.dateSubscribed) : that.dateSubscribed != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subscriberId != null ? subscriberId.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
        result = 31 * result + (dateSubscribed != null ? dateSubscribed.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "apmSubscriberBySubscriberId")
    public Collection<ApmApplication> getApmApplicationsBySubscriberId() {
        return apmApplicationsBySubscriberId;
    }

    public void setApmApplicationsBySubscriberId(Collection<ApmApplication> apmApplicationsBySubscriberId) {
        this.apmApplicationsBySubscriberId = apmApplicationsBySubscriberId;
    }
}
