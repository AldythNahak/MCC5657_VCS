/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import training_mcc_java.MathClass;

/**
 *
 * @author Aldyth M. V. Nahak (672017081)
 */
public class Mathtest {
    
    public Mathtest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testFindMax() {
        int expexted = 18;
        int actual = MathClass.findMax(new int[]{5,6,7,9,18});
        assertEquals(expexted, actual);
    }
}
