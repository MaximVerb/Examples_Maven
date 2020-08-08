import static org.junit.Assert.*;
import org.junit.*;

public class TestHelloApp {
    @Test
    public final void testSayHello() {
        HelloApp app = new HelloApp();
        String text = app.sayHello();
        assertEquals("Hello World", text);
    }
}
