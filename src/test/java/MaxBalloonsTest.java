import org.example.MaxBalloons;
import org.junit.Assert;
import org.junit.Test;

public class MaxBalloonsTest {

    @Test
    public void testSomeInstancesOfBalloon() {
        String text = "loonbalxballpoon";
        Assert.assertEquals(2, new MaxBalloons().calc(text));
    }

    @Test
    public void testNoInstancesOfBalloon() {
        String text = "leetcode";
        Assert.assertEquals(0, new MaxBalloons().calc(text));
    }

    @Test
    public void testNullText() {
        Assert.assertEquals(0, new MaxBalloons().calc(null));
    }

    @Test
    public void testEmptyText() {
        Assert.assertEquals(0, new MaxBalloons().calc(""));
    }
}
