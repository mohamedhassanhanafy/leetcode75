package me;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @DisplayName("Test App.getMessage()")
    @Test
    void testGet() {
        assertEquals("Hello World!", App.getMessage());
    }

}
