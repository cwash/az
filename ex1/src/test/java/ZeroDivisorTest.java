import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ZeroDivisorTest {

    @Test
    public void testDiv() throws Exception {
        assertThat(Exercise1.div(0, 1), is(0));
    }
}