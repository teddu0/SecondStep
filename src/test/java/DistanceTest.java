import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTest {

    @Test
    public void testArea() {
        Distance d = new Distance(600, 10, 5);
        Assert.assertEquals(d.distance(), 300);
    }
}
