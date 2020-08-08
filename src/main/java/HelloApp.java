import org.apache.logging.log4j.*;

public class HelloApp {

    private static Logger logger = LogManager.getLogger();

    public String sayHello() {
        logger.debug("Somebody called sayHello()");
        return "Hello World";
    }
    public static void main(String[] args) {
        HelloApp app = new HelloApp();

        app.sayHello();
    }
}
