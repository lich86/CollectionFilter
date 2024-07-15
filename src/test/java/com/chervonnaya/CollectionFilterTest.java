package com.chervonnaya;

import org.junit.jupiter.api.Test;

import static com.chervonnaya.CollectionFilter.filter;
import static org.junit.jupiter.api.Assertions.*;

class CollectionFilterTest {

    @Test
    void testInteger() {
        Filter intFilter = o -> (Integer) o * 10;
        Integer[] integers = {1, 2, 3, 4, 5};
        Integer[] expectedIntegers = {10, 20, 30, 40, 50};

        assertArrayEquals(filter(integers, intFilter), expectedIntegers);
    }

    @Test
    void testString() {
        Filter stringFilter = s -> ((String) s).toUpperCase();
        String[] strings = {"a", "b", "c", "d"};
        String[] expectedStrings = {"A", "B", "C", "D"};

        assertArrayEquals(filter(strings, stringFilter), expectedStrings);
    }

}