package project.functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("+9943202323"));
        isPhoneNumberValidPredicate.test("+9943202323");
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+994") && phoneNumber.length() == 11;
    }
    static Predicate<String> isPhoneNumberValidPredicate=phoneNumber->
            phoneNumber.startsWith("+994") && phoneNumber.length() == 11;
}
