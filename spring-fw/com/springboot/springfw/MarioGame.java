package com.springboot.springfw;

@Component // spring framework manage the component
public class MarioGame { // game mario game is a component we can find it in gamerunner class
    // creating game buttons
    public void up(){
        System.out.println("up");

    }
    public void down() {
        System.out.println("down");
    }
    public void left() {
        System.out.println("left");
    }
    public void right() {
        System.out.println("right");
    }


}
