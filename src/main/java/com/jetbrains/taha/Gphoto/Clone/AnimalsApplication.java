package com.jetbrains.taha.Gphoto.Clone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnimalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalsApplication.class, args);

//		var context = SpringApplication.run(GphotoCloneApplication.class, args);
//		Cat cat = context.getBean(Cat.class);
//		cat.sound();
	}

}