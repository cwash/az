package org.cwash.ex1;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.cwash.ex1.Exercise1.*;

public class DivideByZeroTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testDiv() throws Exception {

        exception.expect(ArithmeticException.class);
        exception.expectMessage("/ by zero");

        div(1, 0);


    }
}