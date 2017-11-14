package com.example.demo.ES_STORAGE;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/19.
 */
@Entity
@Table(name = "APM_BUSINESS_OWNER_PROPERTY", schema = "PUBLIC", catalog = "ES_STORAGE")
public class ApmBusinessOwnerProperty {
    private Integer ownerPropId;
    private Integer ownerId;
    private String name;
    private String value;
    private Boolean showInStore;
    private ApmBusinessOwner apmBusinessOwnerByOwnerId;

    @Id
    @Column(name = "OWNER_PROP_ID")
    public Integer getOwnerPropId() {
        return ownerPropId;
    }

    public void setOwnerPropId(Integer ownerPropId) {
        this.ownerPropId = ownerPropId;
    }

    @Basic
    @Column(name = "OWNER_ID")
    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "VALUE")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "SHOW_IN_STORE")
    public Boolean getShowInStore() {
        return showInStore;
    }

    public void setShowInStore(Boolean showInStore) {
        this.showInStore = showInStore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmBusinessOwnerProperty that = (ApmBusinessOwnerProperty) o;

        if (ownerPropId != null ? !ownerPropId.equals(that.ownerPropId) : that.ownerPropId != null) return false;
        if (ownerId != null ? !ownerId.equals(that.ownerId) : that.ownerId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        if (showInStore != null ? !showInStore.equals(that.showInStore) : that.showInStore != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ownerPropId != null ? ownerPropId.hashCode() : 0;
        result = 31 * result + (ownerId != null ? ownerId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (showInStore != null ? showInStore.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "OWNER_ID", referencedColumnName = "OWNER_ID", nullable = false)
    public ApmBusinessOwner getApmBusinessOwnerByOwnerId() {
        return apmBusinessOwnerByOwnerId;
    }

    public void setApmBusinessOwnerByOwnerId(ApmBusinessOwner apmBusinessOwnerByOwnerId) {
        this.apmBusinessOwnerByOwnerId = apmBusinessOwnerByOwnerId;
    }
}
