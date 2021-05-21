package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//コントローラーの宣言
@Controller
public class ShainController {
	
//	URLパターンの設定
	@RequestMapping("/input")
	public String index() {
		return "index.html";
	}
	
//	thアクションの指定で一致する箇所はMappingで指定した記述
	@RequestMapping("/output")
	
//	@RequestParamで送信するデータのデータ型を指定している
	public String result(@RequestParam("number") String number, Model model) {
		String name = "コントローラー";
		model.addAttribute("number", number);
		model.addAttribute("name", name);
		return "output.html";
	}

}
