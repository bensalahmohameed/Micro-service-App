package com.example.demo.bean;

import org.springframework.stereotype.Component;

@Component("fr")
public class BonjourBean implements IHello {

	@Override
	public String getMessage(String msg) {
		// TODO Auto-generated method stub
		return "Bonjour" + msg;
	}

}
