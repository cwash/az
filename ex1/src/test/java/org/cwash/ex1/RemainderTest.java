package org.cwash.ex1;

import org.junit.Test;

import static org.cwash.ex1.Exercise1.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RemainderTest {

    @Test
    public void testDivBigRemainder() throws Exception {
        assertThat(div(1234, 1233), is(1));
    }

    @Test
    public void testDivLittleRemainder() throws Exception {
        assertThat(div(3, 2), is(1));
    }

    @Test
    public void testDivExtraRemainder() throws Exception {
        assertThat(div(19, 2), is(9));
    }
}