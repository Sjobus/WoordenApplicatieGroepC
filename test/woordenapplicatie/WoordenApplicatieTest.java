/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package woordenapplicatie;

import java.util.HashSet;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import javafx.application.Application;

/**
 *
 * @author Sibe
 */
public class WoordenApplicatieTest {
    public String s =   "Een, twee, drie, vier\n" +
                        "Hoedje van, hoedje van\n" +
                        "Een, twee, drie, vier\n" +
                        "Hoedje van papier";
    public String[] woorden = s.toLowerCase().split("[\\s,\\.]+");
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
     * Test of CountWord method, of class WoordenApplicatie.
     */
    @Test
    public void testCountWord() {
        System.out.println("CountWord");        
        WoordenApplicatie instance = new WoordenApplicatie();
        HashSet<String> testHash = new HashSet<>();
        for(String i : woorden){
            testHash.add(i.toLowerCase());
        }
        String expResult = "Totaal aantal woorden: " + woorden.length + "\n"
                + "Verschillende woorden: " + testHash.size();
        String result = instance.CountWord(woorden);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of StringSplitter method, of class WoordenApplicatie.
     */
    @Test
    public void testStringSplitter() {
        System.out.println("StringSplitter");        
        WoordenApplicatie instance = new WoordenApplicatie();
        String[] expResult = woorden;
        String[] result = instance.StringSplitter(s);
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of SorteerWoorden method, of class WoordenApplicatie.
    */ 
    @Test
    public void testSorteerWoorden() {
        System.out.println("SorteerWoorden");
        WoordenApplicatie instance = new WoordenApplicatie();
        String expResult = "vier\nvan\ntwee\npapier\nhoedje\neen\ndrie\n";
        String result = instance.SorteerWoorden(woorden);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of FrequentieWoorden method, of class WoordenApplicatie.
     */
    @Test
    public void testFrequentieWoorden() {
        System.out.println("FrequentieWoorden");
        WoordenApplicatie instance = new WoordenApplicatie();
        String expResult = "papier : 1\ntwee : 2\ndrie : 2\nvier : 2\neen : 2\nhoedje : 3\nvan : 3\n";
        String result = instance.FrequentieWoorden(woorden);
        assertEquals(expResult, result);
    }

    /**
     * Test of wordGetLines method, of class WoordenApplicatie.
     */
    @Test
    public void testWordGetLines() {
        System.out.println("wordGetLines");
        WoordenApplicatie instance = new WoordenApplicatie();
        String expResult = "hoedje: 	[2, 4]\nvan: 	[2, 4]\ndrie: 	[1, 3]\ntwee: 	[1, 3]\nvier: 	[1, 3]\npapier: 	[4]\neen: 	[1, 3]\n";
        String result = instance.wordGetLines(s);
        assertEquals(expResult, result);

    }

   
    
}
