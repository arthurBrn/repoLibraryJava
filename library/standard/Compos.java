/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.standard;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import library.standard.Book;

/**
 *
 * @author utilisateur
 */
public class Compos {
    
    public static void main(String[] args){
        
        Scanner output = new Scanner(System.in);
        
        Book book = new Book();
        Categorie cat = new Categorie();
        Author author = new Author();
        
        
        System.out.println("##########");
        System.out.println("## MENU ##");
        System.out.println("##########");
        System.out.println("");
        System.out.println("1. Add a new book"); // Add a book to our library 
        System.out.println("2. Display all the book"); // Display all the book contained in our library
        System.out.println("3. Search for an author"); // Display all the book of the author stored in our library 
        System.out.println("4. Search for a book"); // Display all the information of the book
        System.out.println("");
        System.out.println("Enter the number of the option you want : ");
        int res = output.nextInt();
        
        switch(res){
            case 1:
                book.createBook();
                book.LI.add(book);
                
                break;
                
            case 2:
                
                System.out.println("Entrer une date yyy mm dd");
                String r= output.nextLine();
                
                if(book.entrerDateDebut(r)){
                    System.out.println("vrai");
                }
                else{
                    System.out.println("Faux");
                }
                
                
                break;
                
            case 3:
                break;
                
            case 4 :
                break;
        }
                
        
        
        System.out.println("Size: " + book.LI.size());
        
        for(int i=0; i<book.LI.size(); i++){
            System.out.println("RES : " + book.LI.get(i).getBookName());
        }
        
    }
        
      
    
    
}
