package ru.java.lesson5;

import java.math.BigInteger;

// 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Employee {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    // 2. Конструктор класса должен заполнять эти поля при создании объекта.
    public Employee(String fio, String position, String email, String phone, double salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    // 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public void info() {
        System.out.println("ФИО: " + fio + "; Должность: " + position + "; Email: " + email + "; Телефон: " + phone +
                "; Зарплата: " + salary + "; Возраст: " + age);
    }

    // Этого в домашке не было, но я решил написать геттеры и сеттеры.
    public String getFio() {
        return fio;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone() {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 20000.00) {
            this.salary = salary;
        } else {
            System.out.println("Сотрудник заслуживает большего!");
        }

    }

    public int getAge() {
        return age;
    }


}
