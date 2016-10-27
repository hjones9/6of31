/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6of31;

import java.util.Scanner;

/**
 *
 * @author Hailey.Jones
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a whole number");
        int y=reader.nextInt();
        
        for(int q= 0; q<=y; q++){
            System.out.println(q*2);
        }
        
        // TODO code application logic here
    }
    
}
