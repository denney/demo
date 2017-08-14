package com.example.demo.WSO2CARBON_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "UM_HYBRID_USER_ROLE", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
@IdClass(UmHybridUserRolePK.class)
public class UmHybridUserRole {
    private int umId;
    private String umUserName;
    private int umRoleId;
    private int umTenantId;
    private Integer umDomainId;

    @Id
    @Column(name = "UM_ID")
    public int getUmId() {
        return umId;
    }

    public void setUmId(int umId) {
        this.umId = umId;
    }

    @Basic
    @Column(name = "UM_USER_NAME")
    public String getUmUserName() {
        return umUserName;
    }

    public void setUmUserName(String umUserName) {
        this.umUserName = umUserName;
    }

    @Basic
    @Column(name = "UM_ROLE_ID")
    public int getUmRoleId() {
        return umRoleId;
    }

    public void setUmRoleId(int umRoleId) {
        this.umRoleId = umRoleId;
    }

    @Id
    @Column(name = "UM_TENANT_ID")
    public int getUmTenantId() {
        return umTenantId;
    }

    public void setUmTenantId(int umTenantId) {
        this.umTenantId = umTenantId;
    }

    @Basic
    @Column(name = "UM_DOMAIN_ID")
    public Integer getUmDomainId() {
        return umDomainId;
    }

    public void setUmDomainId(Integer umDomainId) {
        this.umDomainId = umDomainId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UmHybridUserRole that = (UmHybridUserRole) o;

        if (umId != that.umId) return false;
        if (umRoleId != that.umRoleId) return false;
        if (umTenantId != that.umTenantId) return false;
        if (umUserName != null ? !umUserName.equals(that.umUserName) : that.umUserName != null) return false;
        if (umDomainId != null ? !umDomainId.equals(that.umDomainId) : that.umDomainId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = umId;
        result = 31 * result + (umUserName != null ? umUserName.hashCode() : 0);
        result = 31 * result + umRoleId;
        result = 31 * result + umTenantId;
        result = 31 * result + (umDomainId != null ? umDomainId.hashCode() : 0);
        return result;
    }
}
