package module25;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static final Logger logger = Logger.getLogger(Test.class.getName());

    public static void main(String[] args) {
        logger.log(Level.INFO, "Hello world");
    }
}