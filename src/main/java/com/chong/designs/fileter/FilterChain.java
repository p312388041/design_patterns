package com.chong.designs.fileter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain<T> implements Filter<T> {

    private List<Filter<T>> filterList = new ArrayList<>();

    public void addFilter(Filter<T> filter) {
        filterList.add(filter);
    }

    @Override
    public boolean filt(T object) {
        boolean result = true;
        for (Filter<T> f : filterList) {
            if (!f.filt(object)) {
                return false;
            }
        }
        return result;
    }

    public List<T> doFilter(List<T> objectList) {
        List<T> result = new ArrayList<>();
        for (T t : objectList) {
            if (filt(t)) {
                result.add(t);
            }
        }
        return result;
    }
}
