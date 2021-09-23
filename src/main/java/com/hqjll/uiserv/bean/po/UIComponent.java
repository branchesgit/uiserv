package com.hqjll.uiserv.bean.po;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="t_component")
public class UIComponent {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="component_id")
    private Integer componentId;

    @Column(name="name")
    private String name;

    @Column(name="version")
    private int version;

    @Column(name="component_key")
    private String componentKey;

    @Column(name="creator_id")
    private Long creatorId;

    @Column(name="creator_name")
    private String creatorName;

    @Column(name="create_time")
    private Date createDate;

    @Column(name="modify_time")
    private Date modifyDate;

    @Column(name="type")
    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

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
