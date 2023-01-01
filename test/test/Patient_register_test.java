/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import code.patient_register;

/**
 *
 * @author Fine
 */
public class Patient_register_test {
    
     
    public Patient_register_test() {
    }
   
    public void patient_login(){
        
        patient_register pr = new patient_register();
             String userName = "ahad";
        String Email = "ahad01@fui.edu.pk";
        String Password = "123456";
         boolean expectedResult=true;
     //   boolean actualResult = pr.registerPatient(userName, Email, Password);
     //   assertEquals(expectedResult, actualResult);
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
