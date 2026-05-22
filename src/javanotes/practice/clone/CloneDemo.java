package javanotes.practice.clone;

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("Beijing");
        Person p1 = new Person("Alice", addr);

        // 浅拷贝
        Person p2 = (Person) p1.clone();
        p2.address.city = "Shanghai";

        System.out.println(p1.address.city); // Shanghai，浅拷贝修改引用对象影响原对象

        // 深拷贝
        Person p3 = p1.deepClone();
        p3.address.city = "Guangzhou";

        System.out.println(p1.address.city); // Shanghai，深拷贝修改引用对象不影响原对象
        System.out.println(p3.address.city); // Guangzhou
    }
}

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(){

    }
    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // 浅拷贝
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // 深拷贝
    protected Person deepClone() {
        return new Person(this.name, new Address(this.address.city));
    }
}

