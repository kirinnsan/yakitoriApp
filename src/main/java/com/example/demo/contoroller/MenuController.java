package com.example.demo.contoroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class MenuController {

    /**
     * タイトル画面を返却する。
     * @return
     */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String getMenuTitle() {

		return "title";
	}

}