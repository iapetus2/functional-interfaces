import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultithreadingTask {
    public static void main(String[] args) {
        String[] words = TEXT.split("\\W+");

        Counter counter = new Counter();

        Integer total = 0;

        for (String word : words) {
            //implement me
        }

        //expected output 344
        System.out.println(total);
    }

    private static class Counter {
        private ExecutorService executorService = Executors.newFixedThreadPool(10);

        /**
         * Counts characters in a word
         * @param word
         * @return
         */
        public Future<Integer> getLength(String word) {
            //implement me
        }
    }

    private static final String TEXT = "All modern operating systems support concurrency both via processes and threads. Processes are instances of programs which typically run independent to each other, e.g. if you start a java program the operating system spawns a new process which runs in parallel to other programs. Inside those processes we can utilize threads to execute code concurrently, so we can make the most out of the available cores of the CPU";
}
