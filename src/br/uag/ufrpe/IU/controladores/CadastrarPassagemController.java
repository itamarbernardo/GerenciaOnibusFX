/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uag.ufrpe.IU.controladores;

import br.uag.ufrpe.negocio.fachada.FachadaFuncionario;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import br.uag.ufrpe.negocio.NegocioPassagem;
import br.uag.ufrpe.negocio.entidades.Passagem;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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
public class CadastrarPassagemController implements Initializable {
    
    ObservableList tipoAssentoList = FXCollections.observableArrayList("Convencional", "Obeso", "Parcialmente Reclinável", "Totalmente Reclinável");
    ObservableList tipoGratuidadeList = FXCollections.observableArrayList("Idoso", "ID Jovem", "Parcial Idoso", "Parcial ID Jovem");
       
    private FachadaFuncionario fachadaFuncionario;
    
    @FXML
    private TextField NomePassageiro;
    @FXML
    private TextField PrecoPassagem;
    @FXML
    private TextField TipoDeAssento;
    @FXML
    private ToggleGroup TipoDeTarifa;
    @FXML
    private RadioButton PossuiCriancaColo;
    @FXML
    private TextField TipoGratuidade;
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
    @FXML
    private TextField numeroPoltrona;
           
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }  
    
    public CadastrarPassagemController() {
        fachadaFuncionario = FachadaFuncionario.getFachadaFuncionario();
    }


    @FXML
    private void CadastrarPassagem(ActionEvent event) {
        
        Alert alertaErro = new Alert(Alert.AlertType.ERROR);
        alertaErro.setTitle("Erro");
        alertaErro.setHeaderText("Erro ao preencher os dados");
        
        Alert alertaConfirmacao = new Alert(Alert.AlertType.CONFIRMATION);
        alertaConfirmacao.setTitle("Confirmação");
        alertaConfirmacao.setHeaderText("Passagem Cadastrada com sucesso!");
        
        boolean verifica = true;
        
        
        String preco = PrecoPassagem.getText();
        boolean eDentroDoEstado;
        boolean possuiServicoBordo;
        boolean possuiCriancaColo;
        
        
        switch (TipoDeAssento.getText()) {
            case "TotalReclinavel":
              break;
                        
            case "Reclinavel":
              break;
                
            case "Obeso":
                break;
                
            case "Convencional":
                break;

            default:
                alertaErro.setContentText("Erro ao preencher os dados!");
                alertaErro.show();
                verifica = false;
        }
        
        
        
        
        
        if(Municipal.isSelected()){
            eDentroDoEstado = true;
        }
        else if(Estadual.isSelected()){
            eDentroDoEstado = false;
        }
        
        
        if(PossuiLanche.isSelected()){
            possuiCriancaColo = true;
        }
        else if(NaoPossuiLanche.isSelected()){
            possuiCriancaColo = false;
        }
        
        
        if(PossuiCriancaColo.isSelected()){
            possuiServicoBordo = true;
        }
        else if(NaoPossuiCriancaColo.isSelected()){
            possuiServicoBordo = false;
        }
            
        
        
        
        if (verifica) {
            try {
                int codigo;
                
                codigo = fachadaFuncionario.adicionarPassagem(passageiro, preco, eDentroDoEstado, codigoPoltrona, tipoAssento, tipoDeGratuidade, possuiCriancaColo, possuiServicoBordo);
                alertaConfirmacao.setAlertType(Alert.AlertType.CONFIRMATION);
                alertaConfirmacao.setContentText("Passagem cadastrada com sucesso!\nCódigo da Passagem: " + codigo);
                alertaConfirmacao.show();

            } catch (Exception ex) {
                ex.printStackTrace();
                alertaErro.setContentText(ex.getMessage());
                alertaErro.show();

            }
            
        } else {
            alertaErro.setContentText("Erro ao preencher os dados!");
            alertaErro.show();
        }
 
    }

    @FXML
    private void Voltar(ActionEvent event) {
    }


}

    @FXML
    private void Voltar(ActionEvent event) {
    }
