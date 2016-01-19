package demus.hotbrew;

import java.io.IOException;


public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        if (args.length == 0)
            throw new IllegalArgumentException("Filename is not set");

        new Runner().run(args[0]);
    }
}
