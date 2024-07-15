package com.chervonnaya;

public class CollectionFilter {

    public static <T> T[] filter(T[] array, Filter filter) {
        Object[] newArr = new Object[array.length];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = filter.apply(array[i]);
        }
        return (T[]) newArr;
    }
}
