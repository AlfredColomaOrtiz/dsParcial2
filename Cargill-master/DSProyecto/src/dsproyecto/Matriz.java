/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyecto;

import java.util.ArrayList;

/**
 *
 * @author BadLi
 */
public class Matriz implements iEstablecimiento {

    
    ArrayList<Sucursal>  Sucursales;
    ArrayList<Bodega>  Bodegas;
    ArrayList<iUsuario> personal;
    
    void matriz(){

    }
    Matriz Matriz(){
        return null;
    }

    @Override
    public ArrayList<Articulo> getInventario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<iUsuario> getPersonal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int buscarItem(Articulo articulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
