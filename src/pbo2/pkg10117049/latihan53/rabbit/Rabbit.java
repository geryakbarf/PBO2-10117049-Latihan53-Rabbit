/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan53.rabbit;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program informasi seputar kelinci
 */
public class Rabbit extends Animal{
    private String color;
    private String name;

    
    public Rabbit(String name,boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.name=name;
        this.vegetarian=veg;
        this.eats=food;
        this.noOfLegs=legs;
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    
    
}
