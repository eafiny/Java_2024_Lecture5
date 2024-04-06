package org.example.PECS_Demo;

import java.util.Objects;

/**
 * @author Evgenia Skichko
 */
public class Backender extends Developer implements Comparable<Backender>{
    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Backender(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Backender{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Backender() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Backender backender = (Backender) o;
        return salary == backender.salary && Objects.equals(name, backender.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

    @Override
    public int compareTo(Backender o) {
        return this.getName().compareTo(o.getName());
    }
}
