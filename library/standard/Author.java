/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.standard;

/**
 *
 * @author utilisateur
 */
public class Author {
    
    int idAuthor;
    String nameAuthor;
    
    public Author(){}
    
    public Author(int id_author, String name_author){
        this.idAuthor=id_author;
        this.nameAuthor=name_author;
    }
    
    public int getIdAuthor(){
        return idAuthor;
    }
    public String getNameAuthor(){
        return nameAuthor;
    }
    
    public void setIdAuthor(int id_author){
       this.idAuthor=id_author;
    }
    public void setNameAuthor(String name_author){
        this.nameAuthor=name_author;
    }
    
    public void addAuthor(){
        
    }
    
    public void displayAuthor(){
        
    }
    
    
}
