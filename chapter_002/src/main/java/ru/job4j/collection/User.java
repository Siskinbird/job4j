package ru.job4j.collection;

import java.util.Comparator;
import java.util.Objects;

/**
 /* The Item class implements the data model for the ... class
 * @author Dmitry Chizhov
 * @since 19.07.20
 * @version 1.00
 */

public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(User b) {
    Comparator<User> byName = new UserNameComparator();
    Comparator<User> byAge = new UserAgeComparator();
    User a = new User(getName(), getAge());
    if (a.getName().compareTo(b.getName()) != 0) {
        return byName.compare(a, b);
    } else {
        return  byAge.compare(a, b);
          }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age
                &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "User{"
                +
                "name='"
                + name
                + '\''
                +
                ", age="
                + age
                +
                '}';
    }
}
