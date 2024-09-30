package controller;


import modell.JatekModell;
import view.CuiNezet;


public class FelugroVezerlo {
    private JatekModell model;
    private CuiNezet nezet;

    public FelugroVezerlo(JatekModell model, CuiNezet nezet) {
        this.model = model;
        this.nezet = nezet;
        
        start();   
    }

    private void start() {
        nezet.megjelenit(model.kezdes());
        model.setValasztas(nezet.bekeres());
        nezet.megjelenit(model.ellenorzes());
    }
}