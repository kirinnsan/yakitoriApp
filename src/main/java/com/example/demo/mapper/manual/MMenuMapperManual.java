package com.example.demo.mapper.manual;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.MMenu;
@Mapper
public interface MMenuMapperManual{

	/**
	 * 指定した品数と種類でメニューを取得
	 * @param example
	 * @param menuTypeId
	 * @return
	 */
	List<MMenu> selectByExampleLimit(@Param("menuNum") int menuNum, @Param("menuTypeID") int menuTypeID);

}