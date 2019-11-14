package com.ball.of.mud;

public class Main {

    public static void main(String[] args) {
        String name = "Hello, I'm ball of Mud";
        Mud mud = new Mud(name) {
            @Override
            protected void execute() {
                printSomething(name);
            }

            private void printSomething(String s)
            {
                System.out.println(s);
            }
        };

        mud.run();
    }
}
