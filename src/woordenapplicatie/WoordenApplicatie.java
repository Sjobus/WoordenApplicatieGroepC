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
     public String CountWord(String word) {
        // Controleer of de string niet leeg is.
         if (word == null) {
            return "Het totaal aantal woorden is: 0";
        }
        // split de string op spaties, komma's en punten.
        String[] woorden = word.split("[\\s,\\.]+");
        HashSet<String> hash = new HashSet<>();
        // zet de woorden in een HashSet zo dat de dubbelen woorden er uit worden gefiltert.
        for (String i : woorden) {
            hash.add(i.toLowerCase());
        }
        return "Totaal aantal woorden: " + woorden.length + "\n"
                + "Verschillende woorden: " + hash.size();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
