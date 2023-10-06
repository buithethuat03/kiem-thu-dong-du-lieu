import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MainTest {
    @Test
    public void negativeInput() {
        int []arr = {};
        int n = -1;
        assertEquals(0, Main.sumArr(arr, n));
    }

    @Test
    public void zeroInput() {
        int []arr = {};
        int n = 0;
        assertEquals(0, Main.sumArr(arr, n));
    }

    @Test
    public void positiveInput1() {
        int []arr = {0};
        int n = 1;
        assertEquals(0, Main.sumArr(arr, n));
    }

    @Test
    public void positiveInput2() {
        int []arr = {0, 1};
        int n = 2;
        assertEquals(1, Main.sumArr(arr, n));
    }
}
