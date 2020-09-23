package com.guseyn.rewrite;

public class UsefulClass {
    public static String usefulMethod(String a, String b, int c, boolean d) {
        return a.concat(b).concat(Integer.toString(c).concat(Boolean.toString(d)));
    }

    public static String anotherUsefulMethod(char a, double b, int c, boolean d) {
        return Character.toString(a).concat(Double.toString(b)).concat(Integer.toString(c)).concat(Boolean.toString(d));
    }
}
