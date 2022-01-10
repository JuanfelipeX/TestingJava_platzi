package com.platzi.javatest.reto2.romannumbers;

public class RomanNumerals  {

    public static String arabicToRoman(int n) {
        String result = "";

        for (int i = 0; i < n; i++) {
            result += "I";

            result = result.replaceAll("IIII", "IV");
            result = result.replaceAll("IVI", "V");

            result = result.replaceAll("VIV", "IX");
            result = result.replaceAll("IXI", "X");

            result = result.replaceAll("XXXX", "XL");
            result = result.replaceAll("XLX", "L");

            result = result.replaceAll("LXL", "XC");
            result = result.replaceAll("XCX", "C");

            result = result.replaceAll("CCCC", "CD");
            result = result.replaceAll("CDC", "D");

            result = result.replaceAll("DCD", "CM");
            result = result.replaceAll("CMC", "M");
        }
        return result;
    }
}
