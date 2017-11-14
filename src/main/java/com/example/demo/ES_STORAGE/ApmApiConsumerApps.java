package com.example.demo.ES_STORAGE;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/19.
 */
@Entity
@Table(name = "APM_API_CONSUMER_APPS", schema = "PUBLIC", catalog = "ES_STORAGE")
@IdClass(ApmApiConsumerAppsPK.class)
public class ApmApiConsumerApps {
    private Integer id;
    private String saml2SsoIssuer;
    private String appConsumerKey;
    private String apiTokenEndpoint;
    private String apiConsumerKey;
    private String apiConsumerSecret;
    private String appName;

    @Id
    @Column(name = "ID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "SAML2_SSO_ISSUER")
    public String getSaml2SsoIssuer() {
        return saml2SsoIssuer;
    }

    public void setSaml2SsoIssuer(String saml2SsoIssuer) {
        this.saml2SsoIssuer = saml2SsoIssuer;
    }

    @Id
    @Column(name = "APP_CONSUMER_KEY")
    public String getAppConsumerKey() {
        return appConsumerKey;
    }

    public void setAppConsumerKey(String appConsumerKey) {
        this.appConsumerKey = appConsumerKey;
    }

    @Basic
    @Column(name = "API_TOKEN_ENDPOINT")
    public String getApiTokenEndpoint() {
        return apiTokenEndpoint;
    }

    public void setApiTokenEndpoint(String apiTokenEndpoint) {
        this.apiTokenEndpoint = apiTokenEndpoint;
    }

    @Basic
    @Column(name = "API_CONSUMER_KEY")
    public String getApiConsumerKey() {
        return apiConsumerKey;
    }

    public void setApiConsumerKey(String apiConsumerKey) {
        this.apiConsumerKey = apiConsumerKey;
    }

    @Basic
    @Column(name = "API_CONSUMER_SECRET")
    public String getApiConsumerSecret() {
        return apiConsumerSecret;
    }

    public void setApiConsumerSecret(String apiConsumerSecret) {
        this.apiConsumerSecret = apiConsumerSecret;
    }

    @Basic
    @Column(name = "APP_NAME")
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmApiConsumerApps that = (ApmApiConsumerApps) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (saml2SsoIssuer != null ? !saml2SsoIssuer.equals(that.saml2SsoIssuer) : that.saml2SsoIssuer != null)
            return false;
        if (appConsumerKey != null ? !appConsumerKey.equals(that.appConsumerKey) : that.appConsumerKey != null)
            return false;
        if (apiTokenEndpoint != null ? !apiTokenEndpoint.equals(that.apiTokenEndpoint) : that.apiTokenEndpoint != null)
            return false;
        if (apiConsumerKey != null ? !apiConsumerKey.equals(that.apiConsumerKey) : that.apiConsumerKey != null)
            return false;
        if (apiConsumerSecret != null ? !apiConsumerSecret.equals(that.apiConsumerSecret) : that.apiConsumerSecret != null)
            return false;
        if (appName != null ? !appName.equals(that.appName) : that.appName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (saml2SsoIssuer != null ? saml2SsoIssuer.hashCode() : 0);
        result = 31 * result + (appConsumerKey != null ? appConsumerKey.hashCode() : 0);
        result = 31 * result + (apiTokenEndpoint != null ? apiTokenEndpoint.hashCode() : 0);
        result = 31 * result + (apiConsumerKey != null ? apiConsumerKey.hashCode() : 0);
        result = 31 * result + (apiConsumerSecret != null ? apiConsumerSecret.hashCode() : 0);
        result = 31 * result + (appName != null ? appName.hashCode() : 0);
        return result;
    }
}
