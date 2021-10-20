/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package javaapplication1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author milesmilos
 */
public class JavaApplication1Test {
    
    public JavaApplication1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void testSquare() {
        assertEquals(4,JavaApplication1.square(2),0.1);
        assertEquals(9,JavaApplication1.square(3),0.1);
        assertEquals(16,JavaApplication1.square(4),0.1);
    }
    
    @Test
    public void testCube() {
        assertEquals(8,JavaApplication1.cube(2),0.1);
        assertEquals(27,JavaApplication1.cube(3),0.1);
        assertEquals(64,JavaApplication1.cube(4),0.1);
    }
    
    @Test
    public void testSqrt() {
        assertEquals(2,JavaApplication1.sqrt(4),0.1);
        assertEquals(3,JavaApplication1.sqrt(9),0.1);
        assertEquals(5,JavaApplication1.sqrt(25),0.1);
    }
    
    @Test
    public void testAdd() {
        assertEquals(4,JavaApplication1.add(2,2),0.1);
        assertEquals(9,JavaApplication1.add(3,6),0.1);
        assertEquals(16,JavaApplication1.add(4,12),0.1);
    }


    @Test
    public void testSubtract() {
        assertEquals(4,JavaApplication1.subtract(6,2),0.1);
        assertEquals(9,JavaApplication1.subtract(12,3),0.1);
        assertEquals(16,JavaApplication1.subtract(20,4),0.1);
    }
    
    
}
