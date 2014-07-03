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

        /* check identity */
        if (num == denom) {
            return 1;
        }

        int limit = Math.abs(num);
        int multiplier = Math.abs(denom);
        int register = 0;
        int count = 0;

        /* check if quotient should be negative; XOR either operand is negative */
        boolean isNegative = 0 > num ^ 0 > denom;

        while (limit > register) {

            /* check for overflow */
            if (multiplier + register > limit) {
                break;
            }

            register += multiplier;
            count++;
        }

        /* apply appropriate sign to quotient */
        return isNegative ? count * -1 : count;
    }

}
