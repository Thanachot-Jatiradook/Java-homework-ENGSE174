package Lab209;

public class Student {
    String name;
    Address address;

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void displayProfile() {
        System.out.println("Name :     " + this.name);
        System.out.println("Address :     " + this.address.getFullAddress());
    }
}
