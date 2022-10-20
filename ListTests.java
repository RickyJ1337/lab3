import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;


public class ListTests {
    @Test
    public void testFilter() {
        List<String> test = new ArrayList<String>();
        test.add("BrosUp");
        test.add("Good");
        test.add("Great");
        List<String> expect = new ArrayList<String>();
        expect.add("BrosUp");
        expect.add("Great");
        assertEquals(expect.toString(), ListExamples.filter(test, null));
    }
}
