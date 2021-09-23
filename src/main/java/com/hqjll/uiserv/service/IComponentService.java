package com.hqjll.uiserv.service;

import com.hqjll.uiserv.bean.po.UIComponent;
import com.hqjll.uiserv.bean.vo.ComponentVO;

import java.util.List;

public interface IComponentService {
    public void saveComponent(ComponentVO componentVO);

    public void deleteComponent(ComponentVO componentVO);

    public void updateComponent(ComponentVO componentVO);

    public List<ComponentVO> getComponents();
}
