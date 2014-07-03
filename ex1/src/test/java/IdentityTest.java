import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IdentityTest {

    @Test
    public void testDiv11() throws Exception {
        assertThat(Exercise1.div(1, 1), is(1));
    }

    @Test
    public void testDiv22() throws Exception {
        assertThat(Exercise1.div(2, 2), is(1));
    }

    @Test
    public void testDivMaxMax() throws Exception {
        assertThat(Exercise1.div(Integer.MAX_VALUE, Integer.MAX_VALUE), is(1));
    }

    @Test
    public void testDivMinMin() throws Exception {
        assertThat(Exercise1.div(Integer.MIN_VALUE, Integer.MIN_VALUE), is(1));
    }
}