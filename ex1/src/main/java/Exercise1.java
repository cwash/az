/**
 * CBW: Write me.
 *
 * @author Chris Wash <a href="mailto:chris.wash@gmail.com">chris.wash@gmail.com</a>
 */
public class Exercise1 {

    public static int div(int num, int denom) {

        /* check divide by zero */
        if (denom == 0) {
            throw new ArithmeticException("/ by zero");
        }

        /* check zero divisor */
        if (num == 0) {
            return 0;
        }
        return 1;
    }

}
