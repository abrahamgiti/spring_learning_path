package com.learning.spring;

import com.learning.spring.config.AppConfig;
import com.learning.spring.game.Game;
import com.learning.spring.game.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.NumberFormat;

@SpringBootApplication
public class LearningpathApplication {



	public static void main(String[] args) {
		SpringApplication.run(LearningpathApplication.class, args);

		//ApplicationContext context =
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);



		Game game = context.getBean("game", Game.class);
		game.playGame();

		Game game2 = context.getBean("game", Game.class);

		Team royals =  context.getBean("royals",Team.class);

		game2.setAwayTeam(royals);
		game2.playGame();

		game.setAwayTeam(royals);
		game.playGame();

		NumberFormat nf = context.getBean(NumberFormat.class);
		System.out.println(nf.format(12345678.90123456));

		System.exit(9);

	}
}
