package com.example.demo.ES_STORAGE;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by admin on 2017/8/19.
 */
@Entity
@Table(name = "APM_SUBSCRIPTION", schema = "PUBLIC", catalog = "ES_STORAGE")
public class ApmSubscription {
    private Integer subscriptionId;
    private String subscriptionType;
    private String tierId;
    private Integer appId;
    private Timestamp lastAccessed;
    private Integer applicationId;
    private String subStatus;
    private String trustedIdp;
    private Timestamp subscriptionTime;
    private ApmApp apmAppByAppId;
    private ApmApplication apmApplicationByApplicationId;

    @Id
    @Column(name = "SUBSCRIPTION_ID")
    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    @Basic
    @Column(name = "SUBSCRIPTION_TYPE")
    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    @Basic
    @Column(name = "TIER_ID")
    public String getTierId() {
        return tierId;
    }

    public void setTierId(String tierId) {
        this.tierId = tierId;
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
    @Column(name = "LAST_ACCESSED")
    public Timestamp getLastAccessed() {
        return lastAccessed;
    }

    public void setLastAccessed(Timestamp lastAccessed) {
        this.lastAccessed = lastAccessed;
    }

    @Basic
    @Column(name = "APPLICATION_ID")
    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    @Basic
    @Column(name = "SUB_STATUS")
    public String getSubStatus() {
        return subStatus;
    }

    public void setSubStatus(String subStatus) {
        this.subStatus = subStatus;
    }

    @Basic
    @Column(name = "TRUSTED_IDP")
    public String getTrustedIdp() {
        return trustedIdp;
    }

    public void setTrustedIdp(String trustedIdp) {
        this.trustedIdp = trustedIdp;
    }

    @Basic
    @Column(name = "SUBSCRIPTION_TIME")
    public Timestamp getSubscriptionTime() {
        return subscriptionTime;
    }

    public void setSubscriptionTime(Timestamp subscriptionTime) {
        this.subscriptionTime = subscriptionTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmSubscription that = (ApmSubscription) o;

        if (subscriptionId != null ? !subscriptionId.equals(that.subscriptionId) : that.subscriptionId != null)
            return false;
        if (subscriptionType != null ? !subscriptionType.equals(that.subscriptionType) : that.subscriptionType != null)
            return false;
        if (tierId != null ? !tierId.equals(that.tierId) : that.tierId != null) return false;
        if (appId != null ? !appId.equals(that.appId) : that.appId != null) return false;
        if (lastAccessed != null ? !lastAccessed.equals(that.lastAccessed) : that.lastAccessed != null) return false;
        if (applicationId != null ? !applicationId.equals(that.applicationId) : that.applicationId != null)
            return false;
        if (subStatus != null ? !subStatus.equals(that.subStatus) : that.subStatus != null) return false;
        if (trustedIdp != null ? !trustedIdp.equals(that.trustedIdp) : that.trustedIdp != null) return false;
        if (subscriptionTime != null ? !subscriptionTime.equals(that.subscriptionTime) : that.subscriptionTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subscriptionId != null ? subscriptionId.hashCode() : 0;
        result = 31 * result + (subscriptionType != null ? subscriptionType.hashCode() : 0);
        result = 31 * result + (tierId != null ? tierId.hashCode() : 0);
        result = 31 * result + (appId != null ? appId.hashCode() : 0);
        result = 31 * result + (lastAccessed != null ? lastAccessed.hashCode() : 0);
        result = 31 * result + (applicationId != null ? applicationId.hashCode() : 0);
        result = 31 * result + (subStatus != null ? subStatus.hashCode() : 0);
        result = 31 * result + (trustedIdp != null ? trustedIdp.hashCode() : 0);
        result = 31 * result + (subscriptionTime != null ? subscriptionTime.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "APP_ID", referencedColumnName = "APP_ID")
    public ApmApp getApmAppByAppId() {
        return apmAppByAppId;
    }

    public void setApmAppByAppId(ApmApp apmAppByAppId) {
        this.apmAppByAppId = apmAppByAppId;
    }

    @ManyToOne
    @JoinColumn(name = "APPLICATION_ID", referencedColumnName = "APPLICATION_ID")
    public ApmApplication getApmApplicationByApplicationId() {
        return apmApplicationByApplicationId;
    }

    public void setApmApplicationByApplicationId(ApmApplication apmApplicationByApplicationId) {
        this.apmApplicationByApplicationId = apmApplicationByApplicationId;
    }
}
