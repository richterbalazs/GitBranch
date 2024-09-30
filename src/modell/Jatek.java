
package modell;

import java.util.Scanner;

public class Jatek {
    private static final Scanner sc = new Scanner(System.in);
    
    private Lada[] Ladak;
    private int valasztas;
    
    public Jatek() {
        valasztas = -1;
        Ladak = new Lada[3];
        Ladak[0] = new Lada("arany", "Én rejtem a kincset.");
        Ladak[1] = new Lada("ezüst", "Nem én rejtem a kincset.", true);
        Ladak[2] = new Lada("bronz", "Az arany hazudik!");
        

        megjelenit(kezdes());
        bekeres();
        megjelenit(ellenorzes());
    }

    public String kezdes() {
        String s = "Hol a kincs? Csak az egyik felirat igaz!\n";
        int i = 0;
        for (Lada lada : Ladak) {
            String a = lada.getAnyag();
            String f = lada.getFelirat();
            s += i++ + ". " + a + "láda --> " + f + "\n";
        }
        return s;
    }

    private void bekeres() {
        megjelenit("Melyik ládában van a kincs? (1,2,3)");
        valasztas = sc.nextInt() - 1;
    }
    
    private void megjelenit(String uzenet){
        System.out.print(uzenet);
    }

    private String ellenorzes() {
        String talalt = "Gratulálok, eltalátad!";
        String nemTalalt = "Sajnos nem találtad el!";
        return Ladak[valasztas].isKincs() ? talalt : nemTalalt;
    }
}


// létrehozzuk az osztályt
// adattagot hozunk létre
// 
