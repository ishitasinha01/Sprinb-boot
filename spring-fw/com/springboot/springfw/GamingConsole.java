package com.springboot.springfw;

public interface GamingConsole { // representing the gaming console

    // interface for loose coupling
    void up();
    void down();
    void left();
    void right();
    // this allows us to use any game in class game runner class simply stating gaming console instead of any game name
}
