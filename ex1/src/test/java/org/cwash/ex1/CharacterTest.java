package org.cwash.ex1;

import org.junit.Test;

import static org.cwash.ex1.Exercise1.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CharacterTest {

    @Test
    public void testDivCharacterIncreasing() throws Exception {
        assertThat(div('A', 'B'), is(0));
    }

    @Test
    public void testDivCharacterDecreasing() throws Exception {
        assertThat(div('B', 'A'), is(1));
    }

}
