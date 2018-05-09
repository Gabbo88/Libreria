package libreria;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Gabriele
 */
public class Libro {
    //attributi
    private String titolo, autore;
    private double prezzo;
    
    //costruttore
    public Libro(String titolo, String autore, double prezzo){
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
    }
    public Libro(String titolo, String autore, String prezzo){
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = Double.parseDouble(prezzo);
    }
    
    //metodi

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    
    public void setPrezzo(String prezzo){
        double p = Double.parseDouble(prezzo);
        this.prezzo = p;
    }
    
    public static void scrivi(Libro l){
        try{
            FileWriter f = new FileWriter("Elenco libri.txt", true);
            PrintWriter fOUT = new PrintWriter(f);
            fOUT.println(l.getTitolo() + ";" + l.getAutore() + ";" + l.getPrezzo());
            fOUT.flush();
            f.close();
        }catch(IOException e){}
    }
    
    public String toString(){
        return "Titolo: " + titolo + "\nAutore: " + autore + "\nPrezzo: " + prezzo + "\n";
    }
    
}
