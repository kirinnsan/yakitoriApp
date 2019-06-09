package com.example.demo.contoroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.MMenu;
import com.example.demo.service.MenuService;

@Controller
@RequestMapping(value = "/menu")
public class MenuResultContoroller {

	@Autowired
	private MenuService menuService;

	/**
	 *
	 * @param param
	 * @param menu
	 * @return
	 */
	@RequestMapping(value = "")
	public String resultMenu(@RequestParam("param") String param,
			@RequestParam("menu") String menu) {

		List<MMenu> mMenuList = new ArrayList<MMenu>();

		System.out.println("param" + param);
		System.out.println("menu" + menu);

		mMenuList = menuService.getMenuList(Integer.parseInt(param), menu);

		for(MMenu mmenu:mMenuList) {
			System.out.println(mmenu.getMenuId());
			System.out.println(mmenu.getMenuName());
		}
		return "sample2";
	}
}