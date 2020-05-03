package JavaPrograms;


import com.sun.istack.internal.NotNull;

import java.util.*;

public class Demo {
    public static void main(String[] args) {


    MySub mySub=new MySub();
    }
}

class MySuper {

    MySuper() {
        System.out.println("Super was called");
    }
}

class MySub extends MySuper{
    MySub() {
        System.out.println("Sub was called");
    }
}

class Employee implements Comparable<Employee> {
    String name;
    int age;
    int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public int compareTo(Employee o) {
        return this.salary - o.salary;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.salary;
    }
}

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(@NotNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Student person = (Student) obj;
        if (this.name.equals(person.name) && this.age == person.age) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.name.length() % 10;
    }
}