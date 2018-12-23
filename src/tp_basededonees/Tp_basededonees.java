/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_basededonees;

import service.CompteService;

/**
 *
 * @author TECHNIQUE-RACHID
 */
public class Tp_basededonees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CompteService CS = new CompteService();
        CS.ouvrirCompte("EE11", 1000);
    }
    
}
