/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package woordenapplicatie;

import java.util.HashSet;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author frankcoenen
 */
public class WoordenApplicatie extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("gui/Woorden.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
    // Telt het aantal woorden.
    // zet de woorden in een HashSet zo dat de dubbelen woorden er uit worden gefiltert.
     public String CountWord(String[] woorden) {
       
        HashSet<String> hash = new HashSet<>();
        
        for (String i : woorden) {
            hash.add(i.toLowerCase());
        }
        return "Totaal aantal woorden: " + woorden.length + "\n"
                + "Verschillende woorden: " + hash.size();
    }

     // Split de string en zet ze in een array.
    public String[] StringSplitter(String s)
    {
         // Controleer of de string niet leeg is.
        if (s == null) {
            return null;
       }
        // split de string op spaties, komma's en punten.
       String[] woorden = s.split("[\\s,\\.]+");
        
       return woorden;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
