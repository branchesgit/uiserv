package com.hqjll.uiserv.dao;

import com.hqjll.uiserv.bean.po.UIComponent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IComponentDAO extends JpaRepository<UIComponent,Integer> {

}
