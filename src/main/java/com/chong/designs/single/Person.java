package com.chong.designs.single;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Person getInstance() {
        return PersonHelper.INSTANCE.getInstance();
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    // 使用内部类是为了让person类构造方法能够是private
    private enum PersonHelper {
        INSTANCE;

        private Person person;

        private PersonHelper() {
            person = new Person("test", 11);
        }

        public Person getInstance() {
            return person;
        }
    }
}
