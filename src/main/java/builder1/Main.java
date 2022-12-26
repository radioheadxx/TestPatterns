package builder1;

public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilderImpl().setAge(23).setName("rayana").setSalary(250000).build();
        person.print();
    }

}

class Person {
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    String name;
    int age;
    int salary;

    public void print() {
        System.out.println(name + " " + salary + " " + age);
    }
}

interface PersonBuilder {
    PersonBuilder setName(String name);
    PersonBuilder setAge(int age);
    PersonBuilder setSalary(int salary);
    Person build();
}

class PersonBuilderImpl implements PersonBuilder{
    Person person = new Person();

    @Override
    public PersonBuilder setName(String name) {
        person.name = name;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        person.age = age;
        return this;
    }

    @Override
    public PersonBuilder setSalary(int salary) {
        person.salary = salary;
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}