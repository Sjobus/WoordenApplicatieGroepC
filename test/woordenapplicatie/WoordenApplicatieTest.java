/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package woordenapplicatie;

import javafx.stage.Stage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sibe
 */
public class WoordenApplicatieTest {
    
    public WoordenApplicatieTest() {
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
     * Test of start method, of class WoordenApplicatie.
     */
    @Test
    public void testStart() throws Exception {
        System.out.println("start");
        Stage stage = null;
        WoordenApplicatie instance = new WoordenApplicatie();
        instance.start(stage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CountWord method, of class WoordenApplicatie.
     */
    @Test
    public void testCountWord() {
        System.out.println("CountWord");
        String[] woorden = null;
        WoordenApplicatie instance = new WoordenApplicatie();
        String expResult = "";
        String result = instance.CountWord(woorden);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of StringSplitter method, of class WoordenApplicatie.
     */
    @Test
    public void testStringSplitter() {
        System.out.println("StringSplitter");
        String s = "";
        WoordenApplicatie instance = new WoordenApplicatie();
        String[] expResult = null;
        String[] result = instance.StringSplitter(s);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SorteerWoorden method, of class WoordenApplicatie.
     */
    @Test
    public void testSorteerWoorden() {
        System.out.println("SorteerWoorden");
        String[] woorden = null;
        WoordenApplicatie instance = new WoordenApplicatie();
        String expResult = "";
        String result = instance.SorteerWoorden(woorden);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FrequentieWoorden method, of class WoordenApplicatie.
     */
    @Test
    public void testFrequentieWoorden() {
        System.out.println("FrequentieWoorden");
        String[] woorden = null;
        WoordenApplicatie instance = new WoordenApplicatie();
        String expResult = "";
        String result = instance.FrequentieWoorden(woorden);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of wordGetLines method, of class WoordenApplicatie.
     */
    @Test
    public void testWordGetLines() {
        System.out.println("wordGetLines");
        String str = "";
        WoordenApplicatie instance = new WoordenApplicatie();
        String expResult = "";
        String result = instance.wordGetLines(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class WoordenApplicatie.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        WoordenApplicatie.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
