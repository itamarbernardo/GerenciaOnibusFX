/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uag.ufrpe.IU.controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import br.uag.ufrpe.negocio.NegocioPassagem;
import br.uag.ufrpe.negocio.entidades.Passagem;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Emily Santos
 */
public class TelaGerenciarPassagemController implements Initializable {
    
    ObservableList tipoAssentoList = FXCollections.observableArrayList("Convencional", "Obeso", "Parcialmente Reclinável", "Totalmente Reclinável");
    ObservableList tipoGratuidadeList = FXCollections.observableArrayList("Idoso", "ID Jovem", "Parcial Idoso", "Parcial ID Jovem");
       
    @FXML
    private TextField NomePassageiro;
    @FXML
    private TextField PrecoPassagem;
    @FXML
    private ChoiceBox<String> TipoDeAssento;
    @FXML
    private ToggleGroup TipoDeTarifa;
    @FXML
    private RadioButton PossuiCriancaColo;
    @FXML
    private ChoiceBox<?> TipoGratuidade;
    @FXML
    private ToggleGroup ServicoBordo;
    @FXML
    private RadioButton Municipal;
    @FXML
    private RadioButton PossuiLanche;
    @FXML
    private RadioButton Estadual;
    @FXML
    private RadioButton NaoPossuiLanche;
    @FXML
    private RadioButton NaoPossuiCriancaColo;
           
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }  


    @FXML
    private void CadastrarPassagem(ActionEvent event) {
        
        String preco = PrecoPassagem.getText();
        boolean eDentroDoEstado;
        boolean possuiServicoBordo;
        boolean possuiCriancaColo;
        
        //Toggle tipoTarifa = TipoDeTarifa.getSelectedToggle();
        
        if(Municipal.isSelected()){
            eDentroDoEstado = true;
        }        
        eDentroDoEstado = false;
        
        
        if(PossuiLanche.isSelected()){
            possuiCriancaColo = true;
        }
        possuiCriancaColo = false;
        
        
        if(PossuiCriancaColo.isSelected()){
            possuiServicoBordo = true;
        }
        possuiServicoBordo = false;
 
    }


}
