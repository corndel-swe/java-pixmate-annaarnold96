package com.corndel.pixmate.drawings;

public class TriangleSandwich {
    public static void main(String[] args) {
        StringBuilder triangle = new StringBuilder();

        int maxHeight = 5;
        var symbol = "*";

        for (int i = 0; i <= maxHeight; i++) {
            for (int j = 0; j < i; j++) {
                triangle.append(symbol);

            }
            triangle.append("\n");
        }
        for (int i = maxHeight; i > 1; i--) {
            for (int j = 0; j < (i - 1); j++) {
                triangle.append(symbol);
            }
            triangle.append("\n");

        }
        System.out.println(triangle);
    }
}
