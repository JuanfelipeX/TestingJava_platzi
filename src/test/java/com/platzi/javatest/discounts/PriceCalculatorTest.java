package com.platzi.javatest.discounts;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class PriceCalculatorTest {

    @Test
    public void total_zero_when_there_are_prices(){

        PriceCalculator calculator = new PriceCalculator();
        assertThat(calculator.getTotal(), is(0.0));
    }

    @Test
    public void total_is_the_sum_of_prices(){
        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(10.0);
        calculator.addPrice(12.0);
        assertThat(calculator.getTotal(), is(22.0));
    }

    @Test
    public void apply_discount_to_prices(){
        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(5.0);
        calculator.addPrice(12.0);

        calculator.setDiscount(25);
        assertThat(calculator.getTotal(), is(12.75));
    }



}