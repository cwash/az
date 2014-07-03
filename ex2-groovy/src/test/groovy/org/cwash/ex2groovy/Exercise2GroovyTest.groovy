package org.cwash.ex2groovy
import org.junit.Before
import org.junit.Test

import static org.hamcrest.CoreMatchers.equalTo
import static org.junit.Assert.assertThat
/**
 * Tests for the {@link org.cwash.ex2groovy.Exercise2Groovy} class.
 */
class Exercise2GroovyTest
{


    public static final List<LogLine> EXAMPLE_INPUT = Arrays.asList(
            new LogLine("cust1", "Gateway", 1404361817342l),
            new LogLine("cust8", "Gateway", 1404361817352l),
            new LogLine("cust8", "Gateway", 1404361817362l),
            new LogLine("cust5", "Detail", 1404361817372l),
            new LogLine("cust1", "Search", 1404361817382l),
            new LogLine("cust8", "Search", 1404361817392l),
            new LogLine("cust1", "Detail", 1404361817402l),
            new LogLine("cust5", "Search", 1404361817412l),
            new LogLine("cust5", "YourAccount", 1404361817422l),
            new LogLine("cust5", "Detail", 1404361817432l),
            new LogLine("cust8", "Detail", 1404361817442l),
            new LogLine("cust8", "Gateway", 1404361817452l),
            new LogLine("cust2", "Help", 1404361817462l)
    );


    private Exercise2Groovy exercise2Groovy;

    private List<LogLine> testInput;


    @Before
    public void setUp() throws Exception {
        exercise2Groovy = new Exercise2Groovy();

        testInput = EXAMPLE_INPUT;
    }

    @Test
    void testMostPopularThreePageSequence() throws Exception {
        String actual = exercise2Groovy.mostPopularThreePageSequence(testInput).toString();
        assertThat(actual, equalTo("[Gateway, Search, Detail]"));
    }
}
