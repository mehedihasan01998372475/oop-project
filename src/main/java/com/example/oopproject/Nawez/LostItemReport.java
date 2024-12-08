package com.example.oopproject.Nawez;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class LostItemReport
{
    @javafx.fxml.FXML
    private TextField Visitorid;
    @javafx.fxml.FXML
    private TableColumn<Securityguardlostitemreport,String> Visitornamecol;
    @javafx.fxml.FXML
    private TextField Reportlog;
    @javafx.fxml.FXML
    private TableColumn<Securityguardlostitemreport,Integer> Visitoridcol;
    @javafx.fxml.FXML
    private TextField Sgid;
    @javafx.fxml.FXML
    private TextField Visitorname;
    @javafx.fxml.FXML
    private TableView<Securityguardlostitemreport> showlostitemsreportid;
    @javafx.fxml.FXML
    private TableColumn<Securityguardlostitemreport,String> Sgnamecol;
    @javafx.fxml.FXML
    private TextField Sgname;
    @javafx.fxml.FXML
    private TableColumn<Securityguardlostitemreport,Integer> Sgidcol;
    @javafx.fxml.FXML
    private TableColumn<Securityguardlostitemreport,String> ReportlogCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleSubmitreport(ActionEvent actionEvent) {

            ObservableList<Securityguardlostitemreport> showlostitemreport = FXCollections.observableArrayList();
            Sgidcol.setCellValueFactory(new PropertyValueFactory<Securityguardlostitemreport,Integer>("sgid"));
            Sgnamecol.setCellValueFactory(new PropertyValueFactory<Securityguardlostitemreport,String>("sgname"));
            Visitoridcol.setCellValueFactory(new PropertyValueFactory<Securityguardlostitemreport,Integer>("visitorid"));
            Visitornamecol.setCellValueFactory(new PropertyValueFactory<Securityguardlostitemreport,String>("visitorname"));
            ReportlogCol.setCellValueFactory(new PropertyValueFactory<Securityguardlostitemreport,String>("Reportlog"));

    showlostitemsreportid.setItems(showlostitemreport);

        }

    }
