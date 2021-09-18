package com.hqjll.uiserv.bean.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="t_component")
public class UIComponent {

    @Id
    @Column(name="component_id")
    private Integer componentId;

    @Column(name="name")
    private String name;

    @Column(name="version")
    private int version;

    @Column(name="component_key")
    private String componentKey;

    @Column(name="creatorId")
    private Long creatorId;

    @Column(name="creatorName")
    private String creatorName;

    @Column(name="createTime")
    private Date createDate;

    @Column(name="modifyTime")
    private Date modifyDate;

    public Integer getComponentId() {
        return componentId;
    }

    public void setComponentId(Integer componentId) {
        this.componentId = componentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getComponentKey() {
        return componentKey;
    }

    public void setComponentKey(String componentKey) {
        this.componentKey = componentKey;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
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
