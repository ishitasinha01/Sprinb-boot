package com.springboot.springfw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFwApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(SpringFwApplication.class, args);// use this after auto wiring the game , we are creating a application context we are creating number of components and we need something to manage these components
		//MarioGame  game = new MarioGame();

       //Marion, Gamerunner
		GameRunner runner context.getBean(GameRunner.class);
//        SuperContraGame game = new SuperContraGame();
//		GameRunner runner = new GameRunner(game); // creating a game runner class
// need of these statements after creating a component
		runner.runGame(); // running game


	}
// in pom.exl we copy past maven dependencies grp id and artifact id  ibdetify and write springboot starter - web to create a web app
}
