/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * ALT MAJ F identation !
 */
package library.standard;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author utilisateur
 */
public class Book {

    Scanner output = new Scanner(System.in);
    //Arraylist 
    ArrayList<Book> LI = new ArrayList<Book>();

    int idBook;
    String bookName;
    int price;
    boolean bought;
    boolean readB;
    String dateDPattern;
    Date dateD;
    String dateFPattern;
    Date dateF;
    String lang;
    Author unAuteur;
    Categorie uneCat;
    // idAuthor ici 
    // idCat ici

    public Book() {
    }

    public Book(int idBook, String bookName, int price, boolean bought, boolean readB, String dateDPattern, Date dateD, String dateFPattern, Date dateF, String lang, Author unAuteur, Categorie uneCat) {
        this.idBook = idBook;
        this.bookName = bookName;
        this.price = price;
        this.bought = bought;
        this.readB = readB;
        this.dateDPattern = dateDPattern;
        this.dateD = dateD;
        this.dateFPattern = dateFPattern;
        this.dateF = dateF;
        this.lang = lang;
        this.unAuteur = unAuteur;
        this.uneCat = uneCat;
    }

    public int getIdBook() {
        return idBook;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPrice() {
        return price;
    }

    public boolean getBought() {
        return bought;
    }

    public boolean getReadB() {
        return readB;
    }

    public String getDateDPattern() {
        return dateDPattern;
    }

    public Date getDateD() {
        return dateD;
    }

    public String getDateFPattern() {
        return dateFPattern;
    }

    public Date getDateF() {
        return dateF;
    }

    public String getLang() {
        return lang;
    }

    public void setIdBook(int id_book) {
        this.idBook = id_book;
    }

    public void setBookName(String book_name) {
        this.bookName = book_name;
    }

    public void setPrice(int thePrice) {
        this.price = thePrice;
    }

    public void setBought(boolean is_bought) {
        this.bought = is_bought;
    }

    public void setReadB(boolean is_read) {
        this.readB = is_read;
    }

    public void setDateDPattern(String uneDateDPattern) {
        this.dateDPattern = uneDateDPattern;
    }

    public void setDateD(Date date_debut) {
        this.dateD = date_debut;
    }

    public void setDateFPattern(String uneDateFPattern) {
        this.dateFPattern = uneDateFPattern;
    }

    public void setDateF(Date date_fin) {
        this.dateF = date_fin;
    }

    public void setLang(String en_ou_fr) {
        this.lang = en_ou_fr;
    }

    public void createBook() {

        boolean bo = false;
        boolean boo = false;

        System.out.println("Enter the book name : ");
        this.setBookName(output.nextLine());
        // regex?

        System.out.println("Have you bought the book? (yes / no) ");
        String rp = output.nextLine();
        if (rp.charAt(0) == 'y') {
            this.setBought(true);
            System.out.println("Enter the book price in € : ");
            this.setPrice(output.nextInt());
        } else {
            this.setBought(false);
        }

        do {
            System.out.println("Enter the date you started to read the book (yyyy/mm/dd) : ");
            String chaine = output.nextLine();
            if (entrerDateDebut(chaine)) {
                bo = true;
            } else {
                bo = false;
            }
        } while (bo == false);

        System.out.println("Have you finish the book yet? (yes / no) ");
        String pr = output.nextLine();
        if (rp.charAt(0) == 'y') {
            this.setReadB(true);
        } else {
            this.setReadB(false);
        }

        if (this.getReadB() == true) {
            do {
                System.out.println("Enter the date you finished the book (yyyy/mm/dd) : ");
                String s = output.nextLine();
                if (entrerDateFin(s)) {
                    boo = true;
                } else {
                    boo = false;
                }
            } while (boo = false);
        }

        //How to deal with both en and fr being type in ?
        System.out.println("Enter the language in wich you read it (en/fr): ");
        this.setLang(output.nextLine());
    }

    public boolean entrerDateDebut(String chaine) {
        boolean bol = false;
        String pattern = "yyyy/mm/dd";
        SimpleDateFormat st = new SimpleDateFormat(pattern);

        this.setDateDPattern(chaine);
        try {
            dateD = st.parse(dateDPattern);
            bol = true;
            System.out.println("book::entrerDateDebut, success");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("book::enterDateDebut, catch failed");
        }
        return bol;
    }

    public boolean entrerDateFin(String chaine) {
        boolean lob = false;
        String Pattern = "yyyy/mm/dd";
        SimpleDateFormat st = new SimpleDateFormat();

        this.setDateFPattern(chaine);
        try {
            this.setDateF(st.parse(dateFPattern));
            System.out.println("book::entrerDateFin, success");
        } catch (Exception e) {
            System.out.println("Méthode Book:entrerDateFin, erreur catch :");
            System.out.println(e);
        }
        return lob;
    }

    public void displayBooks() {
    }

    public void addBook() {
        // 1-> use the add function of the arraylist to add book to the arraylsit
    }

    public void deleteBook() {
        // 1-> Use some function of the arraylist to suppress a particular book of the arraylist
    }

    
}
