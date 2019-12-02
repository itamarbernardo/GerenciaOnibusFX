/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.uag.ufrpe.IU.controladores;

import br.uag.ufrpe.negocio.entidades.Funcionario;
import br.uag.ufrpe.negocio.fachada.FachadaGerente;
import java.awt.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author GABRIEL
 */
public class LoginController implements Initializable {
    private FachadaGerente fachadaGerente;
    
    @FXML
    private Label senha;

    @FXML
    private TextField txtSenha;

    @FXML
    private TextField txtLongin;

    @FXML
    private RadioButton labelGerente;

    @FXML
    private Button entrar;

    @FXML
    private ToggleGroup grup;

    @FXML
    private Label erroCpf;

    @FXML
    private Label longin;

    @FXML
    private Label erroSenha;

     public LoginController(){
        fachadaGerente = FachadaGerente.getFachadaGerente();
    }  

    @FXML
    private void entrar(ActionEvent event) {
        Alert alertaErro = new Alert(Alert.AlertType.ERROR);
        alertaErro.setTitle("Erro");
        alertaErro.setHeaderText("Erro ao preencher os dados");
        
        Alert alertaConfirmacao = new Alert(Alert.AlertType.CONFIRMATION);
        alertaConfirmacao.setTitle("CONFIRMAÇÃO");
        alertaConfirmacao.setHeaderText("Autenticado!");
        
        String cpf = txtLongin.getText();
        String senha = txtSenha.getText();
        boolean gerente = true; 
        Funcionario funcionario; 
        Funcionario func;
        boolean verifica = true; 
        
         if(labelGerente.isSelected()){
            gerente = true;
        } 
         if(cpf.length() < 11 || cpf.isEmpty() || !cpf.matches("[0-9]*")){
            erroCpf.setText("Longin invalido");
            verifica = false;
        }
          if(senha.length() < 3 || senha.isEmpty()){
            erroSenha.setText("Senha invalida ou muito curta");
            verifica = false;
        }
           try {
                funcionario = fachadaGerente.procurarFuncionario(cpf);
                func = fachadaGerente.autenticaFuncionario(senha);
                if(funcionario != null || func != null){
                    alertaConfirmacao.setAlertType(Alert.AlertType.CONFIRMATION);
                    alertaConfirmacao.setContentText("Autenticado");
                    alertaConfirmacao.show();
                }else {
                alertaErro.setContentText("Usuário não encontrada!");
                alertaErro.show();
            }
         } catch (Exception ex) {
            ex.printStackTrace();
            alertaErro.setContentText(ex.getMessage());
            alertaErro.show();
        }
          
    }
    
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
}
