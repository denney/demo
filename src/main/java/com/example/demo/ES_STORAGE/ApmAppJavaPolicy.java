package com.example.demo.ES_STORAGE;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by admin on 2017/8/19.
 */
@Entity
@Table(name = "APM_APP_JAVA_POLICY", schema = "PUBLIC", catalog = "ES_STORAGE")
public class ApmAppJavaPolicy {
    private Integer javaPolicyId;
    private String displayName;
    private String fullQualifiName;
    private String description;
    private Integer displayOrderSeqNo;
    private Boolean isMandatory;
    private String policyProperties;
    private Boolean isGlobal;
    private Collection<ApmAppJavaPolicyMapping> apmAppJavaPolicyMappingsByJavaPolicyId;

    @Id
    @Column(name = "JAVA_POLICY_ID")
    public Integer getJavaPolicyId() {
        return javaPolicyId;
    }

    public void setJavaPolicyId(Integer javaPolicyId) {
        this.javaPolicyId = javaPolicyId;
    }

    @Basic
    @Column(name = "DISPLAY_NAME")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Basic
    @Column(name = "FULL_QUALIFI_NAME")
    public String getFullQualifiName() {
        return fullQualifiName;
    }

    public void setFullQualifiName(String fullQualifiName) {
        this.fullQualifiName = fullQualifiName;
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
    @Column(name = "DISPLAY_ORDER_SEQ_NO")
    public Integer getDisplayOrderSeqNo() {
        return displayOrderSeqNo;
    }

    public void setDisplayOrderSeqNo(Integer displayOrderSeqNo) {
        this.displayOrderSeqNo = displayOrderSeqNo;
    }

    @Basic
    @Column(name = "IS_MANDATORY")
    public Boolean getMandatory() {
        return isMandatory;
    }

    public void setMandatory(Boolean mandatory) {
        isMandatory = mandatory;
    }

    @Basic
    @Column(name = "POLICY_PROPERTIES")
    public String getPolicyProperties() {
        return policyProperties;
    }

    public void setPolicyProperties(String policyProperties) {
        this.policyProperties = policyProperties;
    }

    @Basic
    @Column(name = "IS_GLOBAL")
    public Boolean getGlobal() {
        return isGlobal;
    }

    public void setGlobal(Boolean global) {
        isGlobal = global;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmAppJavaPolicy that = (ApmAppJavaPolicy) o;

        if (javaPolicyId != null ? !javaPolicyId.equals(that.javaPolicyId) : that.javaPolicyId != null) return false;
        if (displayName != null ? !displayName.equals(that.displayName) : that.displayName != null) return false;
        if (fullQualifiName != null ? !fullQualifiName.equals(that.fullQualifiName) : that.fullQualifiName != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (displayOrderSeqNo != null ? !displayOrderSeqNo.equals(that.displayOrderSeqNo) : that.displayOrderSeqNo != null)
            return false;
        if (isMandatory != null ? !isMandatory.equals(that.isMandatory) : that.isMandatory != null) return false;
        if (policyProperties != null ? !policyProperties.equals(that.policyProperties) : that.policyProperties != null)
            return false;
        if (isGlobal != null ? !isGlobal.equals(that.isGlobal) : that.isGlobal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = javaPolicyId != null ? javaPolicyId.hashCode() : 0;
        result = 31 * result + (displayName != null ? displayName.hashCode() : 0);
        result = 31 * result + (fullQualifiName != null ? fullQualifiName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (displayOrderSeqNo != null ? displayOrderSeqNo.hashCode() : 0);
        result = 31 * result + (isMandatory != null ? isMandatory.hashCode() : 0);
        result = 31 * result + (policyProperties != null ? policyProperties.hashCode() : 0);
        result = 31 * result + (isGlobal != null ? isGlobal.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "apmAppJavaPolicyByJavaPolicyId")
    public Collection<ApmAppJavaPolicyMapping> getApmAppJavaPolicyMappingsByJavaPolicyId() {
        return apmAppJavaPolicyMappingsByJavaPolicyId;
    }

    public void setApmAppJavaPolicyMappingsByJavaPolicyId(Collection<ApmAppJavaPolicyMapping> apmAppJavaPolicyMappingsByJavaPolicyId) {
        this.apmAppJavaPolicyMappingsByJavaPolicyId = apmAppJavaPolicyMappingsByJavaPolicyId;
    }
}
