import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Наталья on 12.03.2017.
 */
public class SorterTest {
    @Test
    public void test () throws Exception {
        String[] actual = Sorter.loadAndSort (new StringReader("b\na\nc"));
        String[] expected = {"a","b","c"};
        assertArrayEquals(expected, actual);
    }
}