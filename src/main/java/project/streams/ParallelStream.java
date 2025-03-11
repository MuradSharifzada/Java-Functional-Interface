package project.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());


        // Parallel processing
        numbers.parallelStream()
                .forEach(n -> System.out.println(Thread.currentThread().getName() + " - " + n));

        System.out.println("// Sequential processing");
        numbers.stream()
                .forEach(n -> System.out.println(Thread.currentThread().getName() + " - " + n));

    }
}
