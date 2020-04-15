package com.company;

interface Excellent_Student{
    public static int exc = 200;
}
interface Bad_Student{
    public static int bxc = 100;
}
interface calc{
    public float calc();
}
public class GoodStudent implements Excellent_Student, Bad_Student{
    public String name;
    public String surname;
    public int salary;
    public GoodStudent (String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    float calc(){
        return (exc + bxc + salary)/3;
    }
}
