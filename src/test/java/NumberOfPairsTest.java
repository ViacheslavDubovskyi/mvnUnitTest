import org.example.NumberOfPairs;
import org.junit.Assert;
import org.junit.Test;

public class NumberOfPairsTest {

    @Test
    public void somePairs() {
        int[] nums = {1, 2, 3, 1, 1, 3};
        Assert.assertEquals(4, new NumberOfPairs().calc(nums));
    }

    @Test
    public void allPairs() {
        int[] nums = {1, 1, 1, 1};
        Assert.assertEquals(6, new NumberOfPairs().calc(nums));
    }

    @Test
    public void noPairs() {
        int[] nums = {1, 2, 3};
        Assert.assertEquals(0, new NumberOfPairs().calc(nums));
    }

    @Test
    public void arrayIsEmpty() {
        Assert.assertEquals(0, new NumberOfPairs().calc(new int[0]));
    }

    @Test
    public void nullArray() {
        Assert.assertEquals(0, new NumberOfPairs().calc(null));
    }
}
