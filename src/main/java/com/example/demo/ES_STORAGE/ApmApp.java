package com.example.demo.ES_STORAGE;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by admin on 2017/8/19.
 */
@Entity
@Table(name = "APM_APP", schema = "PUBLIC", catalog = "ES_STORAGE")
public class ApmApp {
    private Integer appId;
    private String appProvider;
    private Integer tenantId;
    private String appName;
    private String appVersion;
    private String context;
    private String trackingCode;
    private String visibleRoles;
    private String uuid;
    private String saml2SsoIssuer;
    private String logOutUrl;
    private Boolean appAllowAnonymous;
    private String appEndpoint;
    private Boolean treatAsSite;
    private ApmApiConsumerApps apmApiConsumerAppsBySaml2SsoIssuer;
    private Collection<ApmAppJavaPolicyMapping> apmAppJavaPolicyMappingsByAppId;
    private Collection<ApmAppLcEvent> apmAppLcEventsByAppId;
    private Collection<ApmAppUrlMapping> apmAppUrlMappingsByAppId;
    private Collection<ApmExternalStores> apmExternalStoresByAppId;
    private Collection<ApmFavouriteApps> apmFavouriteAppsByAppId;
    private Collection<ApmPolicyGroupMapping> apmPolicyGroupMappingsByAppId;
    private Collection<ApmSubscription> apmSubscriptionsByAppId;

    @Id
    @Column(name = "APP_ID")
    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    @Basic
    @Column(name = "APP_PROVIDER")
    public String getAppProvider() {
        return appProvider;
    }

    public void setAppProvider(String appProvider) {
        this.appProvider = appProvider;
    }

