/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uag.ufrpe.IU.controladores;

import br.uag.ufrpe.negocio.entidades.Motorista;
import br.uag.ufrpe.negocio.entidades.Onibus;
import br.uag.ufrpe.negocio.fachada.FachadaGerente;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author michel
 */
public class AlterarOnibusController implements Initializable {
    
    private FachadaGerente fachadaGerente;

    @FXML
    private TextField placaOnibus;
    @FXML
    private Label erroEntrada;
    @FXML
    private TextField cpfMotorista;
    @FXML
    private TextField totalPoltronas;
    @FXML
    private TextField poltronasConvencionais;
    @FXML
    private TextField poltronasObeso;
    @FXML
    private TextField poltronasReclinaveis;
    @FXML
    private TextField poltronasTotalReclinaveis;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    public AlterarOnibusController(){
        fachadaGerente = fachadaGerente.getFachadaGerente();
    }

    @FXML
    private void procurarOnibus(ActionEvent event) {
        
                        
        /*Alert alertaErro = new Alert(Alert.AlertType.ERROR);
        alertaErro.setTitle("Erro");
        alertaErro.setHeaderText("Passagem não existe");
        
        Alert alertaConfirmacao = new Alert(Alert.AlertType.CONFIRMATION);
        alertaConfirmacao.setTitle("Confirmação");
        alertaConfirmacao.setHeaderText("ALterado com sucesso!");
        
        boolean verificaAlterarOnibus;
        
        String placa = placaOnibus.getText();
        
        if(codigo.isEmpty()){
           System.out.println("oiiii");
            erroEntrada.setText("Entrada Vazia");
            verificaAlterarOnibus = false;
           
        }
       else{
           System.out.println("lllll");
           erroEntrada.setText("");
           verificaAlterarOnibus = true;
       }
        
        if(verificaAlterarOnibus){
            try{
                Onibus verificaOnibus = fachadaGerente.procurarOnibus(placa);
                
                if(verificaOnibus != null){
                    Motorista motorista = verificaOnibus.getMotorista();
                    
                    cpfMotorista.setText(motorista.getCpf());
                    
                    placaOnibus.setText(placa);
                    
                    totalPoltronas.setText(Integer.parseInt(verificaOnibus.getTotalPoltronas()));
                    
                    
                    
                }
            }
            catch(Exception ex){
                
            }
        }
    }

    @FXML
    private void alterarOnibus(ActionEvent event) {
    }

    @FXML
    private void removerOnibus(ActionEvent event) {
    }*/
    
}
    
}
