/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uag.ufrpe.IU.controladores;

import br.uag.ufrpe.negocio.NegocioPassageiro;
import br.uag.ufrpe.negocio.fachada.FachadaFuncionario;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import br.uag.ufrpe.negocio.NegocioPassagem;
import br.uag.ufrpe.negocio.NegocioPassageiro;
import br.uag.ufrpe.negocio.entidades.Passageiro;
import br.uag.ufrpe.negocio.entidades.Passagem;
import br.uag.ufrpe.negocio.excecoes.passageiro.PassageiroNaoExisteException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    
    private FachadaFuncionario fachadaFuncionario;
    
    @FXML
    private TextField IdentificarPassageiro;
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
    private void CadastrarPassagem(ActionEvent event) throws PassageiroNaoExisteException {
        
        Alert alertaErro = new Alert(Alert.AlertType.ERROR);
        alertaErro.setTitle("Erro");
        alertaErro.setHeaderText("Erro ao preencher os dados");
        
        Alert alertaConfirmacao = new Alert(Alert.AlertType.CONFIRMATION);
        alertaConfirmacao.setTitle("Confirmação");
        alertaConfirmacao.setHeaderText("Passagem Cadastrada com sucesso!");
        
        boolean verificaPassagem = true;
        // -----------------
        
        String cpf = IdentificarPassageiro.getText();
        
        if(cpf.length() < 11 || cpf.isEmpty() || !cpf.matches("[0-9]*") ){
            alertaErro.setContentText("Erro ao preencher os dados!");
            alertaErro.show();
            verificaPassagem = false;
        }
        
        Passageiro verificaCPF  = fachadaFuncionario.procurarPassageiro(cpf);
                
        if(verificaCPF == null){
            alertaErro.setContentText("Erro! CPF não existe.");
            alertaErro.show();
            verificaPassagem = false;
        }
        
        // ------------------------
        
        String preco = PrecoPassagem.getText();
        if(preco.isEmpty()){
            alertaErro.setContentText("Erro! Campo preço de passagem vazio");
            alertaErro.show();
            verificaPassagem = false;
        }
        
        //preco.replaceAll(",", ".");
        double precoDouble = Double.parseDouble(preco);
        
        String assentoTipo = TipoDeAssento.getText();
                
        String codigoP = numeroPoltrona.getText();
        int codigoPoltrona = Integer.parseInt(codigoP);
        
        String tipoDeGratuidade = TipoGratuidade.getText();
        
        switch (tipoDeGratuidade) {
            case "Idoso":
              verificaPassagem = true;
              break;
                        
            case "IdJovem":
              verificaPassagem = true;
              break;
                
            case "ParcialIdoso":
                verificaPassagem = true;
                break;
                
            case "ParcialIdJovem":
                verificaPassagem = true;
                break;
            case "Normal":
                verificaPassagem = true;
                break;

            default:
                alertaErro.setContentText("Erro ao preencher os dados!");
                alertaErro.show();
                verificaPassagem = false;
        }        
        
        boolean eDentroDoEstado = false;
        boolean possuiServicoBordo = false;
        boolean possuiCriancaColo = false;
         // -----------------
        
        switch (assentoTipo) {
            case "TotalReclinavel":
              verificaPassagem = true;
              break;
                        
            case "Reclinavel":
              verificaPassagem = true;
              break;
                
            case "Obeso":
                verificaPassagem = true;
                break;
                
            case "Convencional":
                verificaPassagem = true;
                break;

            default:
                alertaErro.setContentText("Erro ao preencher os dados!");
                alertaErro.show();
                verificaPassagem = false;
        }        
        // ----------------
        
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
        
        else if(!Municipal.isSelected() || !Estadual.isSelected() || !PossuiLanche.isSelected() || !NaoPossuiLanche.isSelected() || !PossuiCriancaColo.isSelected() || !NaoPossuiCriancaColo.isSelected()){
                alertaErro.setContentText("Alguns dados não fora preenchidos!");
                alertaErro.show();
                verificaPassagem = false;
        }
        // -----------------------
            
        
        
        
        if (verificaPassagem) {
            try {
               
                int codigo;
                
                codigo = fachadaFuncionario.adicionarPassagem(verificaCPF, precoDouble, eDentroDoEstado, codigoPoltrona, assentoTipo, tipoDeGratuidade, possuiCriancaColo, possuiServicoBordo);
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

