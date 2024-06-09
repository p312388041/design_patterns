package com.chong.designs;

public class Person {
    private int number;
    private String name;
    private int age;
    private float chinese;
    private float english;
    private float math;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getChinese() {
        return chinese;
    }

    public float getEnglish() {
        return english;
    }

    public float getMath() {
        return math;
    }

    public int getNumber() {
        return number;
    }

    public Person(int number, String name, int age, float chinese, float english, float math) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.english = english;
        this.math = math;
    }

    @Override
    public String toString() {
        return "Person [number=" + number + ", name=" + name + ", age=" + age + ", chinese=" + chinese + ", english="
                + english + ", math=" + math + "]";
    }

}
