package br.uag.ufrpe.IU.controladores;

import br.uag.ufrpe.negocio.fachada.FachadaFuncionario;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Jackson
 */
public class CadastrarPassageiroController implements Initializable {
    
    private final FachadaFuncionario fachadaFuncionario;
    
    @FXML
    private TextField labelPassageiroNome;

    @FXML
    private TextField labelPassageiroTelefone;

    @FXML
    private Text tituloCadastroPassageiro;

    @FXML
    private DatePicker labelPassageiroDataNascimento;

    @FXML
    private Button buttomCadastrar;

    @FXML
    private TextField labelPassageiroRg;
    
    @FXML
    private Label erroRg;

    @FXML
    private RadioButton labelPassageiroIdJovem;

    @FXML
    private ToggleGroup IdJovem;

    @FXML
    private TextField labelPassageiroCpf;
    
    @FXML
    private Label erroCpf;
    
    @FXML
    public void cadastrarPassageiro(ActionEvent event){
        String nomeCompleto = labelPassageiroNome.getText();
        String cpf = labelPassageiroCpf.getText();
        String rg = labelPassageiroRg.getText();
        String telefone = labelPassageiroTelefone.getText();
        boolean idJovem;
    
    
        if(labelPassageiroIdJovem.isSelected()){
            idJovem = true;
        }
        idJovem = false;
        
        if(cpf.length() < 11 && cpf.isEmpty() ){
            erroCpf.setText("CPF invalido");
        }
        
        if(rg.isEmpty()){
            erroRg.setText("RG invalido");
        }
        
    }
    
    public CadastrarPassageiroController(FachadaFuncionario fachadaFuncionario) {
        this.fachadaFuncionario = fachadaFuncionario;
    }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
