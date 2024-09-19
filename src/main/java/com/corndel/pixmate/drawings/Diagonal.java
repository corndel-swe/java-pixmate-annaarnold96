package com.corndel.pixmate.drawings;

public class Diagonal {
    public static void main(String[] args) {
        StringBuilder diagonal = new StringBuilder();

        int maxHeight = 10;
        var symbol = "*";

        for (int i = 0; i <= maxHeight; i++) {

            for (int j = 0; j < i; j++) {
                diagonal.append(" ");
            }
            diagonal.append(symbol);
            diagonal.append("\n");
            }
        System.out.println(diagonal);
        }
        }
