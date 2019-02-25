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
import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author utilisateur
 */
public class Compos {
    
    public static void main(String[] args){
        
        ArrayList<Book> list = new ArrayList<Book>(); // Notre arrayList
               
        Scanner output = new Scanner(System.in);

        Book book = new Book();
        Categorie cat = new Categorie();
        Author author = new Author();
        boolean composer = false;
        
        do{
        System.out.println("##########");
        System.out.println("## MENU ##");
        System.out.println("##########");
        System.out.println("");
        System.out.println("1. Add a new book"); // Add a book to our library 
        System.out.println("2. Display all the book"); // Display all the book contained in our library
        System.out.println("3. Search for an author"); // Display all the book of the author stored in our library 
        System.out.println("4. Search for a book"); // Display all the information of the book
        System.out.println("5. Exit application");
        System.out.println("");
        System.out.println("Enter the number of the option you want : ");
        int res = output.nextInt();
        
        switch(res){
            case 1:
                
                // Something missing here, to create a book and then we had it 
                try{
                    book.createBook();
                }catch(Exception e){
                    System.out.println("Erreur main, case 1 : book.creatBook()");
                    System.out.println(e);
                }
                
                try{
                    list.add(book);
                }catch(Exception e){
                    System.out.println("Erreur main, case 1: list.add(book)");
                    System.out.println("e : " + e);
                }
                ListIterator<Book> iterator = list.listIterator(); // Notre itérateur avec la méthode HasNext();
                try{
                    while(iterator.hasNext()){
                    iterator.next().displayBooks();
                }
                }catch(Exception e){
                    System.out.println("Erreur main, case1 : while(iterator.hasNext())"); 
                    System.out.println("e : " + e);
                }    
                break;
                
            case 2:
                            
                
                
                break;
                
            case 3:
                break;
                
            case 4 :
                break;
            case 5:
                System.out.println("================================");
                System.out.println("================================");
                System.out.println("===== HAVE A VERY NICE DAY =====");
                System.out.println("================================");
                System.out.println("================================");
                composer=true;
                break;
        }
                
        
     
        }while(composer==false);
    }
        
      
    
    
}
