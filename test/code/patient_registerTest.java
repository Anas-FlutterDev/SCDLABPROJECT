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
public class patient_registerTest {
    
    public patient_registerTest() {
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

  

    @Test
    public void testMain() {
       
        String Username = "Ahmed";
        String email = "ahmed@gmail.com";
        String password = "123456";
        patient_register instance = new patient_register();
        String expResult = "Registration Successfull";
        String result = instance.CheckRegistration(Username, email, password);
        assertEquals(expResult, result);
        System.out.println("Test Passed");
//        Registration Successfull
        
    }
    
}
