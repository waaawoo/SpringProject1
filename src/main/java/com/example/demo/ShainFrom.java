 package com.example.demo;

import javax.validation.constraints.NotEmpty;

public class ShainFrom{
//		空の場合messageを返す
	 	@NotEmpty(message = "社員Noを入れてください")
	 	
//	 	index.htmlでのinputタグで設定したname
	 	private String number;
	 	
//	 	number変数を作成したらGetter、Setterを作成することがお約束
	 	public String getNumber() {
	 		return number;
	 	}
	 	
	 	public void setNumber(String number) {
	 		this.number = number;
	 	}
 }