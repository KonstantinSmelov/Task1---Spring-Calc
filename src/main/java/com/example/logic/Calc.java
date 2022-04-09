package com.example.logic;

import org.springframework.stereotype.Component;

@Component
public class Calc {

    public static String multiply(String first, String second) {

        Double firstD = null;
        Double secondD = null;
        Double answer = null;

        try {
            firstD = Double.parseDouble(first);
            secondD = Double.parseDouble(second);
        } catch (NumberFormatException e) {
            return "invalid data input format";
        }
        answer = firstD * secondD;

        return answer.toString();
    }

    public String divide(String first, String second) {

        Double firstD = null;
        Double secondD = null;
        Double answer = null;

        try {
            firstD = Double.parseDouble(first);
            secondD = Double.parseDouble(second);
            if (secondD == 0) {
                return "don't divide by zero";
            }
        } catch (NumberFormatException e) {
            return "invalid data input format";
        }
        answer = firstD / secondD;

        return answer.toString();
    }

    public String minus(String first, String second) {

        Double firstD = null;
        Double secondD = null;
        Double answer = null;

        try {
            firstD = Double.parseDouble(first);
            secondD = Double.parseDouble(second);
        } catch (NumberFormatException e) {
            return "invalid data input format";
        }
        answer = firstD - secondD;

        return answer.toString();
    }

    public String plus(String first, String second) {

        Double firstD = null;
        Double secondD = null;
        Double answer = null;

        try {
            firstD = Double.parseDouble(first);
            secondD = Double.parseDouble(second);
        } catch (NumberFormatException e) {
            return "invalid data input format";
        }
        answer = firstD + secondD;

        return answer.toString();
    }
}
