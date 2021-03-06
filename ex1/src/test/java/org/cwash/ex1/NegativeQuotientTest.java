package org.cwash.ex1;

import org.junit.Test;

import static org.cwash.ex1.Exercise1.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NegativeQuotientTest {


    @Test
    public void testDiv24_by4_is6() throws Exception {
        assertThat(div(-24, 4), is(-6));
    }

    @Test
    public void testDiv33_by6_is5() throws Exception {
        assertThat(div(33, -6), is(-5));
    }

    @Test
    public void testDiv72_by9_is8() throws Exception {
        assertThat(div(-72, -9), is(8));
    }

    @Test
    public void testDiv99999_by4444_is25() throws Exception {
        assertThat(div(-99999, 4444), is(-22));
    }

    @Test
    public void testDiv1234522_by543255_is2() throws Exception {
        assertThat(div(1234522, -543255), is(-2));
    }
}