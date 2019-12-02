/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uag.ufrpe.IU.controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Itamar Jr
 */
public class GerenteController implements Initializable {

    private Pane pane;
    
    @FXML
    private Pane paneTelas;
    @FXML
    private AnchorPane paneTelaAtual;

    @FXML
    public void cadastrarViagem() {
        paneTelas.getChildren().clear();            
            
        try {
            
            pane = FXMLLoader.load(getClass().getResource("/br/uag/ufrpe/IU/telas/TelaCadastroViagem.fxml"));
            paneTelas.getChildren().addAll(pane);            
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    @FXML
    public void alterarViagem() {
        paneTelas.getChildren().clear();            
            
        try {
            
            pane = FXMLLoader.load(getClass().getResource("/br/uag/ufrpe/IU/telas/TelaProcurarAlterarRemoverViagem.fxml"));
            paneTelas.getChildren().addAll(pane);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }

    @FXML
    public void removerViagem() {
        paneTelas.getChildren().clear();            
            
        try {
            pane = FXMLLoader.load(getClass().getResource("/br/uag/ufrpe/IU/telas/TelaProcurarAlterarRemoverViagem.fxml"));
            paneTelas.getChildren().addAll(pane);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    @FXML
    public void procurarViagem() {
        paneTelas.getChildren().clear();            
            
        try {
            pane = FXMLLoader.load(getClass().getResource("/br/uag/ufrpe/IU/telas/TelaProcurarViagem.fxml"));
            paneTelas.getChildren().addAll(pane);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    @FXML
    public void listarViagens() {
        paneTelas.getChildren().clear();            
            
        try {
            pane = FXMLLoader.load(getClass().getResource("/br/uag/ufrpe/IU/telas/TelaListagemViagens.fxml"));
            paneTelas.getChildren().addAll(pane);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    @FXML
    public void gerenciarDescontoPassagens() {
        paneTelas.getChildren().clear();            
            
        try {
            pane = FXMLLoader.load(getClass().getResource("/br/uag/ufrpe/IU/telas/TelaGerenciarDescontoPassagens.fxml"));
            paneTelas.getChildren().addAll(pane);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    @FXML
    public void buscarInformacoesPassageiro() {
        paneTelas.getChildren().clear();            
            
        try {
            pane = FXMLLoader.load(getClass().getResource("/br/uag/ufrpe/IU/telas/TelaInformacoesViagensPassageiro.fxml"));
            paneTelas.getChildren().addAll(pane);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    @FXML
    public void porcentagemPassageirosViagem() {
        paneTelas.getChildren().clear();            
            
        try {
            pane = FXMLLoader.load(getClass().getResource("/br/uag/ufrpe/IU/telas/TelaPorcentagemPassageirosViagens.fxml"));
            paneTelas.getChildren().addAll(pane);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    @FXML
    public void porcentagemLancheViagem() {
        paneTelas.getChildren().clear();            
            
        try {
            pane = FXMLLoader.load(getClass().getResource("/br/uag/ufrpe/IU/telas/TelaPorcentagemLancheViagens.fxml"));
            paneTelas.getChildren().addAll(pane);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    @FXML
    public void lucroViagens() {
        paneTelas.getChildren().clear();            
            
        try {
            pane = FXMLLoader.load(getClass().getResource("/br/uag/ufrpe/IU/telas/TelaLucroViagens.fxml"));
            paneTelas.getChildren().addAll(pane);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
    
    @FXML
    public void informacoesViagem() {
        paneTelas.getChildren().clear();            
            
        try {
            pane = FXMLLoader.load(getClass().getResource("/br/uag/ufrpe/IU/telas/TelaInformacoesViagem.fxml"));
            paneTelas.getChildren().addAll(pane);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
    
    @FXML
    public void venderCancelarPassagem() {
        paneTelas.getChildren().clear();            
            
        try {
            pane = FXMLLoader.load(getClass().getResource("/br/uag/ufrpe/IU/telas/TelaVenderCancelarPassagem.fxml"));
            paneTelas.getChildren().addAll(pane);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
    
    @FXML
    public void listarPassageirosViagem() {
        paneTelas.getChildren().clear();            
            
        try {
            pane = FXMLLoader.load(getClass().getResource("/br/uag/ufrpe/IU/telas/TelaListarPassageirosViagem.fxml"));
            paneTelas.getChildren().addAll(pane);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
    
    @FXML
    public void listarPoltronasViagem() {
        paneTelas.getChildren().clear();            
            
        try {
            pane = FXMLLoader.load(getClass().getResource("/br/uag/ufrpe/IU/telas/TelaListarPoltronasViagem.fxml"));
            paneTelas.getChildren().addAll(pane);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    @FXML
    public void cadastrarFuncionario(ActionEvent event) {
        paneTelas.getChildren().clear(); 
        
        try {
            pane = FXMLLoader.load(getClass().getResource("/br/uag/ufrpe/IU/telas/TelaCadastrarFuncionario.fxml"));
            paneTelas.getChildren().addAll(pane);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    void procurarFuncionario(ActionEvent event) {
        paneTelas.getChildren().clear(); 
        
        try {
            pane = FXMLLoader.load(getClass().getResource("/br/uag/ufrpe/IU/telas/TelaAlterarFuncionario.fxml"));
            paneTelas.getChildren().addAll(pane);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    void removerFuncionario(ActionEvent event) {
        paneTelas.getChildren().clear(); 
        
        try {
            pane = FXMLLoader.load(getClass().getResource("/br/uag/ufrpe/IU/telas/TelaRemoverFuncionario.fxml"));
            paneTelas.getChildren().addAll(pane);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    void listagemFuncionarios(ActionEvent event) {
        paneTelas.getChildren().clear(); 
        
        try {
            pane = FXMLLoader.load(getClass().getResource("/br/uag/ufrpe/IU/telas/TelaListagemFuncionarios.fxml"));
            paneTelas.getChildren().addAll(pane);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
