/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyecto;

import dsproyecto.views.Login;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author medin
 */
public class DSProyecto extends Application{

    /**
     * @param args the command line arguments
     */
   
    Pane root=new Pane();
    Scene scene ;
    public static void main(String[] args) {
        launch(args);
    }

   
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        root= (new Login()).getRoot();
        
        scene = new Scene(root);
        primaryStage.setTitle("DS");
        primaryStage.setScene(scene);
        primaryStage.show();
   
    }
    
}
