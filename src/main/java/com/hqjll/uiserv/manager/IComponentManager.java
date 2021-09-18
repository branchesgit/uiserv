package com.hqjll.uiserv.manager;

import com.hqjll.uiserv.bean.po.UIComponent;

import java.util.List;

public interface IComponentManager {
    List<UIComponent> findAll();

    void saveComponent(UIComponent component);

    void deleteComponent(int componentId);
    
}
