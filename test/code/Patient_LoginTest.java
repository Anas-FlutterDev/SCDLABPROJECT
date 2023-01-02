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
public class Patient_LoginTest {
    
    public Patient_LoginTest() {
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


    
    public void testMain() {


        System.out.println("logintest Passed");
        String username = "Ali";
        String password = "123456";
        Patient_Login instance = new Patient_Login();
        boolean expResult = true;
        boolean result = instance.logintest(username, password);
        assertEquals(expResult, result);
        System.out.println("Patient Login Test Passed");
        
    }
    
}
