package com.example.demo.ES_STORAGE;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by admin on 2017/8/19.
 */
@Entity
@Table(name = "APM_POLICY_GROUP", schema = "PUBLIC", catalog = "ES_STORAGE")
public class ApmPolicyGroup {
    private Integer policyGrpId;
    private String name;
    private String authScheme;
    private String throttlingTier;
    private String userRoles;
    private Boolean urlAllowAnonymous;
    private String description;
    private Collection<ApmAppUrlMapping> apmAppUrlMappingsByPolicyGrpId;
    private Collection<ApmPolicyGroupMapping> apmPolicyGroupMappingsByPolicyGrpId;
    private Collection<ApmPolicyGrpPartialMapping> apmPolicyGrpPartialMappingsByPolicyGrpId;

    @Id
    @Column(name = "POLICY_GRP_ID")
    public Integer getPolicyGrpId() {
        return policyGrpId;
    }

    public void setPolicyGrpId(Integer policyGrpId) {
        this.policyGrpId = policyGrpId;
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
    @Column(name = "AUTH_SCHEME")
    public String getAuthScheme() {
        return authScheme;
    }

    public void setAuthScheme(String authScheme) {
        this.authScheme = authScheme;
    }

    @Basic
    @Column(name = "THROTTLING_TIER")
    public String getThrottlingTier() {
        return throttlingTier;
    }

    public void setThrottlingTier(String throttlingTier) {
        this.throttlingTier = throttlingTier;
    }

    @Basic
    @Column(name = "USER_ROLES")
    public String getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(String userRoles) {
        this.userRoles = userRoles;
    }

    @Basic
    @Column(name = "URL_ALLOW_ANONYMOUS")
    public Boolean getUrlAllowAnonymous() {
        return urlAllowAnonymous;
    }

    public void setUrlAllowAnonymous(Boolean urlAllowAnonymous) {
        this.urlAllowAnonymous = urlAllowAnonymous;
    }

    @Basic
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmPolicyGroup that = (ApmPolicyGroup) o;

        if (policyGrpId != null ? !policyGrpId.equals(that.policyGrpId) : that.policyGrpId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (authScheme != null ? !authScheme.equals(that.authScheme) : that.authScheme != null) return false;
        if (throttlingTier != null ? !throttlingTier.equals(that.throttlingTier) : that.throttlingTier != null)
            return false;
        if (userRoles != null ? !userRoles.equals(that.userRoles) : that.userRoles != null) return false;
        if (urlAllowAnonymous != null ? !urlAllowAnonymous.equals(that.urlAllowAnonymous) : that.urlAllowAnonymous != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = policyGrpId != null ? policyGrpId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (authScheme != null ? authScheme.hashCode() : 0);
        result = 31 * result + (throttlingTier != null ? throttlingTier.hashCode() : 0);
        result = 31 * result + (userRoles != null ? userRoles.hashCode() : 0);
        result = 31 * result + (urlAllowAnonymous != null ? urlAllowAnonymous.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "apmPolicyGroupByPolicyGrpId")
    public Collection<ApmAppUrlMapping> getApmAppUrlMappingsByPolicyGrpId() {
        return apmAppUrlMappingsByPolicyGrpId;
    }

    public void setApmAppUrlMappingsByPolicyGrpId(Collection<ApmAppUrlMapping> apmAppUrlMappingsByPolicyGrpId) {
        this.apmAppUrlMappingsByPolicyGrpId = apmAppUrlMappingsByPolicyGrpId;
    }

    @OneToMany(mappedBy = "apmPolicyGroupByPolicyGrpId")
    public Collection<ApmPolicyGroupMapping> getApmPolicyGroupMappingsByPolicyGrpId() {
        return apmPolicyGroupMappingsByPolicyGrpId;
    }

    public void setApmPolicyGroupMappingsByPolicyGrpId(Collection<ApmPolicyGroupMapping> apmPolicyGroupMappingsByPolicyGrpId) {
        this.apmPolicyGroupMappingsByPolicyGrpId = apmPolicyGroupMappingsByPolicyGrpId;
    }

    @OneToMany(mappedBy = "apmPolicyGroupByPolicyGrpId")
    public Collection<ApmPolicyGrpPartialMapping> getApmPolicyGrpPartialMappingsByPolicyGrpId() {
        return apmPolicyGrpPartialMappingsByPolicyGrpId;
    }

    public void setApmPolicyGrpPartialMappingsByPolicyGrpId(Collection<ApmPolicyGrpPartialMapping> apmPolicyGrpPartialMappingsByPolicyGrpId) {
        this.apmPolicyGrpPartialMappingsByPolicyGrpId = apmPolicyGrpPartialMappingsByPolicyGrpId;
    }
}
