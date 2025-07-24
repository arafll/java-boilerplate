
// src/test/java11/com/app/ApplicationJava11Test.java

package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ApplicationJava11Test {

    @Test
    public void testJava11Feature() {
        var expected = "Instigator Java 11";
        var actual = "Instigator Java 11";
        assertEquals(expected, actual, "Java 11 feature test passed");
    }
}
