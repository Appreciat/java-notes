package javanotes.practice.reference;

public class ReferencePassingDemo {
    public static void main(String[] args) {
        int a = 5;
        modifyInt(a);
        System.out.println(a);

        Person p = new Person();
        p.name = "Alice";
        modifyPerson(p);
        System.out.println(p.name);

        changeRef(p);
        System.out.println(p.name);
    }

    static void modifyInt(int x) { x = 10; }
    static void modifyPerson(Person p) { p.name = "Bob"; }
    static void changeRef(Person p) { p = new Person(); p.name = "Charlie"; }

    private static class Person {
        private String name;
    }
}
