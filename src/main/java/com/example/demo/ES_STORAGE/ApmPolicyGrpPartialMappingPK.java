package com.example.demo.ES_STORAGE;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/19.
 */
public class ApmPolicyGrpPartialMappingPK implements Serializable {
    private Integer policyGrpId;
    private Integer policyPartialId;

    @Column(name = "POLICY_GRP_ID")
    @Id
    public Integer getPolicyGrpId() {
        return policyGrpId;
    }

    public void setPolicyGrpId(Integer policyGrpId) {
        this.policyGrpId = policyGrpId;
    }

    @Column(name = "POLICY_PARTIAL_ID")
    @Id
    public Integer getPolicyPartialId() {
        return policyPartialId;
    }

    public void setPolicyPartialId(Integer policyPartialId) {
        this.policyPartialId = policyPartialId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmPolicyGrpPartialMappingPK that = (ApmPolicyGrpPartialMappingPK) o;

        if (policyGrpId != null ? !policyGrpId.equals(that.policyGrpId) : that.policyGrpId != null) return false;
        if (policyPartialId != null ? !policyPartialId.equals(that.policyPartialId) : that.policyPartialId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = policyGrpId != null ? policyGrpId.hashCode() : 0;
        result = 31 * result + (policyPartialId != null ? policyPartialId.hashCode() : 0);
        return result;
    }
}
