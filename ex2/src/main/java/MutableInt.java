/**
 * CBW: Write me.
 *
 * @author Chris Wash <a href="mailto:chris.wash@gmail.com">chris.wash@gmail.com</a>
 */
public class MutableInt implements Comparable<MutableInt> {
    int value = 1; // note that we start at 1 since we're counting
    public void increment () { ++value;      }
    public int  get ()       { return value; }

    @Override
    public String toString() {
        return ""+value;
    }

    @Override
    public int compareTo(MutableInt o) {
        if (this.value < o.value)
            return -1;
        else if (this.value == o.value)
            return 0;
        else
            return 1;
    }
}