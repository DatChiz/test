/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author MyPC heo
 */
public class Pig {
//aaa
    private String kind;

    public Pig(String kind) {
        this.kind = kind;
    }

    public Pig() {
    }
    
    

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
    
    

    @Override
    public String toString() {
        return kind;
    }
    
    
}
