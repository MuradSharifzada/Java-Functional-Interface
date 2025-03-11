package project.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<Customer> customers = List.of(
                new Customer("Alice", "Johnson", Arrays.asList("111-111", "222-222")),
                new Customer("Bob", "Smith", Arrays.asList("333-333", "444-444")),
                new Customer("Carol", "Williams", Arrays.asList("333-333"))
        );


        List<List<String>> phoneNumbersWithMap = customers.stream()
                .map(customer -> customer.getPhoneNumbers())
                .collect(Collectors.toList());
        System.out.println(phoneNumbersWithMap);

        List<String> phoneNumbersWithFlatMap = customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(phoneNumbersWithFlatMap);




    }
}
