import javax.swing.plaf.basic.BasicMenuUI;
import java.io.IOException;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Consumer<Handler> consumer = wrap(Handler::handle);
        Consumer<Handler> anotherConsumer = wrap(Handler::handleAnotherWay);
        Consumer<Handler> andAnotherConsumer = wrap(Handler::handleAndAnotherWay);

        Handler handler = new Handler();

        consumer.accept(handler); //expected output: 1
        anotherConsumer.accept(handler); //expected output: 2
        andAnotherConsumer.accept(handler); //expected output: 3
    }

    private static <T> Consumer<T> wrap(ConsumerWrapper<T, Exception> consumerWrapper) {
        return i -> {
            try {
                consumerWrapper.haha();
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
    }

}
