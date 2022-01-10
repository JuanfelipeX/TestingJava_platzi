package com.platzi.javatest.reto2.fizzbuzz;

public class FizzBuzz {

    public String fizzBuzz(int n) {
        String result = "";

        if(n%3 == 0) result += "Fizz";
        if(n%5 == 0) result += "Buzz";

        return result.isEmpty() ? String.valueOf(n) : result;
    }
}
