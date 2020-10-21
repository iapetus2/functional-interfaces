import java.io.IOException;

@FunctionalInterface
public interface ConsumerWrapper<T, E extends Exception> {
    void accept(T var1) throws IOException;

}
