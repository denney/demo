package com.example.demo.ES_STORAGE;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/19.
 */
@Entity
@Table(name = "APM_STORE_FAVOURITE_PAGE", schema = "PUBLIC", catalog = "ES_STORAGE")
public class ApmStoreFavouritePage {
    private Integer id;
    private String userId;
    private Integer tenantIdOfUser;
    private Integer tenantIdOfStore;

    @Id
    @Column(name = "ID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    @Column(name = "TENANT_ID_OF_USER")
    public Integer getTenantIdOfUser() {
        return tenantIdOfUser;
    }

    public void setTenantIdOfUser(Integer tenantIdOfUser) {
        this.tenantIdOfUser = tenantIdOfUser;
    }

    @Basic
    @Column(name = "TENANT_ID_OF_STORE")
    public Integer getTenantIdOfStore() {
        return tenantIdOfStore;
    }

    public void setTenantIdOfStore(Integer tenantIdOfStore) {
        this.tenantIdOfStore = tenantIdOfStore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmStoreFavouritePage that = (ApmStoreFavouritePage) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (tenantIdOfUser != null ? !tenantIdOfUser.equals(that.tenantIdOfUser) : that.tenantIdOfUser != null)
            return false;
        if (tenantIdOfStore != null ? !tenantIdOfStore.equals(that.tenantIdOfStore) : that.tenantIdOfStore != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (tenantIdOfUser != null ? tenantIdOfUser.hashCode() : 0);
        result = 31 * result + (tenantIdOfStore != null ? tenantIdOfStore.hashCode() : 0);
        return result;
    }
}
