/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Compte;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TECHNIQUE-RACHID
 */
public class CompteService extends AbstractFacade<Compte> {

    public CompteService() {
        super(Compte.class);
    }

    public Compte ouvrirCompte(String rib, double soldeinitial) {
        Compte c = new Compte();
        c.setRib(rib);
        c.setSolde(soldeinitial);
        c.setOuvert(true);

        if (soldeinitial > 0 && soldeinitial < 200) {
            c.setClasse('D');

        } else if (soldeinitial > 200 && soldeinitial < 1000) {
            c.setClasse('C');

        } else if (soldeinitial > 1000 && soldeinitial < 60000) {
            c.setClasse('B');

        } else {
            c.setClasse('A');
        }

        create(c);
        return c;
    }

//    public int fermerCompte(String rib) {   //Q2
//        Compte c= find(rib);
//        if (c.isOuvert()== false) {
//            return -1;
//        } else if (c.getSolde()!=0) {
//            return -2;
//        } else {
//            c.setOuvert(false);
//            edit(c);
//            return 1;
//        }
//    }
    
//    public int fermerComptes() {   //Q2
//        List<Compte> comptes = findAll();
//        for (int i = 0; i < comptes.size(); i++) {
//            Compte c = comptes.get(i);
//            if (c.getSolde() < 10) {
//                c.setOuvert(false);
//                edit(c);
//            
//            }
//        }
//        return 1;
//    }
//    public int fermerComptes() {   //Q2
//        List<Compte> comptes = findAll();
//        for (int i = 0; i < comptes.size(); i++) {
//            Compte c = comptes.get(i);
//            if (c.getSolde() < 10) {
//                c.setOuvert(false);
//                edit(c);
//            
//            }
//        }
//        return 1;
//    }


//       public int arnaquerClt() {
//        List<Compte> comptes = findAll();
//        for (int i = 0; i < comptes.size(); i++) {
//            Compte c = comptes.get(i);
//            double nvSolde = c.getSolde() * 0.9;
//            c.setSolde(nvSolde);
//            edit(c); 
//        }
//        return 9;
//        
//    }

    public List <Compte> findBySoldeMin(double montantMini) {
        List <Compte> cs = findAll();
        List <Compte> res = new ArrayList();
        for (int i=0; i< cs.size() ;i++){
            Compte c = cs.get(i);
            if (c.getSolde() < montantMini) {
                res.add(c);
            }
        }
        return res;
        
    }
}
