import org.junit.*;
import static org.junit.Assert.*;

public class ReverseArrayTest {
    private int[] fullList;
    @Before
    public void setUp() {
        fullList = new int[] {1,2,3,4,5};
    }

    @Test
    public void testReverse() {
        ReverseArray.reverseArray(fullList, 1, 4);
        int[] expected = new int[] {1,5,4,3,2};

        assertArrayEquals(expected, fullList);
//now the test passes! let's check it 
    }
}
