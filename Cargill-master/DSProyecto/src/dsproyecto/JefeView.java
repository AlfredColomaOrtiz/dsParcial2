
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyecto.views;

import java.sql.Connection;
import javafx.scene.control.Button;
import javafx.scene.layout.*;

/**
 *
 * @author coloma
 */
class JefeView {
    Connection con;
    VBox root=new VBox();
    HBox arriba = new HBox();
    Pane abajo = new Pane();
    
    //botones
    Button btn_solicitarEnvio=new Button("Solicitar Envio");
    Button btn_solicitarAbastecimiento=new Button("Solicitar Abastecimiento");
    Button crearOrdenDeAbastecimiento=new Button("Crear orden de abastecimiento");
    Button btn_PantallaEnvios=new Button("Envios");
    Button btn_RegistrodeReporte=new Button("registro de reportes");
    Button btn_PermisosExtra=new Button("permisos extras");
    
    public JefeView(Connection con){
        this.con=con;
        
        
        btn_solicitarEnvio.setOnAction(e->{
            SeleccionarVenta();
        });
        
        btn_solicitarAbastecimiento.setOnAction(e->{
            SeleccionarAbastecimiento();
        });
        
        crearOrdenDeAbastecimiento.setOnAction(e->{
            IngresarDatos();
        });
        
        btn_PantallaEnvios.setOnAction(e->{
            DatosEnvios();
        });
        
        btn_RegistrodeReporte.setOnAction(e->{
            IngresarDatosExtra();
        });
        
        btn_PermisosExtra.setOnAction(e->{
            System.out.print("este no se que hace :v");
        });
        
        arriba.getChildren().addAll(btn_solicitarEnvio,btn_solicitarAbastecimiento,crearOrdenDeAbastecimiento,
                btn_PantallaEnvios,btn_RegistrodeReporte,btn_PermisosExtra);
        
        root.getChildren().addAll(arriba,abajo);
    }
    
    

    VBox getRoot() {
        return root;
    }

    private void SeleccionarVenta() {
        abajo.getChildren().clear();
        abajo.getChildren().addAll(new Button("aqui deberian salir la lista de ventas o algo asi"));
    }

    private void SeleccionarAbastecimiento() {
        abajo.getChildren().clear();
        abajo.getChildren().addAll(new Button("abastecimiento"));
    }

    private void IngresarDatos() {
        abajo.getChildren().clear();
        abajo.getChildren().addAll(new Button("IngresarDatos"));
    }

    private void DatosEnvios() {
        abajo.getChildren().clear();
        abajo.getChildren().addAll(new Button("DatosEnvios"));
    }

    private void IngresarDatosExtra() {
        abajo.getChildren().clear();
        abajo.getChildren().addAll(new Button("IngresarDatosExtra"));
    }
}
