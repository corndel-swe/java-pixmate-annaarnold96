package com.corndel.pixmate.drawings;

public class Checkerboard {
    public static void main(String[] args) {
        StringBuilder checkerboard = new StringBuilder();

        int width = 20;
        int height = 5;
        var symbol = "*";

       for (int i = 0; i < height; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < width; j++) {
                    if (j % 2 == 0){
                        checkerboard.append(symbol);
                    }
                    else {
                        checkerboard.append(" ");
                    }
                }
                checkerboard.append("\n");
            } else {
                for (int j = 0; j < width-1; j++) {
                    if (j % 2 != 0){
                        checkerboard.append(symbol);
                    }
                    else {
                        checkerboard.append(" ");
                    }
                }
                checkerboard.append("\n");
            }

        }
        System.out.println(checkerboard);
    }
}
