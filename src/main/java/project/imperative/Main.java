package project.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import static project.imperative.Gender.FEMALE;
import static project.imperative.Gender.MALE;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Murad", MALE),
                new Person("Alex", MALE),
                new Person("John", MALE),
                new Person("Edona", FEMALE),
                new Person("Maria", FEMALE),
                new Person("Alice", FEMALE)
        );

        //imperative approach
        System.out.println("imperative approach");
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (FEMALE.equals(person.getGender())) {
                females.add(person);
            }
        }
        for (Person female : females) {
            System.out.println(female);
        }

        //Declarative approach
        System.out.println("Declarative approach");
        List<Person> female = people.stream()
                .filter(person -> FEMALE.equals(person.getGender()))
                .toList();

//Function takes 1 argument and produces 1 result
        int increment2 = incrementByOneFunction.apply(10);
        System.out.println(increment2);
        Function<Integer, Integer> incrementByOneThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(incrementByOneThenMultiplyBy10.apply(1));

//BiFunction takes two argument and produces 1 result
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(1, 10));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> ++number;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) ->
                    (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOne(int number) {
        return number + 1;
    }

    static int incrementByOneAndMultiplyBiFunction(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
