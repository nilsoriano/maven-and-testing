package org.example;

public class MathLibrary {

    public int subtract(int[] arrInts) {
        var result = 0;
        for (int i: arrInts) {
            result -= i;
        }
        return result;
    }
}
