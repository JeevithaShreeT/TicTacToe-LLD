
package com.mycompany.tictactoe;


public class Cell {
     
    private int row;
    private int col;
    private Symbol sym;
    private boolean isOccupied;
    
    Cell(int row, int col){
        this.row=row;
        this.col=col;
        this.sym = null;
        this.isOccupied = false;
    }
    
    public boolean isfree(){
        return !isOccupied;
    }
    
    public void occupy(Symbol sym){
       
        this.sym = sym;
        this.isOccupied = true;
        
    }
    
    public boolean isOccupied(){
        return isOccupied;
    }
    
    public Symbol getSymbol(){
        return this.sym;
    }
}
