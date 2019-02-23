/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.standard;

import java.util.ArrayList;
/**
 *
 * @author utilisateur
 */
public class Categorie {
    
    ArrayList<Categorie> C = new ArrayList<Categorie>();
    int idCat;
    String nameCat;
    
    public Categorie(){}
    public Categorie(int id_cat, String name_cat){
        this.idCat = id_cat;
        this.nameCat = name_cat;
    }
    
    public int getIdCat(){
        return idCat;
    }
    public String getNameCat(){
        return nameCat;
    }
    
    public void setIdCat(int id_cat){
        this.idCat=id_cat;
    }
    public void setNameCat(String name_cat){
        this.nameCat=name_cat;
    }
    
    
    public void addCategorie(){
        
    }
    
    public void displayCtegorie(){
        
    }
    
    
}
