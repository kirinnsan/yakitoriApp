package com.example.demo.mapper.manual;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.MMenu;
@Mapper
public interface MMenuMapperManual{

    /**
     * 指定した品数と種類で、
     * メニューのリストを取得する。
     * @param menuNum 品数
     * @param menuTypeID メニュー種類
     * @return
     */
	List<MMenu> selectByExampleLimit(@Param("menuNum") int menuNum, @Param("menuTypeID") int menuTypeID);

}