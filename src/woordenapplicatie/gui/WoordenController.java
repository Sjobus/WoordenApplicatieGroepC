package woordenapplicatie.gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import woordenapplicatie.WoordenApplicatie;

/**
 * FXML Controller class
 *
 * @author frankcoenen
 */
public class WoordenController implements Initializable {
    
   private static final String DEFAULT_TEXT =   "Een, twee, drie, vier\n" +
                                                "Hoedje van, hoedje van\n" +
                                                "Een, twee, drie, vier\n" +
                                                "Hoedje van papier";
    
    @FXML
    private Button btAantal;
    @FXML
    private TextArea taInput;
    @FXML
    private Button btSorteer;
    @FXML
    private Button btFrequentie;
    @FXML
    private Button btConcordantie;
    @FXML
    private TextArea taOutput;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        taInput.setText(DEFAULT_TEXT);
    }
    
    @FXML
    private void aantalAction(ActionEvent event) {
        WoordenApplicatie wp = new WoordenApplicatie();
        taOutput.setText(wp.CountWord(wp.StringSplitter(taInput.getText()))); 
    }

    @FXML
    private void sorteerAction(ActionEvent event) {
        WoordenApplicatie wp = new WoordenApplicatie();
        taOutput.setText(wp.SorteerWoorden(wp.StringSplitter(taInput.getText())));
    }

    @FXML
    private void frequentieAction(ActionEvent event) {
        WoordenApplicatie wp = new WoordenApplicatie();
        taOutput.setText(wp.FrequentieWoorden(wp.StringSplitter(taInput.getText())));
    }

    @FXML
    private void concordatieAction(ActionEvent event) {
        WoordenApplicatie wp = new WoordenApplicatie();
        taOutput.setText(wp.wordGetLines(taInput.getText()));
    }
   
}
