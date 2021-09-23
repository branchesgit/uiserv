package com.hqjll.uiserv.bean.vo;

public class ComponentVO {
    private Integer componentId;

    private String componentKey;

    private String componentName;

    private int version;

    private int type;

    public Integer getComponentId() {
        return componentId;
    }

    public ComponentVO setComponentId(Integer componentId) {
        this.componentId = componentId;
        return this;
    }

    public String getComponentKey() {
        return componentKey;
    }

    public ComponentVO setComponentKey(String componentKey) {
        this.componentKey = componentKey;
        return this;
    }

    public String getComponentName() {
        return componentName;
    }

    public ComponentVO setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }

    public int getVersion() {
        return version;
    }

    public ComponentVO setVersion(int version) {
        this.version = version;
        return this;
    }

    public int getType() {
        return type;
    }

    public ComponentVO setType(int type) {
        this.type = type;
        return this;
    }
}
