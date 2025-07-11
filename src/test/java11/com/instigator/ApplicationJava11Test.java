
// src/test/java11/com/instigator/ApplicationJava11Test.java

package com.instigator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ApplicationJava11Test {

    @Test
    public void testJava11Feature() {
        // Contoh penggunaan fitur Java 11: var di local variable
        var expected = "Instigator Java 11";
        var actual = "Instigator Java 11";
        assertEquals(expected, actual, "Java 11 feature test passed");
    }
}
