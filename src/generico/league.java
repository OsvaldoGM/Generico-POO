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
public class league<T extends team>  {
    String name;
    ArrayList<T> members = new  ArrayList<>();

    public league(String name) {
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public boolean addTeams(T p){
        if(members.contains(p)){
            System.out.println("Team already in the league");
            return false;
        }
        members.add(p);
        System.out.println(p.getName() +" added to the league : " +this.name);
        return true;
    }
    
    public void showTable(){
        Collections.sort(members);
        for(T hey : members){
            System.out.println(hey.getName() + " : " +hey.ranking());
        }
    }
}
