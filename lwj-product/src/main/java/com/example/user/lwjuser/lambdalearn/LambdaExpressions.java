package com.example.user.lwjuser.lambdalearn;

interface Description {
    String brief();
}

interface Body {
    String detailed(String head);
}

interface Multi {
    String twoArg(String head, Double d);
}

public class LambdaExpressions {
    // [1]
    static Body bod = h -> h + " No Parens!";
    // [2]
    static Body bod2 = (h) -> h + " More details";
    // [3]
    static Description desc = () -> "Short info";
    // [4]
    static Multi mult = (h, n) -> h + n;
    // [5]
    static Description moreLines = () -> {
        System.out.println("moreLines()");
        return "from moreLines()";
    };

    public static void main(String[] args) {
        System.out.println(bod.detailed("Oh!"));
        System.out.println(bod2.detailed("Hi!"));
        System.out.println(desc.brief());
        System.out.println(mult.twoArg("Pi! ", 3.14159));
        System.out.println(moreLines.brief());
    }
}
