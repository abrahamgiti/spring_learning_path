package com.learning.spring;

import com.learning.spring.config.AppConfig;
import com.learning.spring.game.Game;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class LearningpathApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningpathApplication.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Game game = context.getBean("game", Game.class);
		game.playGame();

	}
}
