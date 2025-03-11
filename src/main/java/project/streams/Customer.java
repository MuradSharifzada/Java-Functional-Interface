package project.streams;
import java.util.List;

class Customer {
    private String name;
    private String surname;
    private List<String> phoneNumbers;

    public Customer(String name, String surname, List<String> phoneNumbers) {
        this.name = name;
        this.surname = surname;
        this.phoneNumbers = phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }
}
