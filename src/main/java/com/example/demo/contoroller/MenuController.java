package com.example.demo.contoroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.mapper.MMenuMapper;

@Controller
@RequestMapping(value = "/")
public class MenuController {

	@Autowired
	MMenuMapper mMenuMapper;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String getMenuTitle() {

		return "title";
	}

}