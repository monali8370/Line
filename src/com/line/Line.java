package com.line;
import static java.lang.Math.sqrt;
public class Line {
    static int x1 = 2;
    static int x2 = 5;
    static int y1 = 3;
    static int y2 = 5;
    public static void main(String[] args) {

        System.out.println("Welcome Line Comparison Program");


        double LengthOfLine = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2);
        System.out.println("Length of line is "+LengthOfLine );
    }
}
