
package kuis;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;



public class FXMLDocumentController implements Initializable {
    
   
    
    
   @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private DatePicker tanggal;

    @FXML
    private TextField harga;

    @FXML
    private Button simpan;

    @FXML
    private ComboBox<String> jenis;

    @FXML
    private TextField merek;

    @FXML
    private TextField ukuran;

    @FXML
    void initialize() {
        assert tanggal != null : "fx:id=\"tanggal\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert harga != null : "fx:id=\"harga\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert simpan != null : "fx:id=\"simpan\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert jenis != null : "fx:id=\"jenis\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert merek != null : "fx:id=\"merek\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert ukuran != null : "fx:id=\"warna\" was not injected: check your FXML file 'FXMLDocument.fxml'.";

    }
    
    
   
    @FXML
    private void handleButtonAction(ActionEvent event) throws SQLException {
       
        SSDDataModel datamodel = new SSDDataModel();
        
       ssd vga = new ssd();
       vga.setTanggal_pembelian(tanggal.getValue().toString());
       vga.setMerek(merek.getText());
       vga.setHarga(Integer.parseInt(harga.getText()));
       vga.setJenis(jenis.getValue());
       vga.setUkuran(ukuran.getText());
       
       datamodel.addVGAcard(vga);
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       ArrayList <String> list = new ArrayList<String>();
        list.add("ssd sata");
        list.add("ssd M.2 NVMe");
        list.add("ssd PCIe");
        list.add("ssd 2,5 inch");
        ObservableList items = FXCollections.observableArrayList(list);
        jenis.setItems(items);
        
        
        
    }    
}
