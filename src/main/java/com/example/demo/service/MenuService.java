package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MMenu;
import com.example.demo.mapper.manual.MMenuMapperManual;

@Service
public class MenuService {

	@Autowired
	MMenuMapperManual mMenuMapperManual;

	/**
	 * 指定した品数と種類でメニューを取得
	 * @param menuTypeID
	 * @param menuNum
	 * @return
	 */
	public List<MMenu> getMenuList(int menuNum, String menuName) {

		// メニュー種類の数値型で取得
		int  menuTypeID = getMenuTypeID(menuName);
		// メニュー種類と品数で取得
		return mMenuMapperManual.selectByExampleLimit(menuNum, menuTypeID);
	}

	// メニュー種類IDのEnum
	public enum menuType {

		YAKITORI(1),
		IPPIN(2),
		SPEAD(3),
		GOHAN(4),
		DESSERT(5),
		DRINK(6);

		private int menuTypeID;

		private menuType(int id) {
			this.menuTypeID = id;
		}

		public int getMenuTypeID() {
			return	this.menuTypeID;
		}
	}

	/**
	 * メニュー種類を数値型で取得
	 * @param menuName
	 * @return
	 */
	private int getMenuTypeID(String menuName) {

		menuType checkmenuName = menuType.valueOf(menuName.toUpperCase());
		int MenuTypeID = 0 ;

		switch (checkmenuName) {
		case YAKITORI:
			MenuTypeID = menuType.YAKITORI.getMenuTypeID();
			break;
		case IPPIN:
			MenuTypeID = menuType.IPPIN.getMenuTypeID();
			break;
		case SPEAD:
			MenuTypeID = menuType.SPEAD.getMenuTypeID();
			break;
		case GOHAN:
			MenuTypeID = menuType.GOHAN.getMenuTypeID();
			break;
		case DESSERT:
			MenuTypeID = menuType.DESSERT.getMenuTypeID();
			break;
		case DRINK:
			MenuTypeID = menuType.DRINK.getMenuTypeID();
			break;
		}
		return MenuTypeID;
	}
}

