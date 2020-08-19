package ru.geekbrains.main.site.junit5.annotations.display_name;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Супер тест набор")
public class DisplayNameExample {

    @DisplayName("Супер тест-кейс")
    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1);
    }

}
