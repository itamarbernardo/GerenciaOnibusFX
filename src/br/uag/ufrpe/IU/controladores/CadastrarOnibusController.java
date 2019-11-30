/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uag.ufrpe.IU.controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author miyyu
 */
public class CadastrarOnibusController implements Initializable {

    @FXML
    private ComboBox<?> Motoristas;
    @FXML
    private TextField PlacaOnibus;
    @FXML
    private TextField TotalPoltronas;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void CadastrarOnibus(ActionEvent event) {

        
        PlacaOnibus.getText();        
        TotalPoltronas.getText();

    }

    @FXML
    private void Voltar(ActionEvent event) {
    }
    
}
