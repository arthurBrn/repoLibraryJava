/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice;


import java.util.regex.*;
import java.util.Scanner;


/**
 *
 * @author utilisateur
 */
public class Person {
    Scanner scanner=new Scanner(System.in);
    
    String Fname;
    String Lname;
    int age;
    String mail;
    String statut;
    
    public Person(){}
    
    Person(String nameF, String nameL, int anAge, String aMail, String statut){
        this.Fname = nameF;
        this.Lname = nameL;
        this.age=anAge;
        this.mail=aMail;
        this.statut=statut;
    }
     
    
    public String getFirstName(){        return this.Fname;    }    
    public String getLastName(){        return this.Lname;    }
    public int getAge(){        return this.age;    }
    public String getMail(){        return this.mail;   }
    public String getStatut(){        return this.statut;    }
  
    public void setFirstName(String thing){        this.Fname = thing;    }
    public void setLastName(String da){        this.Lname = da;    }
    public void setAge(int la){        this.age=la;}
    public void setMail(String mail){        this.mail=mail;}
    public void setStatut(String statut){        this.statut=statut;}
    
    
    
    public void createPerson(){
        System.out.println("Enter last name : ");
        this.setLastName(scanner.nextLine());
        
        System.out.println("Enter first name : ");
        this.setFirstName(scanner.nextLine());
        
        System.out.println("Enter age : ");
        this.setAge(scanner.nextInt());
        
        
        System.out.println("Enter mail : ");
        this.setMail(scanner.nextLine());
        
        
        System.out.println("Enter staut : ");
        this.setStatut(scanner.nextLine());
    }
    
    
    
    
    
    
    
    public void verifIdentity(){}
    
    
    public boolean verifMail(String anEmail){
        boolean bol=false;
        
        String regexOneM="[*A-Za-z][*0-9]";
        String regexTwoM="[*A-Za-z]";
        String regexThreeM="[*a-z]";
        String bla[];
        
        
        
        if(anEmail.contains("@")){
            bla = anEmail.split("@");
            if(bla[0].matches(regexOneM) && bla[1].matches(regexTwoM) && bla[2].matches(regexThreeM)){
                bol=true;
            }
            else{
                bol = false;
            }
            
        }
        else{
            System.out.println("");
            bol=false;
        }
                
        return bol;
    }
    
    
}

