

package com.mycompany.tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TicTacToe {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Player> list = new ArrayList<>();
        
        for(int i=0; i<2; i++){
            String input = sc.nextLine().trim();
            String ipts[] = input.split(" ");
            
            if(ipts.length != 2){
                System.out.println("Invalid inputs try again");
                i--;
                continue;
            }
            
            
            Player p = new Player(ipts[1], Symbol.valueOf(ipts[0]));
            list.add(p);
        }
        
        Game game = new Game(list);
        game.start();
        
        
    }
}
