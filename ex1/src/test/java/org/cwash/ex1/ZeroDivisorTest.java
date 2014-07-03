package org.cwash.ex1;

import org.junit.Test;

import static org.cwash.ex1.Exercise1.div;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ZeroDivisorTest {

    @Test
    public void testDiv() throws Exception {
        assertThat(div(0, 1), is(0));
    }
}