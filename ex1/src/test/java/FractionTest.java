import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FractionTest {

    @Test
    public void testDivHalf() throws Exception {
        assertThat(Exercise1.div(1, 2), is(0));
    }

    @Test
    public void testDivQuarter() throws Exception {
        assertThat(Exercise1.div(1, 4), is(0));
    }

    @Test
    public void testDivAlmostOne() throws Exception {
        assertThat(Exercise1.div(65, 66), is(0));
    }

}