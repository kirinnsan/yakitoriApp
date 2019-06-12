package com.example.demo.contoroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
     * 対象のメニューを品数の件数分ランダムに取得し、
     * 結果画面に返却する。
     * @param param 選択された品数
     * @param menu 押下されたメニュー
     * @param model モデル
     * @return
     */
	@RequestMapping(value = "")
	public String resultMenu(@RequestParam("param") String param,
			@RequestParam("menu") String menu, Model model) {

		List<MMenu> mMenuList = new ArrayList<MMenu>();

		mMenuList = menuService.getMenuList(Integer.parseInt(param), menu);

		model.addAttribute("mMenuList", mMenuList);

		return "result";
	}
}
