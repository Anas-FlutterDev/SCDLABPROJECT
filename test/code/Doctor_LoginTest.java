/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mubashar
 */
public class Doctor_LoginTest {
    Doctor_Login instance = new Doctor_Login();
    
    public Doctor_LoginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Doctor_Login.
     */
    @Test
    public void testMain() {
        
                boolean c= instance.logintest("Mubashar", "123456");
                boolean expected=true;
                assertEquals(expected, c);
                System.out.println("Doctor Login Test Passed");
    }
    
}
