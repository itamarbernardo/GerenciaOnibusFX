/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uag.ufrpe.IU.controladores;

import br.uag.ufrpe.negocio.excecoes.viagem.ViagemNaoExisteException;
import br.uag.ufrpe.negocio.fachada.FachadaFuncionario;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.MapValueFactory;
import javafx.scene.control.cell.PropertyValueFactory;
import static javafx.scene.input.KeyCode.K;
import static javafx.scene.input.KeyCode.V;
import javafx.util.Callback;
import static jdk.nashorn.internal.objects.NativeObject.keys;

/**
 * FXML Controller class
 *
 * @author Itamar Jr
 */
public class ListarPoltronasViagemController implements Initializable {

    private FachadaFuncionario fachadaFuncionario;

    @FXML
    private TableView tableViewPoltronas;
    

    @FXML
    private TableColumn<Map, Integer> colunaCodigoPoltrona;

    @FXML
    private TableColumn<Map, String> colunaTipoPoltrona;

    @FXML
    private TextField txtCodigoViagem;

    private Map<Integer, String> poltronas;

    //private ObservableMap<Integer, String> observablePoltronas;

    private ObservableList<Map> observablePoltronas;

    
    public ListarPoltronasViagemController() {
        this.fachadaFuncionario = FachadaFuncionario.getFachadaFuncionario();
    }

    public void preencherTabela(ActionEvent event) {
        Alert alertaErro = new Alert(Alert.AlertType.ERROR);
        alertaErro.setTitle("Erro");
        alertaErro.setHeaderText("Erro ao preencher os dados");
        int codigo = -1;

        try {
            codigo = Integer.parseInt(txtCodigoViagem.getText());
        } catch (Exception ex) {
            ex.printStackTrace();
            alertaErro.setContentText("Digite apenas números!");
            alertaErro.show();
        }
        if (codigo != -1) {
            try {
                colunaCodigoPoltrona.setCellValueFactory(new MapValueFactory("Key"));
                colunaTipoPoltrona.setCellValueFactory(new MapValueFactory("Value"));

                poltronas = fachadaFuncionario.listaPoltronasDaViagem(codigo);

                observablePoltronas = FXCollections.observableArrayList(poltronas);
                tableViewPoltronas.setItems(observablePoltronas);
            } catch (ViagemNaoExisteException ex) {
                ex.printStackTrace();
                alertaErro.setContentText(ex.getMessage());
                alertaErro.show();
            }

        }
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
