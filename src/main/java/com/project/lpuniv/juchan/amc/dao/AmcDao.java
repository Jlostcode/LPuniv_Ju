package com.project.lpuniv.juchan.amc.dao;

import com.project.lpuniv.juchan.amc.dto.AmcDto;
import com.project.lpuniv.juchan.ccim.dto.CcimDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AmcDao {

    void amcInsert(AmcDto amcDto);   //하나의 과제 등록

}
