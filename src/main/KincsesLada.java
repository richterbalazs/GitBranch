/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Nezet.FelugroNezet;
import Nezet.KonzolNezet;
import Vezerlo.FelugroVezerlo;
import modell.JatekModell;
import Vezerlo.KonzolVezerlo;


public class KincsesLada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JatekModell modell = new JatekModell();
        KonzolNezet nezet = new KonzolNezet();
       // new KonzolVezerlo(modell, nezet);
        
       
        FelugroNezet fNezet = new FelugroNezet();
        new FelugroVezerlo(modell, fNezet);
    }
    
}
