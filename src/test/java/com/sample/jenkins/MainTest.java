package com.sample.jenkins;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sample.jenkis.Main;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
public class MainTest {
    
    @Test
    public void testInputIsEven(){
        System.out.println("Executing test");
        assertTrue(Main.checkIfInputIsAnEvenNumber(22)); // Assertion
    }
}
