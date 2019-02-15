package com.stackroute.PE2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Scanner;
import java.io.*;
import static org.junit.Assert.*;

public class UpperCaseTest {

    private static UpperCase uppercase;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        uppercase = new UpperCase();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        uppercase = null;

    }

    @Test
    public void upperCaseSuccess() throws IOException {

        //Arrange
        String expectedValue = "THIS CONTENT SHOULD BE IN UPPERCASE";

        //Act
        String actualValue = uppercase.upperCase("input1.txt");
        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);

    }


}