package com.platzi.javatest.util;


import static com.platzi.javatest.util.PassswordUtil.SecurityLevel.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class PassswordUtilTest {


    @Test
    public void weak_when_has_less_than_8_letters() {
        assertEquals(WEAK, PassswordUtil.assessPassword("1234567"));
    }

    @Test
    public void weak_when_has_only_letters() {
        assertEquals(WEAK, PassswordUtil.assessPassword("abcdefg"));
    }

    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(MEDIUM, PassswordUtil.assessPassword("abcd1234"));
    }

    @Test
    public void medium_when_has_letters_numbers_and_symbols() {
        assertEquals(STRONG, PassswordUtil.assessPassword("abcd1234*!"));
    }

}