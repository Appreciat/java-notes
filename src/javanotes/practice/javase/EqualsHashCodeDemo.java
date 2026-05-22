package javanotes.practice.javase;

import java.util.*;

class Person {
    String name;

    Person(String name) { this.name = name; }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Person)) {
            return false;
        }
        return this.name.equals(((Person) o).name);
    }

    @Override
    public int hashCode() {
        return name.hashCode(); // 根据内容生成 hashCode
    }
}

public class EqualsHashCodeDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Alice");
        Person p2 = new Person("Alice");

        System.out.println(p1.equals(p2)); // true

        HashSet<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);

        System.out.println(set.size()); // 1，正确
    }
}