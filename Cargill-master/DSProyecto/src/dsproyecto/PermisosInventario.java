/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyecto;

/**
 *
 * @author MatheusJLV
 */
public class PermisosInventario implements Chain{
    
    private Chain nextInChain; 

    @Override
    public void setNext(Chain nextInChain) {
        this.nextInChain=nextInChain;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Buscar(String objetivo, String parametro, String referencia) {
        if(objetivo.equalsIgnoreCase("Articulo")){
            
        } else{
            nextInChain.Buscar(objetivo, parametro, referencia);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Crear(Object o) {
        if(o.getClass()!=Articulo.class){
            nextInChain.Crear(o);
        } else{
            
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Actualizar(Object o1, Object o2) {
        if(o1.getClass()==o2.getClass()){
           if(o1.getClass()==Articulo.class){
            
            } else{
                nextInChain.Actualizar(o1, o2);
            } 
        }
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
