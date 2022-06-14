package com.springboot.springfw;

import org.springframework.stereotype.Component;
@Component
public class GameRunner { // this game runner class will give error with other game as it is tightly coupled to mario game

    @Autowired   // once we gat mario game game we can autowire it
    private GamingConsole game; // to run the other game we have to make changes in gamerunner class
    public GameRunner(GamingConsole game) { // now thightly voupled to supercontra game
        System.out.println("using constructor");
        this.game = game; // we have created game runner inside which we will run mario game
    }

    public void runGame(){ // run the game
        game.up();
        game.down();
        game.left();
        game.right();

    }
    //in a game runner hello world app we have very few classes but real world application are much more complex has many layes and each layer in depended on layer below it
    //multilayer web business data etc
    // with using the springframework instead of focusing on objects their dependencies and wiring you can fous on the business logic and applications
    //spring framework manages the lifecycle of the objects
    // mark components using annotations @component
    //mark dependencies using @autowored
}// when we enable debug mode a lot of log will be printed allowing us to see what is happenning in the back // application.properties in resources
//Spring framework keep changigng the log which is being printed
// DEBUG
// ldentified candidate component class file gamerinner.class
// identified candidate component class file mariogame.class
//creating shared instance of singleton bean gamerunner
//creating sharded instance of singleton bean mariogame
//autowiring by tyoe from bean name gamerunner via constructor to bean named mariogame
