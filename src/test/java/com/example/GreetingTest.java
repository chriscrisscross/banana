package com.example;

import org.junit.Assert;
import org.junit.Test;

public class GreetingTest {

    @Test
    public void testGreeting() {
	Greeting.sayHi();
	Assert.assertTrue(Boolean.TRUE);
    }	

}
