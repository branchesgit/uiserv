package com.hqjll.uiserv.service.impl;

import com.hqjll.uiserv.bean.po.UIComponent;
import com.hqjll.uiserv.bean.vo.ComponentVO;
import com.hqjll.uiserv.manager.IComponentManager;
import com.hqjll.uiserv.service.IComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ComponentServiceImpl implements IComponentService {

    @Autowired
    private IComponentManager componentManager;

    public void saveComponent(ComponentVO componentVO) {
        UIComponent ui = new UIComponent();
        ui.setComponentKey(componentVO.getComponentKey());
        ui.setName(componentVO.getComponentName());
        ui.setType(componentVO.getType());
        componentManager.saveComponent(ui);
    }

    public void deleteComponent(ComponentVO componentVO) {

    }

    public void updateComponent(ComponentVO componentVO) {

    }

    public List<ComponentVO> getComponents() {
        List<UIComponent> components = componentManager.findAll();
        return components.stream().map(ui ->
                (new ComponentVO()
                        .setComponentId(ui.getComponentId())
                        .setComponentKey(ui.getComponentKey())
                        .setComponentName(ui.getName())
                        .setVersion(ui.getVersion()))
        ).collect(Collectors.toList());
    }
}
