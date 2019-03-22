import org.junit.Assert;
import org.junit.Test;

public class DemoTests {

    @Test
    public void whenCallingMethodReturnsFalse() {
        Demo demo = new Demo();

        Assert.assertEquals(false, demo.returnFalse());
    }
}
