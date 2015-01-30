package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class EuroTest {

    @Test
    public void shouldTwoTenEurosBeTheSame() {
        assertEquals(new Euro(10), new Euro(10));
    }

    @Test
    public void shouldReturnFalseWhenComparingTenEuroToFive() {
        assertFalse(new Euro(10).equals(new Euro(5)));
    }

    @Test
    public void shouldReturnFalseWhenComparingEurosToNull() {
        assertFalse(new Euro(10).equals(null));
    }

    @Test
    public void shouldReturnFalseIfComparingEuroWithOtherClass() {
        assertFalse(new Euro(10).equals(new Object()));
    }

    @Test
    public void tenEurosShouldEqualSevenEurosPlusThreeEuros() {
        assertEquals(
                new Euro(10),
                new Euro(7).add(new Euro(3)));
    }

    @Test
    public void tenEurosShouldNotEqualToFivePlusTwoEuros(){
        assertFalse(new Euro(10).equals(new Euro(5).add(new Euro(2))));
    }

    @Test
    public void tenEurosShouldNotEqualTenDollars() {
        assertFalse( new Euro(10).equals(new Dollar(10)));
    }

    @Test
    public void hundredEuroShouldEqualTo135Dollars(){
        assertTrue(new Euro(100).equals(new Dollar(135)));
    }
}