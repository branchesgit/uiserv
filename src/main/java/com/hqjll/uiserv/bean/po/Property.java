package com.hqjll.uiserv.bean.po;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="t_property")
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="property_id")
    private Integer propertyId;

    @Column(name="name")
    private String name;

    @Column(name="version")
    private Integer version;

    @Column(name="component_key")
    private Integer componentKey;

    @Column(name="creator_id")
    private String creatorId;

    @Column(name="creator_name")
    private Long creatorName;

    @Column(name="create_time")
    private Date createDate;

    @Column(name="modify_time")
    private Date modifyDate;

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getComponentKey() {
        return componentKey;
    }

    public void setComponentKey(Integer componentKey) {
        this.componentKey = componentKey;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public Long getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(Long creatorName) {
        this.creatorName = creatorName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}
