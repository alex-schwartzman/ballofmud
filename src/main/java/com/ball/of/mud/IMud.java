package com.ball.of.mud;


import java.util.function.Function;

public class IMud {
    Function<Object, String> name = (g) -> (g == null) ? null : g.toString();
}
