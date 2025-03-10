package project;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        Customer alice=new Customer("Alice", "9999999");
        //Normal java function
        greetCustomer(alice);
        //Consumer Functional Interface
        greetCustomerConsumer.accept(alice);

    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName +
                    " thanks for registering phone number " + customer.customerPhoneNumber);


    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName +
                " thanks for registering phone number " + customer.customerPhoneNumber);
    }


    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
