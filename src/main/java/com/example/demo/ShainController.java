package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//コントローラーの宣言
@Controller
public class ShainController {
	
//	バリデーション用に作成したbeanを初期化して使えるようにする *requestmappingの前に記述する必要がある
	@ModelAttribute
	public ShainFrom setUpForm() {
		return new ShainFrom();
	}
	
//	URLパターンの設定
	@RequestMapping("/input")
	public String index() {
		return "index.html";
	}
	
	
//	thアクションの指定で一致する箇所はMappingで指定した記述
	@RequestMapping("/output")
	
//	バリデーション用　入力チェック後の挙動記述
	public String result(@Validated ShainFrom shainFrom,
			BindingResult bindeingResult, Model model) {
		if(bindeingResult.hasErrors()) {
			return "index.html";
		}
	
	String number = shainFrom.getNumber();
//	@RequestParamで送信するデータのデータ型を指定している
		String name = "コントローラー";
		model.addAttribute("number", number);
		model.addAttribute("name", name);
		return "output.html";
	}

}
