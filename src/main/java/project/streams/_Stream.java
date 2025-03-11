package project.streams;

import project.imperative.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static project.imperative.Gender.FEMALE;
import static project.imperative.Gender.MALE;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Murad", MALE),
                new Person("Alex", MALE),
                new Person("John", MALE),
                new Person("Edona", FEMALE),
                new Person("Maria", FEMALE),
                new Person("Alice", FEMALE)
        );

        Function<Person, String> personStringFunction = person -> person.getName();
        ToIntFunction<String> length = String::length;
        IntConsumer println = System.out::println;

        people.stream()
                .map(personStringFunction)
                .mapToInt(length)
                .forEach(println);

        boolean containsOnlyFemales = people.stream()
                .anyMatch(person -> person.getGender().equals(FEMALE));
        System.out.println(containsOnlyFemales);

        Stream<Integer> s = Stream.of(4, 3, 2, 5, 6);
        List<Integer> list = s
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(list);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> sum = numbers.stream()
                .reduce(Integer::sum);
        sum.ifPresent(System.out::println);

        //Identity Value
        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println(product);

        List<String> words = Arrays.asList("Java", "Functional", "Programming");

        String combined = words.stream()
                .reduce("", (s1, s2) -> s1 + " " + s2)
                .trim();
        System.out.println(combined);
    }

}
