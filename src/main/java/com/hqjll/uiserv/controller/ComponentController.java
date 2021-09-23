package com.hqjll.uiserv.controller;

import com.hqjll.uiserv.bean.vo.ComponentVO;
import com.hqjll.uiserv.common.ResultContent;
import com.hqjll.uiserv.consts.UIConstants;
import com.hqjll.uiserv.service.IComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(UIConstants.UI_COMPONENT_CONTEXT)
public class ComponentController {

    @Autowired
    private IComponentService componentService;

    @PostMapping("/save/one")
    public ResultContent<Boolean> saveComponent(@RequestBody ComponentVO componentVO) {
        componentService.saveComponent(componentVO);
        return ResultContent.createSuccess(true);
    }

    @PostMapping("/delete/one")
    public void deleteComponent(@RequestBody ComponentVO componentVO){

    }

    @PostMapping("/update/one")
    public void updateComponent(@RequestBody ComponentVO componentVO) {

    }

    @RequestMapping("/get/list")
    public ResultContent<List<ComponentVO>> getComponents() {
        List<ComponentVO> components = componentService.getComponents();
        return ResultContent.createSuccess(components);
    }
}
