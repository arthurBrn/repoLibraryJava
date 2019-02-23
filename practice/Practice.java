/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice;


import java.util.Scanner;


/**
 * 
 * 
 *
 * @author utilisateur
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner output = new Scanner(System.in);
        Person Simon = new Person();
        Person gen= new Person();
        int choice=0;
        
        System.out.println("##### MENU #####");
        
        System.out.println("1. Declare a new person");
        
        
        System.out.println("Chose your option");
        choice = output.nextInt();
        
        
        /*switch(choice){
            case 1:
                gen.createPerson();
        }*/
        
        
        output.nextLine();

        System.out.println("Enter your email please : ");
        String anEmail = output.nextLine();
        
        
        String regexOneM="[*A-Za-z][*0-9]";
        String regexTwoM="[*A-Za-z]";
        String bla[];
        
        
        
        if(anEmail.contains("@")){
            bla = anEmail.split("@");
            System.out.println("len : " + bla.length);
            System.out.println("1 : " + bla[0]);
            System.out.println("2 : " + bla[1] );
            if(bla[0].matches(regexOneM) && bla[1].matches(regexTwoM)){
                System.out.println("Your email : " + anEmail + " have been approved.");
            }
            else{
                System.out.println("On est dans le else qui contient un  @ donc c'est bon signe");
            }
            
        }
        else{
            System.out.println("Ok cest un peu la merde o est dans le dernier if");
        }
        
        
        
        
    }    
}




























