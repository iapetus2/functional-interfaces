import java.io.IOException;

@FunctionalInterface
public interface ConsumerWrapper<T, E extends Exception> {

    void haha() throws IOException;
}
