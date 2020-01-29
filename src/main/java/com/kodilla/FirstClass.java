import java.util.*;
import java.lang.*;
import java.io.*;
class App {
    public static int divisor(int a, int b) {

        while (a != b) {
        if (a > b) {
            a -= b;
            } else {
            b -= a;
            }
        }
        return a;

    }
    public static void main(String[] args) {

        int result = divisor(110, 15);
        System.out.println(result);
    }
}