package com.springboot.springfw;

@Component
@Primary // this means that if u have more matching component then use spercontra games
public class SuperContraGame {
    public void up(){
        System.out.println(" supercontra up");

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
