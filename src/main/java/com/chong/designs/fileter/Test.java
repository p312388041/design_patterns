package com.chong.designs.fileter;

import java.util.ArrayList;
import java.util.List;

import com.chong.designs.Person;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person(1, "zhang san feng", 18, 70, 80, 89);
        Person p2 = new Person(2, "zhang san feng", 18, 59, 80, 89);
        Person p3 = new Person(3, "zhang san feng", 17, 70, 80, 89);
        Person p4 = new Person(4, "zhang san feng", 17, 59, 80, 89);
        Person p5 = new Person(5, "zhang san", 18, 59, 80, 89);
        Person p6 = new Person(6, "zhang san", 18, 70, 80, 89);
        Person p7 = new Person(7, "zhang san", 17, 70, 80, 89);
        Person p8 = new Person(8, "zhang san", 17, 59, 80, 89);

        Filter<Person> nameFilter = new NameFilter();
        // Filter<Person> chineseFilter = new ChineseFilter();
        Filter<Person> ageFilter = new AgeFilter();

        FilterChain<Person> filterChain = new FilterChain<>();
        filterChain.addFilter(new FilterOr<>(nameFilter, ageFilter));

        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);
        personList.add(p6);
        personList.add(p7);
        personList.add(p8);

        for (Person person : filterChain.doFilter(personList)) {
            System.out.println(person);
        }
    }
}
