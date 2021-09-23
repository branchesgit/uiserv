package com.hqjll.uiserv.manager.impl;

import com.hqjll.uiserv.bean.po.UIComponent;
import com.hqjll.uiserv.dao.IComponentDAO;
import com.hqjll.uiserv.exception.DefinitionException;
import com.hqjll.uiserv.exception.ErrorEnum;
import com.hqjll.uiserv.manager.IComponentManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ComponentManagerImpl implements IComponentManager {

    @Autowired
    private IComponentDAO componentDAO;

    @Override
    public List<UIComponent> findAll() {
        return componentDAO.findAll();
    }

    @Override
    public void saveComponent(UIComponent component) {
        try {
            componentDAO.save(component);
        }catch (DataAccessException ex) {
            throw new DefinitionException(ErrorEnum.JPA_ERROR.getErrorCode(), ErrorEnum.JPA_ERROR.getErrorMsg());
        }
    }

    @Override
    public void deleteComponent(int componentId) {
        UIComponent ui = componentDAO.findById(componentId).orElse(null);
        if (ui != null) {
            componentDAO.delete(ui);
        }
    }
}
