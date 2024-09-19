package com.corndel.pixmate.drawings;

public class InvertedTriangle {
    public static void main(String[] args) {
        StringBuilder invertedTriangle = new StringBuilder();

        int maxHeight = 10;
        var symbol = "*";

        for (int i = maxHeight; i > 1; i--) {
            for (int j = 0; j < (i-1); j++) {
                invertedTriangle.append(symbol);
            }
            invertedTriangle.append("\n");
        }
        System.out.println(invertedTriangle);
    }
}
