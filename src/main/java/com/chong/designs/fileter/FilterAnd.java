package com.chong.designs.fileter;

public class FilterAnd<T> extends Filtercomplex<T> {
    public FilterAnd(Filter<T> filter1, Filter<T> filter2) {
        super(filter1, filter2);
    }
 
    @Override
    public boolean filt(T object) {
        return filter1.filt(object) && filter2.filt(object);
    }
}
