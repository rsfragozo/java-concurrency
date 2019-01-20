package com.atcoffeebreak.javaconcurrency;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void shouldReturnHelloWorld() {
        assertEquals(App.sayHelloWorld(), "Hello World");
    }
}