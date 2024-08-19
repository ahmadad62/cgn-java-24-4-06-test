package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void add() {
       //GIVEN
       int a=5;
       int b=10;
       int expectedSum=15;

       //when
        int result=Main.add(a,b);
        //Then
        assertEquals(expectedSum,result);
    }

    @Test
    void evenChecker() {
        //GIVEN
        int a=5;
        boolean expectedResult=true;

        //When
        boolean result=Main.evenChecker(a);

        //Then
        assertEquals(expectedResult,result);
    }

    @Test
    void product() {
        //GIVEN
        int a=5;
        int b=10;
        int expectedProduct=50;

        //when
        int result=Main.product(a,b);

        //Then
        assertEquals(expectedProduct,result);

    }

    @Test
    void positiveChecker() {
        int a=-5;
        boolean expectedResult=false;
        boolean result=Main.positiveChecker(a);
    }
}