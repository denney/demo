package com.example.demo.ES_STORAGE;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/19.
 */
public class ApmPolicyGroupMappingPK implements Serializable {
    private Integer policyGrpId;
    private Integer appId;

    @Column(name = "POLICY_GRP_ID")
    @Id
    public Integer getPolicyGrpId() {
        return policyGrpId;
    }

    public void setPolicyGrpId(Integer policyGrpId) {
        this.policyGrpId = policyGrpId;
    }

    @Column(name = "APP_ID")
    @Id
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

        ApmPolicyGroupMappingPK that = (ApmPolicyGroupMappingPK) o;

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
}
