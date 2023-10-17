package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.bean.BonjourBean;
import com.example.demo.bean.HelloBean;
import com.example.demo.bean.IHello;

@SpringBootApplication
public class Essai2023Application  implements CommandLineRunner{
	@Autowired
	IHello eng;

    
	public static void main(String[] args) {
		SpringApplication.run(Essai2023Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(eng.getMessage("GI3"));
		//System.out.println(fr.getMessage("GI3"));
	}
	
	

}
