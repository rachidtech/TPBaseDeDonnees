/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Compte;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TECHNIQUE-RACHID
 */
public class CompteServiceTest {

    public CompteServiceTest() {
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
     * Test of ouvrirCompte method, of class CompteService.
     */
    // @Test
//    public void testOuvrirCompte() {
//        System.out.println("ouvrirCompte");
//        String rib = "EE4";
//        double soldeinitial = 600.0;
//        CompteService instance = new CompteService();
//        
//        Compte result = instance.ouvrirCompte(rib, soldeinitial);
//       
//    }
    /**
     * Test of fermerCompte method, of class CompteService.
     */
//    @Test
//    public void testFermerCompte() {
//        System.out.println("fermerCompte");
//        String rib = "EE4";
//        
//        CompteService instance = new CompteService();
//        int expResult = 0;
//        int result = instance.fermerCompte(rib);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//    }
    /**
     * Test of crediter method, of class CompteService.
     */
//    @Test
//    public void testCrediter() {
//        System.out.println("crediter");
//        String rib = "EE4";
//        double montantCredit = 20.0;
//        CompteService instance = new CompteService();
//        int expResult = 0;
//        int result = instance.crediter(rib, montantCredit);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        
//    }
    /**
     * Test of debiter method, of class CompteService.
     */
//    @Test
//    public void testDebiter() {
//        System.out.println("debiter");
//        String rib = "EE4";
//        double montantDebit = 100.0;
//        CompteService instance = new CompteService();
//        int expResult = 0;
//        int result = instance.debiter(rib, montantDebit);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        
//    }
//    @Test
//   
//   public void testFermerComptes() {
//        System.out.println("fermerCompte");
//        
//        
//       CompteService instance = new CompteService();
//        int expResult = 0;
//        int result = instance.fermerComptes();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        
//    }
//    @Test
//   
//   public void testArnaquerComptes() {
//        System.out.println("Arnaquer Compte");
//        
//        
//       CompteService instance = new CompteService();
//        int expResult = 0;
//        int result = instance.arnaquerClt();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        
//    }
    @Test

    public void testfindBySoldeMin() {
        System.out.println("ListminSolde Compte");
        CompteService instance = new CompteService();
        System.out.println(instance.findBySoldeMin(100));
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of ouvrirCompte method, of class CompteService.
     */
    @Test
    public void testOuvrirCompte() {
        System.out.println("ouvrirCompte");
        String rib = "";
        double soldeinitial = 0.0;
        CompteService instance = new CompteService();
        Compte expResult = null;
        Compte result = instance.ouvrirCompte(rib, soldeinitial);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findBySoldeMin method, of class CompteService.
     */
    @Test
    public void testFindBySoldeMin() {
        System.out.println("findBySoldeMin");
        double montantMini = 0.0;
        CompteService instance = new CompteService();
        List<Compte> expResult = null;
        List<Compte> result = instance.findBySoldeMin(montantMini);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
