/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import component.MenuComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Win-7
 */
public class Menu extends MenuComponent{
    private List menuComponents = new ArrayList();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }
    
    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }
    
    public List getMenuComponent() {return menuComponents;}
    public String getName() {return name;}
    public String getDescription() {return description;}
    
    @Override
    public void print(){
        System.out.print("\n" + getName());
        System.out.println(","+ getDescription());
        System.out.println("--------------------");
        Iterator iterator = menuComponents.iterator();
        while(iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }
    
}
