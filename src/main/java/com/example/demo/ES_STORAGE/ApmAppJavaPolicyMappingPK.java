package com.example.demo.ES_STORAGE;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/19.
 */
public class ApmAppJavaPolicyMappingPK implements Serializable {
    private Integer javaPolicyId;
    private Integer appId;

    @Column(name = "JAVA_POLICY_ID")
    @Id
    public Integer getJavaPolicyId() {
        return javaPolicyId;
    }

    public void setJavaPolicyId(Integer javaPolicyId) {
        this.javaPolicyId = javaPolicyId;
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

        ApmAppJavaPolicyMappingPK that = (ApmAppJavaPolicyMappingPK) o;

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
}
