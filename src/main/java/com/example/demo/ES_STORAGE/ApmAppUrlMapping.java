package com.example.demo.ES_STORAGE;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/19.
 */
@Entity
@Table(name = "APM_APP_URL_MAPPING", schema = "PUBLIC", catalog = "ES_STORAGE")
public class ApmAppUrlMapping {
    private Integer urlMappingId;
    private Integer appId;
    private String httpMethod;
    private String urlPattern;
    private Boolean skipThrottling;
    private Integer policyGrpId;
    private ApmApp apmAppByAppId;
    private ApmPolicyGroup apmPolicyGroupByPolicyGrpId;

    @Id
    @Column(name = "URL_MAPPING_ID")
    public Integer getUrlMappingId() {
        return urlMappingId;
    }

    public void setUrlMappingId(Integer urlMappingId) {
        this.urlMappingId = urlMappingId;
    }

    @Basic
    @Column(name = "APP_ID")
    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    @Basic
    @Column(name = "HTTP_METHOD")
    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    @Basic
    @Column(name = "URL_PATTERN")
    public String getUrlPattern() {
        return urlPattern;
    }

    public void setUrlPattern(String urlPattern) {
        this.urlPattern = urlPattern;
    }

    @Basic
    @Column(name = "SKIP_THROTTLING")
    public Boolean getSkipThrottling() {
        return skipThrottling;
    }

    public void setSkipThrottling(Boolean skipThrottling) {
        this.skipThrottling = skipThrottling;
    }

    @Basic
    @Column(name = "POLICY_GRP_ID")
    public Integer getPolicyGrpId() {
        return policyGrpId;
    }

    public void setPolicyGrpId(Integer policyGrpId) {
        this.policyGrpId = policyGrpId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmAppUrlMapping that = (ApmAppUrlMapping) o;

        if (urlMappingId != null ? !urlMappingId.equals(that.urlMappingId) : that.urlMappingId != null) return false;
        if (appId != null ? !appId.equals(that.appId) : that.appId != null) return false;
        if (httpMethod != null ? !httpMethod.equals(that.httpMethod) : that.httpMethod != null) return false;
        if (urlPattern != null ? !urlPattern.equals(that.urlPattern) : that.urlPattern != null) return false;
        if (skipThrottling != null ? !skipThrottling.equals(that.skipThrottling) : that.skipThrottling != null)
            return false;
        if (policyGrpId != null ? !policyGrpId.equals(that.policyGrpId) : that.policyGrpId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = urlMappingId != null ? urlMappingId.hashCode() : 0;
        result = 31 * result + (appId != null ? appId.hashCode() : 0);
        result = 31 * result + (httpMethod != null ? httpMethod.hashCode() : 0);
        result = 31 * result + (urlPattern != null ? urlPattern.hashCode() : 0);
        result = 31 * result + (skipThrottling != null ? skipThrottling.hashCode() : 0);
        result = 31 * result + (policyGrpId != null ? policyGrpId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "APP_ID", referencedColumnName = "APP_ID", nullable = false)
    public ApmApp getApmAppByAppId() {
        return apmAppByAppId;
    }

    public void setApmAppByAppId(ApmApp apmAppByAppId) {
        this.apmAppByAppId = apmAppByAppId;
    }

    @ManyToOne
    @JoinColumn(name = "POLICY_GRP_ID", referencedColumnName = "POLICY_GRP_ID")
    public ApmPolicyGroup getApmPolicyGroupByPolicyGrpId() {
        return apmPolicyGroupByPolicyGrpId;
    }

    public void setApmPolicyGroupByPolicyGrpId(ApmPolicyGroup apmPolicyGroupByPolicyGrpId) {
        this.apmPolicyGroupByPolicyGrpId = apmPolicyGroupByPolicyGrpId;
    }
}
