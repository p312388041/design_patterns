package com.chong.designs.fileter;

import com.chong.designs.Person;

public class AgeFilter implements Filter<Person> {

    @Override
    public boolean filt(Person person) {
        return person.getAge() >= 18;
    }

}
