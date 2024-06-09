package com.chong.designs.fileter;

import com.chong.designs.Person;

public class NameFilter implements Filter<Person> {

    @Override
    public boolean filt(Person person) {
        return person.getName().split(" ").length > 2;
    }

}
