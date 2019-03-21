import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoTests {

    @Test
    public void whenCallingReturnsFalseItDoes() {
        Demo demo = new Demo();
        assertEquals(false, demo.ReturnsFalse());
    }
}
