/**
 * CBW: Write me.
 *
 * @author Chris Wash <a href="mailto:chris.wash@gmail.com">chris.wash@gmail.com</a>
 */
public class LogLine {

    public long timestamp;

    public String customerId;

    public String pageType;

    public LogLine(String customerId, String pageType, long timestamp) {
        this.customerId = customerId;
        this.pageType = pageType;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "LogLine{" +
                "timestamp=" + timestamp +
                ", customerId='" + customerId + '\'' +
                ", pageType='" + pageType + '\'' +
                '}';
    }
}