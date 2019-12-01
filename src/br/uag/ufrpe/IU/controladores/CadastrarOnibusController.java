/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uag.ufrpe.IU.controladores;

import br.uag.ufrpe.negocio.entidades.Funcionario;
import br.uag.ufrpe.negocio.entidades.Motorista;
import br.uag.ufrpe.negocio.excecoes.funcionario.FuncionarioNaoEncontradoException;
import br.uag.ufrpe.negocio.fachada.FachadaGerente;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author miyyu
 */
public class CadastrarOnibusController implements Initializable {
    
    private FachadaGerente fachadaGerente;

    @FXML
    private TextField PlacaOnibus;
    @FXML
    private TextField TotalPoltronas;
    @FXML
    private TextField motorista;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void CadastrarOnibus(ActionEvent event) throws FuncionarioNaoEncontradoException {
        
        Alert alertaErro = new Alert(Alert.AlertType.ERROR);
        alertaErro.setTitle("Erro");
        alertaErro.setHeaderText("Erro ao preencher os dados");
        
        Alert alertaConfirmacao = new Alert(Alert.AlertType.CONFIRMATION);
        alertaConfirmacao.setTitle("Confirmação");
        alertaConfirmacao.setHeaderText("Passagem Cadastrada com sucesso!");
        
        boolean verificaPassagem = true;

        String cpf = motorista.getText();
        
        if(cpf.length() < 11 || cpf.isEmpty() || !cpf.matches("[0-9]*") ){
            alertaErro.setContentText("Erro ao preencher os dados!");
            alertaErro.show();
            verificaPassagem = false;
        }
        
        Funcionario verificaCPF = fachadaGerente.procurarFuncionario(cpf);
        
        if(verificaCPF == null){
            alertaErro.setContentText("Erro! CPF não existe.");
            alertaErro.show();
            verificaPassagem = false;
        }
        
        
        
        PlacaOnibus.getText();        
        TotalPoltronas.getText();

    }

    @FXML
    private void Voltar(ActionEvent event) {
    }
    
}
