/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaf;

import component.MenuComponent;

/**
 *
 * @author Win-7
 */
public class MenuItem extends MenuComponent{
    private String name;
    private String description;
    private double price;

    public MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {return name;}
    public String getDescription() {return description;}
    public double getPrice() {return price;}
    
    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(",  "+ getPrice());
        System.out.println(" --"+ getDescription());
    }
    
}
