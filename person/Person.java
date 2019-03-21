package person;

public class Person {
    private String name,address;

    public Person(String name, String address) {
        this.name= name;
        this.address= address;
    }

    public Person() {
        this.name= "Check public records";
        this.address= "Check public records";
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address= address;
    }

    @Override
    public String toString() {
        return name + "(" + address + ")";
    }
}
