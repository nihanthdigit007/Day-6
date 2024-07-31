import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int age;
    double salary;

    Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

public class Assignment63 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30, 50000));
        people.add(new Person("Bob", 25, 60000));
        people.add(new Person("Charlie", 35, 70000));
        people.add(new Person("David", 28, 55000));

        Collections.sort(people, Comparator.comparingInt(person -> person.age));

        people.forEach(System.out::println);
    }
}
