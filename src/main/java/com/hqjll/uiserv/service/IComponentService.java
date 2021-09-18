package com.hqjll.uiserv.service;

import com.hqjll.uiserv.bean.vo.input.ComponentVO;

public interface IComponentService {
    public void saveComponent(ComponentVO componentVO);

    public void deleteComponent(ComponentVO componentVO);

    public void updateComponent(ComponentVO componentVO);

    public void getComponents();
}
