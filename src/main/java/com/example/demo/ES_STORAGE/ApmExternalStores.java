package com.example.demo.ES_STORAGE;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/19.
 */
@Entity
@Table(name = "APM_EXTERNAL_STORES", schema = "PUBLIC", catalog = "ES_STORAGE")
public class ApmExternalStores {
    private Integer appStoreId;
    private Integer appId;
    private String storeId;
    private ApmApp apmAppByAppId;

    @Id
    @Column(name = "APP_STORE_ID")
    public Integer getAppStoreId() {
        return appStoreId;
    }

    public void setAppStoreId(Integer appStoreId) {
        this.appStoreId = appStoreId;
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
    @Column(name = "STORE_ID")
    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmExternalStores that = (ApmExternalStores) o;

        if (appStoreId != null ? !appStoreId.equals(that.appStoreId) : that.appStoreId != null) return false;
        if (appId != null ? !appId.equals(that.appId) : that.appId != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = appStoreId != null ? appStoreId.hashCode() : 0;
        result = 31 * result + (appId != null ? appId.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
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
}
