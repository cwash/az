import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Exercise2Test {

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

    private Exercise2 exercise2;

    private List<LogLine> testInput;

    @Before
    public void setUp() throws Exception {
        exercise2 = new Exercise2();

        testInput = EXAMPLE_INPUT;
    }

    @Test
    public void testMostPopularThreePageSequence() throws Exception {
        String actual = exercise2.mostPopularThreePageSequence(testInput).toString();
        assertThat(actual, is(equalTo("[Gateway, Search, Detail]")));
    }
}