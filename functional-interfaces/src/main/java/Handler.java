import java.io.IOException;

public class Handler {

    void handle() throws IOException {
        throw new IOException("1");
    }

    void handleAnotherWay() throws IOException {
        throw new IOException("2");
    }

    void handleAndAnotherWay() throws IOException {
        throw new IOException("3");
    }
}
