package org.cwash.ex1;

import org.junit.Test;

import static org.cwash.ex1.Exercise1.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FractionTest {

    @Test
    public void testDivHalf() throws Exception {
        assertThat(div(1, 2), is(0));
    }

    @Test
    public void testDivQuarter() throws Exception {
        assertThat(div(1, 4), is(0));
    }

    @Test
    public void testDivAlmostOne() throws Exception {
        assertThat(div(65, 66), is(0));
    }

}