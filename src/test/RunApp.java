/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import client.Waitress;
import component.MenuComponent;
import composite.Menu;
import leaf.MenuItem;

/**
 *
 * @author Win-7
 */
public class RunApp {
    public static void main(String[] args) {
        MenuComponent cafeDaManhaMenu = new Menu("CAFÉ DA MANHÃ MENU", "café da manhã");
        MenuComponent almocoMenu = new Menu("ALMOÇO MENU", "Almoço");
        MenuComponent sobremesaMenu = new Menu("SOBREMESA MENU", "Sobremesa");
        MenuComponent jantarMenu = new Menu("JANTAR MENU", "Jantar");
        
        MenuComponent allMenus = new Menu("TODOS OS MENUS", "Agora, todos os menus");
        
        allMenus.add(cafeDaManhaMenu);
        allMenus.add(almocoMenu);
        allMenus.add(jantarMenu);
        allMenus.add(sobremesaMenu);
        
        
        cafeDaManhaMenu.add(new MenuItem("Salada de Frutas", "Variedade de frutas com suco de laranja", 15.25));
        almocoMenu.add(new MenuItem("Quibe Vegetariano", "Quibe vegeratiano com molho de ervas", 24.65));
        sobremesaMenu.add(new MenuItem("Bolo", "Bolo de Cenoura com cobertura de chocolate", 5.48));
        almocoMenu.add(sobremesaMenu);
        jantarMenu.add(new MenuItem("Sopa da vovó", "Sopa de Verduras sem massa", 6.00));
        
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
