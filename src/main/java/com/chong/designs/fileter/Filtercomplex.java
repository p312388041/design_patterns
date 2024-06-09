package com.chong.designs.fileter;

public abstract class Filtercomplex<T> implements Filter<T> {
    protected Filter<T> filter1;
    protected Filter<T> filter2;

    public Filtercomplex(Filter<T> filter1, Filter<T> filter2) {
        this.filter1 = filter1;
        this.filter2 = filter2;
    }
}
