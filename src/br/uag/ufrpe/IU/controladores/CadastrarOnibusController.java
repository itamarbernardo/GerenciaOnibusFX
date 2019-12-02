/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uag.ufrpe.IU.controladores;

import br.uag.ufrpe.negocio.entidades.Endereco;
import br.uag.ufrpe.negocio.entidades.Funcionario;
import br.uag.ufrpe.negocio.entidades.Motorista;
import br.uag.ufrpe.negocio.excecoes.funcionario.FuncionarioNaoEncontradoException;
import br.uag.ufrpe.negocio.excecoes.motorista.MotoristaNaoExisteException;
import br.uag.ufrpe.negocio.fachada.FachadaGerente;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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
    private void CadastrarOnibus(ActionEvent event) throws FuncionarioNaoEncontradoException, MotoristaNaoExisteException {
        
        Alert alertaErro = new Alert(Alert.AlertType.ERROR);
        alertaErro.setTitle("Erro");
        alertaErro.setHeaderText("Erro ao preencher os dados");
        
        Alert alertaConfirmacao = new Alert(Alert.AlertType.CONFIRMATION);
        alertaConfirmacao.setTitle("Confirmação");
        alertaConfirmacao.setHeaderText("Passagem Cadastrada com sucesso!");
        
        boolean verificaOnibus = true;
        
        String carteira = motorista.getText();
        String placa = PlacaOnibus.getText();        
        String Tpoltronas = TotalPoltronas.getText();
        
                
        if( carteira.isEmpty() || !carteira.matches("[0-9]*") ){
            alertaErro.setContentText("Digite apenas números no campo Motorista");
            alertaErro.show();
            verificaOnibus = false;
            return;
        }
        System.out.println("OIII");
        
        Motorista verificaCarteira = null; 
        
        //Endereco t = new Endereco("aaa", "ssss", "5555", "55", "jkhg", "bonito", "pe");
        //Motorista test = new Motorista("maria jose","12678721442", "9999999", "999999", "jdbajhsbc",t);
       /*try{
            verificaCarteira = fachadaGerente.procurarMotorista(carteira);
            
       } 
       catch(Exception ex){
           System.out.println("yyyyyyy");
       }
        System.out.println(verificaCarteira);
        
        
        if(verificaCarteira == null){
            
            alertaErro.setContentText("Erro! MOTORISTA NÃO EXISTE");
            alertaErro.show();
            verificaOnibus = false;
            return;
        }*/
        int Poltronas = 0;
        
        try{
            Poltronas = Integer.parseInt(Tpoltronas);
            verificaOnibus = true;
        }catch(Exception ex){
            alertaErro.setContentText("Digite apenas Números");
            alertaErro.show();
            verificaOnibus = false;
        }
        
        if(Poltronas < 20){
            alertaErro.setContentText("Erro! Números de TOTAL POLTRONAS não atingiu o limite mínimo de poltronas(20)");
            alertaErro.show();
            verificaOnibus = false;
            return; 
        }
        
        List<Integer> poltronasObeso = new ArrayList<>();
        poltronasObeso.add(1);
        poltronasObeso.add(3);
        
    
        List<Integer> poltronasReclinavel = new ArrayList<>();
        poltronasReclinavel.add(9);
        poltronasReclinavel.add(10);
        poltronasReclinavel.add(11);
        poltronasReclinavel.add(12);
        
        List<Integer> poltronasTotalReclinavel = new ArrayList<>();
        poltronasTotalReclinavel.add(17);
        poltronasTotalReclinavel.add(18);
        poltronasTotalReclinavel.add(19);
        poltronasReclinavel.add(20);
        
        
        if(verificaOnibus){
            try{
                fachadaGerente.adicionarOnibus(verificaCarteira, placa, Poltronas, poltronasObeso, poltronasTotalReclinavel, poltronasReclinavel);
                alertaConfirmacao.setHeaderText("Passagem Cadastrada com sucesso!");
                alertaConfirmacao.show();
                
            }catch(Exception ex){
                alertaErro.setContentText("Erro! Verifique seus dados");
                alertaErro.show();
            }
        }
        
        else{
            alertaErro.setContentText("Erro! Verifique seus dados");
            alertaErro.show();
        }
        
        

    }

    @FXML
    private void Voltar(ActionEvent event) {
    }
    
}
