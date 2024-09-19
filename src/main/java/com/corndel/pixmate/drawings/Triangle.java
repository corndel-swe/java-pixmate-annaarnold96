package com.corndel.pixmate.drawings;

public class Triangle {
    public static void main(String[] args) {
        StringBuilder triangle = new StringBuilder();

        int width = 1;
        int maxHeight = 10;
        var symbol = "*";

        for (int i = 0; i < maxHeight; i++) {
            for (int j = 0; j < i; j++) {
                triangle.append(symbol);
            }
            triangle.append("\n");
        }
        System.out.println(triangle);
    }
}
