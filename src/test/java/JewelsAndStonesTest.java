import org.example.JewelsAndStones;
import org.junit.Assert;
import org.junit.Test;

public class JewelsAndStonesTest {

    @Test
    public void someJewelsAtStones() {
        String jewels = "aA";
        String stones = "aAAbbbb";

        int expected = 3;

        Assert.assertEquals(expected, new JewelsAndStones().calc(jewels, stones));

    }

    @Test
    public void noJewelsAtStones() {
        String jewels = "z";
        String stones = "ZZ";

        int expected = 0;

        Assert.assertEquals(expected, new JewelsAndStones().calc(jewels, stones));
    }

    @Test
    public void emptyStones() {
        String jewels = "aA";
        String stones = "";

        Assert.assertEquals(0, new JewelsAndStones().calc(jewels, stones));
    }

    @Test
    public void emptyJewels() {
        String jewels = "";
        String stones = "aAAbbbb";
        Assert.assertEquals(0, new JewelsAndStones().calc(jewels, stones));
    }

    @Test
    public void nullJewelsAndStones() {
        Assert.assertThrows(NullPointerException.class, () -> new JewelsAndStones().calc(null, null));
    }
}
