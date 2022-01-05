package com.platzi.javatest.util;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
        public void repeat_string_once() {
            Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeat_string_multiple_times() {
        Assert.assertEquals("holahola", StringUtil.repeat("hola", 3));
    }

    @Test
    public void repeat_string_zero_times() {
        Assert.assertEquals("", StringUtil.repeat("hola", 0));
    }

    @Test (expected = IllegalAccessException.class)
    public void repeat_string_negative_times() {
        Assert.assertEquals("", StringUtil.repeat("hola", -3));
    }


}
