package com.example.demo.ES_STORAGE;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/19.
 */
@Entity
@Table(name = "APM_APP_JAVA_POLICY_MAPPING", schema = "PUBLIC", catalog = "ES_STORAGE")
@IdClass(ApmAppJavaPolicyMappingPK.class)
public class ApmAppJavaPolicyMapping {
    private Integer javaPolicyId;
    private Integer appId;
    private ApmAppJavaPolicy apmAppJavaPolicyByJavaPolicyId;
    private ApmApp apmAppByAppId;

    @Id
    @Column(name = "JAVA_POLICY_ID")
    public Integer getJavaPolicyId() {
        return javaPolicyId;
    }

    public void setJavaPolicyId(Integer javaPolicyId) {
        this.javaPolicyId = javaPolicyId;
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

        ApmAppJavaPolicyMapping that = (ApmAppJavaPolicyMapping) o;

        if (javaPolicyId != null ? !javaPolicyId.equals(that.javaPolicyId) : that.javaPolicyId != null) return false;
        if (appId != null ? !appId.equals(that.appId) : that.appId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = javaPolicyId != null ? javaPolicyId.hashCode() : 0;
        result = 31 * result + (appId != null ? appId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "JAVA_POLICY_ID", referencedColumnName = "JAVA_POLICY_ID", nullable = false)
    public ApmAppJavaPolicy getApmAppJavaPolicyByJavaPolicyId() {
        return apmAppJavaPolicyByJavaPolicyId;
    }

    public void setApmAppJavaPolicyByJavaPolicyId(ApmAppJavaPolicy apmAppJavaPolicyByJavaPolicyId) {
        this.apmAppJavaPolicyByJavaPolicyId = apmAppJavaPolicyByJavaPolicyId;
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
