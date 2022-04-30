package module10.task21;

import java.io.IOException;
import java.io.InputStream;

public class OneZeroStream extends InputStream {
    static int oneOrZero = 2;

    @Override
    public int read() throws IOException {
        oneOrZero = oneOrZero > 3 ? 0 : oneOrZero;
        if (oneOrZero % 2 == 1) {
            oneOrZero++;
            return ' ';
        } else if (oneOrZero == 0) {
            oneOrZero++;
            return 0;
        } else {
            oneOrZero++;
            return 1;
        }
    }
}
