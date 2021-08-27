/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owners;

/**
 *
 * @author 503
 */
public class Empleador {
    // VARIANLES=ATRIBUTOS=DATOS
    
    public String nombre;
    public int nit;
    public String direccion;
    public String telefono;
    
    // METODOS=FUNSIONES=ACCIONES

    public Empleador() {
        
        
    }

    public Empleador(String nombre, int nit, String direccion, String telefono) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    
    
}
