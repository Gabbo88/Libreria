package libreria;
import input.Input;
/**
 *
 * @author Gabriele
 */
public class Libreria {
    
    public static Libro insLibro(){
        Libro libro;
        
        String titolo = Input.insStringa("Inserisci il titolo del libro: ", "Inserisci il titolo del libro: ");
        String autore = Input.insStringa("Inserisci il nome dell'autore: ", "Inserisci il nome dell'autore: ");
        double prezzo = Input.insDouble("Inserisci il prezzo del libro: ");
        
        return libro = new Libro(titolo, autore, prezzo);
    }
    
    public static void main(String[] args){
        boolean exit = false;
        
        do{
        int risp = Input.insInt("***MENU'***\n"
                + "1. Inserisci nuovo libro all'elenco;\n"
                + "2. Esci;\n"
                + "Fai una scelta valida...  ", 1, 2, "FAI UNA SCELTA VALIDA!\n");
         switch(risp){
                case 1:
                   Libro.scrivi(insLibro());
                   break;
                case 2:
                   exit = true;
                   break; 
         }
        }while(!exit);
    
    }
}
