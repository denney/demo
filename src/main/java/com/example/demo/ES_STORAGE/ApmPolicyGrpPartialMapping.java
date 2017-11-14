package com.example.demo.ES_STORAGE;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/19.
 */
@Entity
@Table(name = "APM_POLICY_GRP_PARTIAL_MAPPING", schema = "PUBLIC", catalog = "ES_STORAGE")
@IdClass(ApmPolicyGrpPartialMappingPK.class)
public class ApmPolicyGrpPartialMapping {
    private Integer policyGrpId;
    private Integer policyPartialId;
    private String effect;
    private String policyId;
    private ApmPolicyGroup apmPolicyGroupByPolicyGrpId;
    private ApmEntitlementPolicyPartial apmEntitlementPolicyPartialByPolicyPartialId;

    @Id
    @Column(name = "POLICY_GRP_ID")
    public Integer getPolicyGrpId() {
        return policyGrpId;
    }

    public void setPolicyGrpId(Integer policyGrpId) {
        this.policyGrpId = policyGrpId;
    }

    @Id
    @Column(name = "POLICY_PARTIAL_ID")
    public Integer getPolicyPartialId() {
        return policyPartialId;
    }

    public void setPolicyPartialId(Integer policyPartialId) {
        this.policyPartialId = policyPartialId;
    }

    @Basic
    @Column(name = "EFFECT")
    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    @Basic
    @Column(name = "POLICY_ID")
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmPolicyGrpPartialMapping that = (ApmPolicyGrpPartialMapping) o;

        if (policyGrpId != null ? !policyGrpId.equals(that.policyGrpId) : that.policyGrpId != null) return false;
        if (policyPartialId != null ? !policyPartialId.equals(that.policyPartialId) : that.policyPartialId != null)
            return false;
        if (effect != null ? !effect.equals(that.effect) : that.effect != null) return false;
        if (policyId != null ? !policyId.equals(that.policyId) : that.policyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = policyGrpId != null ? policyGrpId.hashCode() : 0;
        result = 31 * result + (policyPartialId != null ? policyPartialId.hashCode() : 0);
        result = 31 * result + (effect != null ? effect.hashCode() : 0);
        result = 31 * result + (policyId != null ? policyId.hashCode() : 0);
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
    @JoinColumn(name = "POLICY_PARTIAL_ID", referencedColumnName = "ENTITLEMENT_POLICY_PARTIAL_ID", nullable = false)
    public ApmEntitlementPolicyPartial getApmEntitlementPolicyPartialByPolicyPartialId() {
        return apmEntitlementPolicyPartialByPolicyPartialId;
    }

    public void setApmEntitlementPolicyPartialByPolicyPartialId(ApmEntitlementPolicyPartial apmEntitlementPolicyPartialByPolicyPartialId) {
        this.apmEntitlementPolicyPartialByPolicyPartialId = apmEntitlementPolicyPartialByPolicyPartialId;
    }
}
