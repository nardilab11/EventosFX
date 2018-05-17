/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class Eventos extends Application {
    
    private Stage stage;
    private Scene escena1;
    private Scene escena2;

    @Override
    public void start(Stage stage) throws Exception {
        Label label1 = new Label("Nombre");
        Label label2 = new Label("Apellido");
        TextField textfield1 = new TextField();
        TextField textfield2 = new TextField();
        Button button1 = new Button("Registrar");
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("Menu 1");
        MenuItem menuItem = new MenuItem("Item 1");
        menu.getItems().add(menuItem);
        menuBar.getMenus().add(menu);
        Label labelScene2 = new Label("Escena 2");
        Button bS2 = new Button("Regresar");
        HBox hbox = new HBox(labelScene2, bS2);
        
        Label mensajeBt = new Label(); //No se puede de una porque no se sabe si ya ingresó en el campo de texto
        
        button1.setOnAction(new EventHandler<ActionEvent>(){ //Con anonymous inner class

            @Override
            public void handle(ActionEvent event) {
                mensajeBt.setText("Hola " + textfield1.getText() +  " " + textfield2.getText());
            }
 
        });
        
        class ItemHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            
        }
    
       };
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        pane.add(label1, 0, 0);
        pane.add(textfield1, 1, 0);
        pane.add(label2, 0, 1);
        pane.add(textfield2, 1, 1);
        pane.add(button1, 2, 2);
        pane.add(mensajeBt, 0, 3);
        
        BorderPane bpane = new BorderPane();
        bpane.setTop(menuBar);
        bpane.setCenter(pane);
        
        this.escena1 = new Scene(bpane, 350, 350);
        
        stage.setTitle("Eventos");
        stage.setScene(escena1);
        //Para cambiar de scene hago setScene(scene2) cuando pasa alfo if
        stage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
