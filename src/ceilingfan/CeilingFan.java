/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceilingfan;

import java.util.Scanner;
import modules.Fan;

/**
 *
 * @author Nurlybek
 */
public class CeilingFan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter one of the following commands:");
        System.out.println("1 - Speed Up");
        System.out.println("2 - Reverse Direction");
        System.out.println("3 - exit");
        int choice = -1;
        Fan fan = new Fan();
        do {
             
            
            Scanner scanchoice = new Scanner(System.in);
            System.out.println();
            System.out.println("Enter \"1\", \"2\" or \"3\"");
            choice = scanchoice.nextInt();

                if (choice < 1 || choice > 3) {

                    System.out.println("Enter \"1\", \"2\", \"3\"");
                    choice = scanchoice.nextInt();

                }

                else if(choice == 1) {
                    fan.speedUp();
                }
                else if(choice == 2) {
                    fan.changeDirection();
                }
                else if(choice == 3) {
                    System.exit(0);
                }

        }while (choice != 3); 
       
    }
    
    
    
}
