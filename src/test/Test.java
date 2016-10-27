/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author MyPC
 */
public class Test {

    /**
     * @param args the command line arguments con heo
     */
    public static void main(String[] args) {
        Pig p1 = new Pig("Heo Lái");
        Pig p2 = null;
        Pig p3 = new Pig("Heo Béo");
        
        p2 = p1;
        p1 = p3;
        
        p1.setKind("Heo Bự");
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
    
}
