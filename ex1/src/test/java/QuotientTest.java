import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QuotientTest {

    @Test
    public void testDiv24_by4_is6() throws Exception {
        assertThat(Exercise1.div(24, 4), is(6));
    }

    @Test
    public void testDiv33_by6_is5() throws Exception {
        assertThat(Exercise1.div(33, 6), is(5));
    }

    @Test
    public void testDiv72_by9_is8() throws Exception {
        assertThat(Exercise1.div(72, 9), is(8));
    }

    @Test
    public void testDiv99999_by4444_is25() throws Exception {
        assertThat(Exercise1.div(99999, 4444), is(22));
    }

    @Test
    public void testDiv1234522_by543255_is2() throws Exception {
        assertThat(Exercise1.div(1234522, 543255), is(2));
    }

    @Test
    public void testDivLargeNumbers() throws Exception {
        assertThat(Exercise1.div(581234423, 58123), is(10000));
    }

}