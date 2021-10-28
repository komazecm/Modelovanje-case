/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.lang.Math;
/**
 *
 * @author Neon
 */
public class Casa {

    private String materijal; //keramika, kaljeno staklo, plastika
    private double visina; //u cm npr
    private double precnik;
    private boolean rucka;
    private double nivoTecnosti; //nivo (u %) do kog je solja napunjena

    public Casa() {
    }

    public Casa(String materijal, double visina, double precnik, boolean rucka, double nivoTecnosti) {
        this.materijal = materijal;
        this.visina = visina;
        this.precnik = precnik;
        this.rucka = rucka;
        this.nivoTecnosti = nivoTecnosti;
    }
    
    public String getMaterijal() {
        return materijal;
    }

    public void setMaterijal(String materijal) {
        this.materijal = materijal;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    public double getPrecnik() {
        return precnik;
    }

    public void setPrecnik(double precnik) {
        this.precnik = precnik;
    }

    public boolean isRucka() {
        return rucka;
    }

    public void setRucka(boolean rucka) {
        this.rucka = rucka;
    }

    public double getNivoTecnosti() {
        return nivoTecnosti;
    }

    public void setNivoTecnosti(double nivoTecnosti) {
        this.nivoTecnosti = nivoTecnosti;
    }
    
    public double vratiZapreminu(){
        return this.visina*(this.precnik/2)*(this.precnik/2)*Math.PI;
    }
    
    public void napuni(double procenat){
        if(procenat > 1 || procenat < 0){
            return;
        }
        if(nivoTecnosti + procenat*100 > 100)
            nivoTecnosti = 100;
        else {
            nivoTecnosti += procenat*100;
        }
    }
    
    public void ispij(double procenat){
        if(procenat > 1 || procenat < 0){
            return;
        }
        if(nivoTecnosti - procenat*100 < 0)
            nivoTecnosti = 0;
        else {
            nivoTecnosti -= procenat*100;
        }
    }
    
    
}
