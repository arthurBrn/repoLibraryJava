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
import library.standard.Author;

/**
 *
 * @author utilisateur
 */
public class Book {

    Scanner output = new Scanner(System.in);

    int idBook;
    String bookName;
    int price;
    boolean bought;
    boolean startReading;
    boolean readB;
    String dateDPattern;
    Date dateD;
    String dateFPattern;
    Date dateF;
    String lang;
    Author anAuthor;
    Categorie aCat;

    public Book() {
    }

    public Book(int idBook, String bookName, int price, boolean bought, boolean startReading, boolean readB, String dateDPattern, Date dateD, String dateFPattern, Date dateF, String lang, Author unAuteur, Categorie uneCat) {
        this.idBook = idBook;
        this.bookName = bookName;
        this.price = price;
        this.bought = bought;
        this.startReading = startReading;
        this.readB = readB;
        this.dateDPattern = dateDPattern;
        this.dateD = dateD;
        this.dateFPattern = dateFPattern;
        this.dateF = dateF;
        this.lang = lang;
        this.anAuthor = unAuteur;
        this.aCat = uneCat;
    }

    // ===================
    // ===== GETTERS =====
    // ===================
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

    public boolean getStartReading() {
        return startReading;
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

    public Author getAuthor() {
        return anAuthor;
    }

    public Categorie getCat() {
        return aCat;
    }

    // ===================
    // ===== SETTERS =====
    // ===================
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

    public void setStartReading(boolean start_reading) {
        this.startReading = start_reading;
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

    public void setAuthor(Author authorName) {
        this.anAuthor = authorName;
    }

    public void setCat(Categorie cat) {
        this.aCat = cat;
    }

    // ===================
    // ===== METHODS =====
    // ===================
    public void createBook() {

        /*
        * Add author chosing
        * Add categorie chosing
        * If "have you started to read the book" is false then "Have you finish the book yet" isn't asked.
        
         */
        boolean bo = false;
        boolean boo = false;

        System.out.println("Enter the book name : ");// regex
        this.setBookName(output.nextLine());

        System.out.println("Have you bought the book? (yes / no) ");
        String rp = output.nextLine();
        if (rp.charAt(0) == 'y') {
            this.setBought(true);
            System.out.println("Enter the book price in € : ");
            this.setPrice(output.nextInt());
        } else {
            this.setBought(false);
        }

        output.nextLine();

        System.out.println("Have you start reading this book? (yes/no)");
        String rep = output.nextLine();
        if (rep.charAt(0) == 'y') {
            this.setStartReading(true);
            do {
                System.out.println("Enter the date you started to read the book (yyyy/mm/dd) : ");
                String chaine = output.nextLine();
                if (entrerDateDebut(chaine)) {
                    bo = true;
                } else {
                    bo = false;
                }
            } while (bo == false);
        } else {
            this.setStartReading(false);
        }

        System.out.println("Have you finish the book yet? (yes / no) ");
        String pr = output.nextLine();
        if (pr.charAt(0) == 'y') {
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

        /*        // Finish the author name and cat name here.
        System.out.println("Who was the author of " + this.getBookName() + " ?"); // regex
        this.setAuthor(output.nextLine().toString());
         */
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
            System.out.println("class Book, méthode : enterDateDebut(), catch failed");
        }
        return bol;
    }

    public boolean entrerDateFin(String chaine) {
        boolean lob = false;
        String Pattern = "yyyy/mm/dd";
        SimpleDateFormat st = new SimpleDateFormat(Pattern);

        this.setDateFPattern(chaine);
        try {
            dateF = st.parse(dateFPattern);
        } catch (Exception e) {
            System.out.println("Class Book, méthode entrerDateFin(), catch failed:");
            System.out.println(e);
        }
        return lob;
    }

    public void displayBooks() {
        /*
        * Display author
        * Display categorie
        * Fix the date display bug 
         */
        System.out.println("================");
        System.out.println("===== BOOK =====");
        System.out.println("================");

        System.out.println("Name : " + this.getBookName());

        if (this.getPrice() == 0) {
            System.out.println("Ptice : unknown");
        } else {
            System.out.println("Price : " + this.getPrice() + "€");
        }

        if (this.getBought() == true) {
            System.out.println("Bought : yes");
        } else {
            System.out.println("Bought : no");
        }

        if (this.getReadB() == true) {
            System.out.println("Book finished : yes");
        } else {
            System.out.println("Book finished : no");
        }

        if (this.getDateD() == null) {
            System.out.println("Date start : not started yet");
        } else {
            System.out.println("Date start : " + this.getDateD());
        }

        if (this.getDateF() == null) {
            System.out.println("Date end : not finished yet");
        } else {
            System.out.println("Date end : " + this.getDateF());
        }
        System.out.println  ("Language : " + this.getLang());

        //System.out.println("Author : " + this.getAuthor());
        //System.out.println("Categorie : " + this.getCat());
    }

    public void deleteBook() {
        // 1-> Use some function of the arraylist to suppress a particular book of the arraylist
    }

}
