package com.chong.designs.fileter;

import com.chong.designs.Person;

public class ChineseFilter implements Filter<Person> {

    @Override
    public boolean filt(Person person) {
        return person.getChinese() >= 60;
    }
}
