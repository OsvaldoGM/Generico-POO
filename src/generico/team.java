/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generico;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class team<T extends Player> implements Comparable<team<T>> {
    String name;
    int win = 0 ;
    int draw = 0 ;
    int lose = 0;
    int played = 0;
    ArrayList<T> members = new  ArrayList<>();

    public team(String name) {
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public boolean addPlayer(T p){
        if(members.contains(p)){
            System.out.println("Player already in team");
            return false;
        }
        members.add(p);
        System.out.println(p.getName() +" got picked up for the team : " +this.name);
        return true;
    }
    
    public int numPlayer(){
        return this.members.size();
    }
    
    public void matchResult( team<T> opponent, int ourScore, int theirScore){
        String message;
        
        if(ourScore>theirScore){
            win++;
            message = " beat ";
        }else if(ourScore == theirScore){
            draw++;
            message =  " draw with ";
        }else{
            lose++;
            message = " lost to ";
        }
        played ++;
        if(opponent != null){
            System.out.println(this.getName() +message +opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }
    
    public int ranking(){
        return(win*2)+draw;
    }
    
    /*public int compare(team<T> p1) {
        return p1.getName().compareTo(this.getName());
    }*/
    
    @Override
    public int compareTo(team<T> team){
        if(this.ranking()>team.ranking()){
            return -1;
        }else if(this.ranking()<team.ranking()){
            return 1;
        }else{
            return 0;
        }
    }
}
