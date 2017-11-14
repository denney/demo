package com.example.demo.ES_STORAGE;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by admin on 2017/8/19.
 */
@Entity
@Table(name = "APM_APPLICATION", schema = "PUBLIC", catalog = "ES_STORAGE")
public class ApmApplication {
    private Integer applicationId;
    private String name;
    private Integer subscriberId;
    private String applicationTier;
    private String callbackUrl;
    private String description;
    private String applicationStatus;
    private ApmSubscriber apmSubscriberBySubscriberId;
    private Collection<ApmSubscription> apmSubscriptionsByApplicationId;

    @Id
    @Column(name = "APPLICATION_ID")
    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "SUBSCRIBER_ID")
    public Integer getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Integer subscriberId) {
        this.subscriberId = subscriberId;
    }

    @Basic
    @Column(name = "APPLICATION_TIER")
    public String getApplicationTier() {
        return applicationTier;
    }

    public void setApplicationTier(String applicationTier) {
        this.applicationTier = applicationTier;
    }

    @Basic
    @Column(name = "CALLBACK_URL")
    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    @Basic
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "APPLICATION_STATUS")
    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmApplication that = (ApmApplication) o;

        if (applicationId != null ? !applicationId.equals(that.applicationId) : that.applicationId != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (subscriberId != null ? !subscriberId.equals(that.subscriberId) : that.subscriberId != null) return false;
        if (applicationTier != null ? !applicationTier.equals(that.applicationTier) : that.applicationTier != null)
            return false;
        if (callbackUrl != null ? !callbackUrl.equals(that.callbackUrl) : that.callbackUrl != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (applicationStatus != null ? !applicationStatus.equals(that.applicationStatus) : that.applicationStatus != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = applicationId != null ? applicationId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (subscriberId != null ? subscriberId.hashCode() : 0);
        result = 31 * result + (applicationTier != null ? applicationTier.hashCode() : 0);
        result = 31 * result + (callbackUrl != null ? callbackUrl.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (applicationStatus != null ? applicationStatus.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "SUBSCRIBER_ID", referencedColumnName = "SUBSCRIBER_ID")
    public ApmSubscriber getApmSubscriberBySubscriberId() {
        return apmSubscriberBySubscriberId;
    }

    public void setApmSubscriberBySubscriberId(ApmSubscriber apmSubscriberBySubscriberId) {
        this.apmSubscriberBySubscriberId = apmSubscriberBySubscriberId;
    }

    @OneToMany(mappedBy = "apmApplicationByApplicationId")
    public Collection<ApmSubscription> getApmSubscriptionsByApplicationId() {
        return apmSubscriptionsByApplicationId;
    }

    public void setApmSubscriptionsByApplicationId(Collection<ApmSubscription> apmSubscriptionsByApplicationId) {
        this.apmSubscriptionsByApplicationId = apmSubscriptionsByApplicationId;
    }
}
