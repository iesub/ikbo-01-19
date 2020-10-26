package ru.mirea.lab16;

public final class Customer {
    private String firstName;
    private String secondName;
    private int age;
    private Address address;
    private Customer MATURE_UNKNOWN_CUSTOMER;     //????
    private Customer NOT_MATURE_UNKNOWN_CUSTOMER; //????

    public Customer(String firstName, String secondName, int age, Address address){
        this.firstName = firstName;
        this.address = address;
        this.age = age;
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return "<html>" +
                "Имя: " + firstName +
                "<br>Фамилия: " + secondName +
                "<br>Возраст: " + age +
                "<br></html>" + address.toString();
    }
}
