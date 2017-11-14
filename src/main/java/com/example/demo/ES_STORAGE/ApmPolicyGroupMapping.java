package com.example.demo.ES_STORAGE;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/19.
 */
@Entity
@Table(name = "APM_POLICY_GROUP_MAPPING", schema = "PUBLIC", catalog = "ES_STORAGE")
@IdClass(ApmPolicyGroupMappingPK.class)
public class ApmPolicyGroupMapping {
    private Integer policyGrpId;
    private Integer appId;
    private ApmPolicyGroup apmPolicyGroupByPolicyGrpId;
    private ApmApp apmAppByAppId;

    @Id
    @Column(name = "POLICY_GRP_ID")
    public Integer getPolicyGrpId() {
        return policyGrpId;
    }

    public void setPolicyGrpId(Integer policyGrpId) {
        this.policyGrpId = policyGrpId;
    }

    @Id
    @Column(name = "APP_ID")
    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmPolicyGroupMapping that = (ApmPolicyGroupMapping) o;

        if (policyGrpId != null ? !policyGrpId.equals(that.policyGrpId) : that.policyGrpId != null) return false;
        if (appId != null ? !appId.equals(that.appId) : that.appId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = policyGrpId != null ? policyGrpId.hashCode() : 0;
        result = 31 * result + (appId != null ? appId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "POLICY_GRP_ID", referencedColumnName = "POLICY_GRP_ID", nullable = false)
    public ApmPolicyGroup getApmPolicyGroupByPolicyGrpId() {
        return apmPolicyGroupByPolicyGrpId;
    }

    public void setApmPolicyGroupByPolicyGrpId(ApmPolicyGroup apmPolicyGroupByPolicyGrpId) {
        this.apmPolicyGroupByPolicyGrpId = apmPolicyGroupByPolicyGrpId;
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
