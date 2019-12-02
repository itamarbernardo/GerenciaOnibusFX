/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.uag.ufrpe.IU.controladores;

import java.awt.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author GABRIEL
 */
public class LoginController implements Initializable {
    @FXML
    private Label senha;

    @FXML
    private TextField txtSenha;

    @FXML
    private TextField txtLongin;

    @FXML
    private ToggleGroup grup;

    @FXML
    private Button entrar;

    @FXML
    private Label erroCpf;

    @FXML
    private Label longin;

    @FXML
    private Label erroSenha;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void entrar(ActionEvent event) {
    }
    
}
