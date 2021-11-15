/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package edu.nwmissouri.zoo11group;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author S545407
 */
public class BungeJumpAdventureTest {
    
    public BungeJumpAdventureTest() {
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
     * Test of toString method, of class BungeJumpAdventure.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BungeJumpAdventure instance = new BungeJumpAdventure();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isSignedsafetywavier method, of class BungeJumpAdventure.
     */
    @Test
    public void testIsSignedsafetywavier() {
        System.out.println("isSignedsafetywavier");
        BungeJumpAdventure instance = new BungeJumpAdventure();
        boolean expResult = false;
        boolean result = instance.isSignedsafetywavier();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSignedsafetywavier method, of class BungeJumpAdventure.
     */
    @Test
    public void testSetSignedsafetywavier() {
        System.out.println("setSignedsafetywavier");
        boolean signedsafetywavier = false;
        BungeJumpAdventure instance = new BungeJumpAdventure();
        instance.setSignedsafetywavier(signedsafetywavier);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotcustomer method, of class BungeJumpAdventure.
     */
    @Test
    public void testGetTotcustomer() {
        System.out.println("getTotcustomer");
        BungeJumpAdventure instance = new BungeJumpAdventure();
        int expResult = 0;
        int result = instance.getTotcustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTotcustomer method, of class BungeJumpAdventure.
     */
    @Test
    public void testSetTotcustomer() {
        System.out.println("setTotcustomer");
        int totcustomer = 0;
        BungeJumpAdventure instance = new BungeJumpAdventure();
        instance.setTotcustomer(totcustomer);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ageLimit method, of class BungeJumpAdventure.
     */
    @Test
    public void testAgeLimit() {
        System.out.println("ageLimit");
        BungeJumpAdventure instance = new BungeJumpAdventure();
        instance.ageLimit();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of idProof method, of class BungeJumpAdventure.
     */
    @Test
    public void testIdProof() {
        System.out.println("idProof");
        BungeJumpAdventure instance = new BungeJumpAdventure();
        instance.idProof();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of safetyMeasures method, of class BungeJumpAdventure.
     */
    @Test
    public void testSafetyMeasures() {
        System.out.println("safetyMeasures");
        BungeJumpAdventure instance = new BungeJumpAdventure();
        instance.safetyMeasures();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of lengthofjump method, of class BungeJumpAdventure.
     */
    @Test
    public void testLengthofjump() {
        System.out.println("lengthofjump");
        BungeJumpAdventure instance = new BungeJumpAdventure();
        instance.lengthofjump();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of duration method, of class BungeJumpAdventure.
     */
    @Test
    public void testDuration() {
        System.out.println("duration");
        BungeJumpAdventure instance = new BungeJumpAdventure();
        double expResult = 0.0;
        double result = instance.duration();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class BungeJumpAdventure.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        BungeJumpAdventure.run();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
