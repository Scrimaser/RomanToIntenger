package org.romen;

public class Transformation {
    public int toInt(String romeNumber) {
        int number = 0;
        char previous;
        char current;
        char next;
        int indexNext = 1;
        int indexPrev = 0;
        for (int i = 0; i < romeNumber.length(); i++){
            if (i == romeNumber.length() - 1){
                indexNext = 0;
            }
            if (i > 0){
                indexPrev = 1;
            }
            current = romeNumber.charAt(i);
            next = romeNumber.charAt(i + indexNext);
            previous = romeNumber.charAt(i - indexPrev);
            if (converter(current) < converter(next)){
                number += 0;
            } else if (converter(previous) < converter(current)){
                number += (converter(current) - converter(previous));
            } else {
                number += converter(current);
            }
        }
        return number;
    }

    private int converter(char c) {
        String s = String.valueOf(c).toUpperCase();
        switch (s){
            case "I" -> {
                return 1;
            }
            case "V" -> {
                return 5;
            }
            case "X" -> {
                return 10;
            }
            case "L" -> {
                return 50;
            }
            case "C" -> {
                return 100;
            }
            case "D" -> {
                return 500;
            }
            case "M" -> {
                return 1000;
            }
            default -> {
                return 0;
            }
        }
    }
}
