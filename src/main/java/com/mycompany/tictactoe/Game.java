
package com.mycompany.tictactoe;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


public class Game {
       
      private Board board;
     
      private Queue<Player> player;
      
      Game(List<Player> player){
            this.player = new LinkedList<>(player);
            
            this.board = new Board();
            
      }
      
      
      public void start(){
          
          board.printboard();
          Scanner sc = new Scanner(System.in);
          
          while(true){
             
              String moves = sc.nextLine().trim();
              
              if(moves.equalsIgnoreCase("exit")){
                  break;
              }
              
              String[] rocol = moves.split(" ");
              
              if(rocol.length < 2) {
                  System.out.println("Invaild move");
                  continue;
              }
              
              int i= Integer.parseInt(rocol[0])-1;
              int j= Integer.parseInt(rocol[1])-1;
              
              Player current = player.peek();
              
              if(!board.move(i, j, current.getSymbol())){
                  System.out.println("Invalid move");
                 
                  continue;
              }
              
              
     
              if(board.Win(current.getSymbol())){
                  System.out.println(current.getName()+" wins the game.");
                  break;
              }
              
              if(board.isBoardFull()){
                  System.out.println("Its a draw");
                  System.out.println("Game Over");
                  break;
              }
              
              board.printboard();
              System.out.println();
              player.poll();
              player.offer(current);
              
          }
          
          sc.close();
          
      }
}
