/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generico;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Alumno
 */
public class Generico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        items.add("kdjasfh");
        items.add(3f);
        items.add(3.65465);
        */
        FootballPlayer jorge = new FootballPlayer("Jorge");
        FootballPlayer naranja = new FootballPlayer("Naranja");
        FootballPlayer azul = new FootballPlayer("Azul");
        FootballPlayer verde = new FootballPlayer("verde");
        FootballPlayer negro = new FootballPlayer("Negro");
        FootballPlayer genero = new FootballPlayer("Genero");
        FootballPlayer tsm = new FootballPlayer("TSM");
        FootballPlayer c9 = new FootballPlayer("C9");
        FootballPlayer p1 = new FootballPlayer("P1");
        
        team<FootballPlayer> huracanes = new team<>("Huracanes");
        team<FootballPlayer> atun = new team<>("Atun");
        team<FootballPlayer> inmortals = new team<>("Inmortals");
        
        huracanes.addPlayer(jorge);
        huracanes.addPlayer(naranja);
        huracanes.addPlayer(azul);
        
        atun.addPlayer(verde);
        atun.addPlayer(negro);
        atun.addPlayer(genero);
        
        inmortals.addPlayer(tsm);
        inmortals.addPlayer(c9);
        inmortals.addPlayer(p1);
        
        league<team<FootballPlayer>> campeon = new league<>("Campeon");
        
        huracanes.matchResult(atun, 1, 0);
        atun.matchResult(inmortals, 8, 3);
        inmortals.matchResult(huracanes, 2, 4);
        
        campeon.addTeams(huracanes);
        campeon.addTeams(atun);
        campeon.addTeams(inmortals);
        
        huracanes.ranking();
        atun.ranking();
        inmortals.ranking();
        
        campeon.showTable();
    }
    
}
