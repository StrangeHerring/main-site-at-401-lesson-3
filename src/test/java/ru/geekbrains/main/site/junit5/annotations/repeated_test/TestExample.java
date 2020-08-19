package ru.geekbrains.main.site.junit5.annotations.repeated_test;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExample {

    @RepeatedTest(11)
    void myFirstTest() {
        assertEquals(2, 1 + 1);
    }

}
