/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package woordenapplicatie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
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
        String[] woorden = s.toLowerCase().split("[\\s,\\.]+");
        
       return woorden;
    }
    
    // Zet de String[] in een TreeSet. de treeset word dan weer op omgekeerdealfabetische voolgorde gesorteerd.
    public String SorteerWoorden(String[] woorden)
    {               
        String returnString = "";
        TreeSet<String> tree = new TreeSet<String>(Arrays.asList(woorden));        
        tree = (TreeSet) tree.descendingSet();
        for(String s : tree){
            returnString = returnString + s + "\n";
        }        
        return returnString;
    }
    
    public String FrequentieWoorden(String[] woorden)
    {
        String returnString = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String w : woorden)
        {
            Integer n = map.get(w);
            if(n == null)
                n = 1;
            else
                n++;
            map.put(w, n);
        }
        List list = new LinkedList(map.entrySet());
        Collections.sort(list, new Comparator()
        {
            public int compare(Object object1, Object object2)
            {
                //Vergelijk values van twee entrys
                return ((Comparable) ((Map.Entry) (object1)).getValue()).compareTo(((Map.Entry) (object2)).getValue());
            }
        });
        HashMap gesorteerdeMap = new LinkedHashMap();
        for(Iterator i = list.iterator(); i.hasNext();)
        {
            Map.Entry entry = (Map.Entry) i.next();
            gesorteerdeMap.put(entry.getKey(), entry.getValue());
            returnString += entry.getKey().toString() + " : " + entry.getValue().toString() + "\n";
        }
        return returnString;
    }
    
    public String wordGetLines( String str)
    {   HashSet<String> words = new HashSet<String>(Arrays.asList(str.toLowerCase().split("[\\s,\\.]+")));    
        String[] lines = str.toLowerCase().split("\n");
        HashMap<String, List<Integer>> concurencyMap = new HashMap<>();
        int ctr = 1;
        for (String line : lines) {
            for (String word : words) {
                if (line.contains(word)) {
                    List<Integer> concurency = (concurencyMap.get(word)== null) ?
                            new ArrayList<>() : concurencyMap.get(word);
                    concurency.add(ctr);
                    concurencyMap.put(word, concurency);
                }
            }
            ctr++;

        }
        String output = "";
        for (String value : concurencyMap.keySet()) {
            output += value + ": \t" + concurencyMap.get(value) + "\n";
        }        
        return output;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
