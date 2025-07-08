

package com.mycompany.tictactoe;


public class Board {
   
    private final int size=3;
    private Cell[][] grid;
    
     public Board(){
          grid = new Cell[size][size];
         
         initialize();
}
    public void initialize(){
        
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                grid[i][j] = new Cell(i,j);
            }
        }
    }
    
    public void printboard(){
        
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(grid[i][j].getSymbol()==null){
                    System.out.print("- ");
                }
                else{
                    System.out.print(grid[i][j].getSymbol()+" ");
                }
            }
            
            System.out.println();
        }
    }
    
    public boolean move(int row, int col, Symbol sym){
        if(row>size || col>size || row<0 || col<0) return false;
        
        if(grid[row][col].isfree()){
            grid[row][col].occupy(sym);
            return true;
        }
        
        return false;
    }
    
    public Symbol getgrid(int row, int col){
        return grid[row][col].getSymbol();
    }
    
    public boolean isBoardFull(){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(grid[i][j].isfree()){
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean Win(Symbol sym){
        //for row win
        for(int i=0; i<size; i++){
            if(grid[i][0].getSymbol()== sym &&
            grid[i][1].getSymbol()== sym && grid[i][2].getSymbol()==sym){
                return true;
            }        
        }
        
        //for col win
        for(int i=0; i<size; i++){
            if(grid[0][i].getSymbol()== sym &&
            grid[1][i].getSymbol()== sym && grid[2][i].getSymbol()==sym){
                return true;
            }        
        }
        
        //for diagonal win
        if(grid[0][0].getSymbol()==sym && grid[1][1].getSymbol()==sym && grid[2][2].getSymbol()==sym){
            return true;
        }
            
        if(grid[0][2].getSymbol()==sym && grid[1][1].getSymbol()==sym && grid[2][0].getSymbol()==sym){
            return true;
        }    
        
        return false;
    }
}
