package libreria;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;
/**
 *
 * @author Gabriele
 */

public class LibreriaGrafica extends JFrame implements ActionListener{
    
      private JFrame f = new JFrame("Libreria");
      private JPanel p = new JPanel();
      private JTextField titolo = new JTextField(20);
      private JTextField autore = new JTextField(20);
      private JTextField prezzo = new JTextField("0", 10);
      private JButton b = new JButton("SALVA");
      
      public LibreriaGrafica(){
          super("Gestore libreria");
          addWindowListener(new GestoreFinestra());
          p.add(new JLabel("Inserisci titolo libro:", JLabel.LEFT));
          titolo.setBackground(Color.yellow);
          titolo.setForeground(Color.blue);
          p.add(titolo);
        
          p.add(new JLabel("Inserisci l'autore del libro:", JLabel.LEFT));
          autore.setBackground(Color.yellow);
          autore.setForeground(Color.blue);
          p.add(autore);
        
          p.add(new JLabel("Inserisci il prezzo del libro:", JLabel.LEFT));
          prezzo.setBackground(Color.yellow);
          prezzo.setForeground(Color.blue);
          p.add(prezzo);
          p.add(new JLabel("€", JLabel.RIGHT));
          
          //bottone per scrivere su file
          b.setBackground(Color.blue);
          b.setForeground(Color.yellow);
          p.add(b, "West");
          
          setLayout(new GridLayout(3, 1, 5, 10));
          add(p);
          b.addActionListener(this);
      }
    
    private void scrivi(){
        Libro libro = new Libro(titolo.getText(), autore.getText(), prezzo.getText());

        Libro.scrivi(libro);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String pulsante = e.getActionCommand();
        Libro libro = null;
        
        if(pulsante.equals("SALVA")){
            scrivi();
        }
    }
        
        
    }