    @Basic
    @Column(name = "TENANT_ID")
    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    @Basic
    @Column(name = "APP_NAME")
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Basic
    @Column(name = "APP_VERSION")
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    @Basic
    @Column(name = "CONTEXT")
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Basic
    @Column(name = "TRACKING_CODE")
    public String getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }

    @Basic
    @Column(name = "VISIBLE_ROLES")
    public String getVisibleRoles() {
        return visibleRoles;
    }

    public void setVisibleRoles(String visibleRoles) {
        this.visibleRoles = visibleRoles;
    }

    @Basic
    @Column(name = "UUID")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "SAML2_SSO_ISSUER")
    public String getSaml2SsoIssuer() {
        return saml2SsoIssuer;
    }

    public void setSaml2SsoIssuer(String saml2SsoIssuer) {
        this.saml2SsoIssuer = saml2SsoIssuer;
    }

    @Basic
    @Column(name = "LOG_OUT_URL")
    public String getLogOutUrl() {
        return logOutUrl;
    }

    public void setLogOutUrl(String logOutUrl) {
        this.logOutUrl = logOutUrl;
    }

    @Basic
    @Column(name = "APP_ALLOW_ANONYMOUS")
    public Boolean getAppAllowAnonymous() {
        return appAllowAnonymous;
    }

    public void setAppAllowAnonymous(Boolean appAllowAnonymous) {
        this.appAllowAnonymous = appAllowAnonymous;
    }

    @Basic
    @Column(name = "APP_ENDPOINT")
    public String getAppEndpoint() {
        return appEndpoint;
    }

    public void setAppEndpoint(String appEndpoint) {
        this.appEndpoint = appEndpoint;
    }

    @Basic
    @Column(name = "TREAT_AS_SITE")
    public Boolean getTreatAsSite() {
        return treatAsSite;
    }

    public void setTreatAsSite(Boolean treatAsSite) {
        this.treatAsSite = treatAsSite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmApp apmApp = (ApmApp) o;

        if (appId != null ? !appId.equals(apmApp.appId) : apmApp.appId != null) return false;
        if (appProvider != null ? !appProvider.equals(apmApp.appProvider) : apmApp.appProvider != null) return false;
        if (tenantId != null ? !tenantId.equals(apmApp.tenantId) : apmApp.tenantId != null) return false;
        if (appName != null ? !appName.equals(apmApp.appName) : apmApp.appName != null) return false;
        if (appVersion != null ? !appVersion.equals(apmApp.appVersion) : apmApp.appVersion != null) return false;
        if (context != null ? !context.equals(apmApp.context) : apmApp.context != null) return false;
        if (trackingCode != null ? !trackingCode.equals(apmApp.trackingCode) : apmApp.trackingCode != null)
            return false;
        if (visibleRoles != null ? !visibleRoles.equals(apmApp.visibleRoles) : apmApp.visibleRoles != null)
            return false;
        if (uuid != null ? !uuid.equals(apmApp.uuid) : apmApp.uuid != null) return false;
        if (saml2SsoIssuer != null ? !saml2SsoIssuer.equals(apmApp.saml2SsoIssuer) : apmApp.saml2SsoIssuer != null)
            return false;
        if (logOutUrl != null ? !logOutUrl.equals(apmApp.logOutUrl) : apmApp.logOutUrl != null) return false;
        if (appAllowAnonymous != null ? !appAllowAnonymous.equals(apmApp.appAllowAnonymous) : apmApp.appAllowAnonymous != null)
            return false;
        if (appEndpoint != null ? !appEndpoint.equals(apmApp.appEndpoint) : apmApp.appEndpoint != null) return false;
        if (treatAsSite != null ? !treatAsSite.equals(apmApp.treatAsSite) : apmApp.treatAsSite != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = appId != null ? appId.hashCode() : 0;
        result = 31 * result + (appProvider != null ? appProvider.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + (appName != null ? appName.hashCode() : 0);
        result = 31 * result + (appVersion != null ? appVersion.hashCode() : 0);
        result = 31 * result + (context != null ? context.hashCode() : 0);
        result = 31 * result + (trackingCode != null ? trackingCode.hashCode() : 0);
        result = 31 * result + (visibleRoles != null ? visibleRoles.hashCode() : 0);
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        result = 31 * result + (saml2SsoIssuer != null ? saml2SsoIssuer.hashCode() : 0);
        result = 31 * result + (logOutUrl != null ? logOutUrl.hashCode() : 0);
        result = 31 * result + (appAllowAnonymous != null ? appAllowAnonymous.hashCode() : 0);
        result = 31 * result + (appEndpoint != null ? appEndpoint.hashCode() : 0);
        result = 31 * result + (treatAsSite != null ? treatAsSite.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "SAML2_SSO_ISSUER", referencedColumnName = "SAML2_SSO_ISSUER")
    public ApmApiConsumerApps getApmApiConsumerAppsBySaml2SsoIssuer() {
        return apmApiConsumerAppsBySaml2SsoIssuer;
    }

    public void setApmApiConsumerAppsBySaml2SsoIssuer(ApmApiConsumerApps apmApiConsumerAppsBySaml2SsoIssuer) {
        this.apmApiConsumerAppsBySaml2SsoIssuer = apmApiConsumerAppsBySaml2SsoIssuer;
    }

    @OneToMany(mappedBy = "apmAppByAppId")
    public Collection<ApmAppJavaPolicyMapping> getApmAppJavaPolicyMappingsByAppId() {
        return apmAppJavaPolicyMappingsByAppId;
    }

    public void setApmAppJavaPolicyMappingsByAppId(Collection<ApmAppJavaPolicyMapping> apmAppJavaPolicyMappingsByAppId) {
        this.apmAppJavaPolicyMappingsByAppId = apmAppJavaPolicyMappingsByAppId;
    }

    @OneToMany(mappedBy = "apmAppByAppId")
    public Collection<ApmAppLcEvent> getApmAppLcEventsByAppId() {
        return apmAppLcEventsByAppId;
    }

    public void setApmAppLcEventsByAppId(Collection<ApmAppLcEvent> apmAppLcEventsByAppId) {
        this.apmAppLcEventsByAppId = apmAppLcEventsByAppId;
    }

    @OneToMany(mappedBy = "apmAppByAppId")
    public Collection<ApmAppUrlMapping> getApmAppUrlMappingsByAppId() {
        return apmAppUrlMappingsByAppId;
    }

    public void setApmAppUrlMappingsByAppId(Collection<ApmAppUrlMapping> apmAppUrlMappingsByAppId) {
        this.apmAppUrlMappingsByAppId = apmAppUrlMappingsByAppId;
    }

    @OneToMany(mappedBy = "apmAppByAppId")
    public Collection<ApmExternalStores> getApmExternalStoresByAppId() {
        return apmExternalStoresByAppId;
    }

    public void setApmExternalStoresByAppId(Collection<ApmExternalStores> apmExternalStoresByAppId) {
        this.apmExternalStoresByAppId = apmExternalStoresByAppId;
    }

    @OneToMany(mappedBy = "apmAppByAppId")
    public Collection<ApmFavouriteApps> getApmFavouriteAppsByAppId() {
        return apmFavouriteAppsByAppId;
    }

    public void setApmFavouriteAppsByAppId(Collection<ApmFavouriteApps> apmFavouriteAppsByAppId) {
        this.apmFavouriteAppsByAppId = apmFavouriteAppsByAppId;
    }

    @OneToMany(mappedBy = "apmAppByAppId")
    public Collection<ApmPolicyGroupMapping> getApmPolicyGroupMappingsByAppId() {
        return apmPolicyGroupMappingsByAppId;
    }

    public void setApmPolicyGroupMappingsByAppId(Collection<ApmPolicyGroupMapping> apmPolicyGroupMappingsByAppId) {
        this.apmPolicyGroupMappingsByAppId = apmPolicyGroupMappingsByAppId;
    }

    @OneToMany(mappedBy = "apmAppByAppId")
    public Collection<ApmSubscription> getApmSubscriptionsByAppId() {
        return apmSubscriptionsByAppId;
    }

    public void setApmSubscriptionsByAppId(Collection<ApmSubscription> apmSubscriptionsByAppId) {
        this.apmSubscriptionsByAppId = apmSubscriptionsByAppId;
    }
}
