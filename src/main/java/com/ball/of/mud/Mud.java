package com.ball.of.mud;

public abstract class Mud extends IMud {
    private final String name;

    public Mud(String name) {
        this.name=name;
    }

    void run(){
        execute();
    }

    protected abstract void execute();
}
