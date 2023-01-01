/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Fine
 */

import code.Patient_Register;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class Patient_RegisterTest {
    
    @Test
    public void testRegister() {
        Patient_Register instance = new Patient_Register();
        
        String userName = "ahad";
        String Email = "ahad01@fui.edu.pk";
        String Password = "123456";
        boolean expectedResult=true;
        boolean actualResult = instance.registerPatient(userName, Email, Password);
        assertEquals(expectedResult, actualResult);
        
    }
    
    
}
