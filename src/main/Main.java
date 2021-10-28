/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Neon
 */
public class Main {
    
    public static void main(String[] args) {
        Casa s = new Casa("kaljeno staklo", 10, 5, true, 0);
        System.out.println("Zapremina: " + s.vratiZapreminu() + "cm3");
        
        s.setNivoTecnosti(100);
        s.ispij(1.2);
        System.out.println(s.getNivoTecnosti());
        s.ispij(1);
        System.out.println(s.getNivoTecnosti());
        s.napuni(0.8);
        System.out.println(s.getNivoTecnosti());
    }
    
}
