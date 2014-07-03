import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DivideByZeroTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testDiv() throws Exception {

        exception.expect(ArithmeticException.class);
        exception.expectMessage("/ by zero");

        Exercise1.div(1,0);


    }
}