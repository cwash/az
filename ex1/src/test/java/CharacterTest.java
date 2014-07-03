import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;

public class CharacterTest {

    @Test
    public void testDivCharacterIncreasing() throws Exception {
        assertThat(Exercise1.div('A', 'B'), is(0));
    }

    @Test
    public void testDivCharacterDecreasing() throws Exception {
        assertThat(Exercise1.div('B', 'A'), is(1));
    }

}
