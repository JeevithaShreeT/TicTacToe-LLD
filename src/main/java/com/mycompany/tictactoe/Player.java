
package com.mycompany.tictactoe;


public class Player {
    private String name;
    private Symbol sym;

     Player(String name, Symbol sym){
         this.name= name;
         this.sym = sym;
     }    
     
     public String getName(){
         return this.name;
     }
     
     public Symbol getSymbol(){
         return this.sym;
     }
     
    @Override
     public String toString(){
         return this.name+" "+this.sym;
     }
}
