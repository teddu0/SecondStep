import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTest {

    @Test
    public void testArea () {
        Rectangle r = new Rectangle(2, 4);
        Assert.assertEquals(r.area(), 8);
    }
}
