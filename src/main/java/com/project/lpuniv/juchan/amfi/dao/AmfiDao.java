package com.project.lpuniv.juchan.amfi.dao;

import com.project.lpuniv.juchan.ccim.dto.CcimDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AmfiDao {

    void amcInsert(CcimDto ccimDto);   //하나의 과제 등록

}
