package com.hqjll.uiserv.controller;

import com.hqjll.uiserv.bean.vo.input.ComponentVO;
import com.hqjll.uiserv.consts.UIConstants;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UIConstants.UI_COMPONENT_CONTEXT)
public class ComponentController {

    @PostMapping("/save/component")
    public void saveComponent(@RequestBody ComponentVO componentVO) {

    }

    @PostMapping("/delete/component")
    public void deleteComponent(@RequestBody ComponentVO componentVO){

    }

    @PostMapping("/update/component")
    public void updateComponent(@RequestBody ComponentVO componentVO) {

    }

    @RequestMapping("/get/component")
    public void getComponents() {

    }
}
